package myjava;

import java.util.Scanner;

public class greedyalgos {
	static int findMinVertex(int distance[],boolean visited[])
	{
		int minVertex = -1;
		for(int i=0;i<distance.length;i++)
		{
			if(!visited[i] && (minVertex == -1 || distance[i]<distance[minVertex]))
			{
				minVertex = i;
			}
		}
		return minVertex;
	}
	static void dijkstras(int adjMatrix[][],int src)
	{
		int v = adjMatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		for(int i=0;i<v;i++)
		{
			distance[i] = Integer.MAX_VALUE;
		}
		distance[src] = 0;
		for(int i=0;i<v-1;i++)
		{
			int minVertex = findMinVertex(distance,visited);//find the minDistance vertex not yet visited
			visited[minVertex] = true;
			for(int j=0;j<v;j++)//neighbors traversing
			{
				if(adjMatrix[minVertex][j]!=0 && !visited[j])
				{
					int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
					if(newDistance<distance[j])
					{
						distance[j] = newDistance;
					}
				}
			}
		}
		System.out.print("Shortest path from source "+src+" are: ");
		for(int i=0;i<v;i++)
		{
			System.out.print(distance[i]+" ");
		}
		System.out.println();
	}
	static void prims(int adjMatrix[][], int src)
	{
		int v = adjMatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		int parent[] = new int[v];
		for(int i=0;i<v;i++)
		{
			distance[i] = Integer.MAX_VALUE;
		}
		distance[src] = 0;
		parent[src] = -1;
		for(int i=0;i<v-1;i++)
		{
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			for(int j=0;j<v;j++)
			{
				if(adjMatrix[minVertex][j]!=0 && !visited[j])
				{
					if(adjMatrix[minVertex][j]<=distance[j])
					{
						distance[j] = adjMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
		}
		int sum = 0;
		for(int i=0;i<v;i++)
		{
			sum = sum + distance[i];
		}
		System.out.println("MST Weight is: "+sum);
		for(int i=0;i<v;i++)
		{
			System.out.println("Parent of "+i+" is "+parent[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices: - ");
		int v =sc.nextInt();
		System.out.println("Enter number of Edges: - ");
		int e =sc.nextInt();
		int adjMatrix[][] = new int[v][v];
		System.out.println("Enter all the edges:- ");
		// v1 v2 w
		for(int i=0;i<e;i++)
		{
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int w = sc.nextInt();
			adjMatrix[v1][v2] = w;
			adjMatrix[v2][v1] = w;
		}
		dijkstras(adjMatrix,0);//Passing Graph & the Source
		dijkstras(adjMatrix,1);//Passing Graph & the Source
		prims(adjMatrix, 0);
	}

