package myjava;

import java.util.LinkedList;
import java.util.Queue;

class graph{
	int v;
	LinkedList<Integer> arr[];
	public graph(int v) {
		this.v = v;
//		int arr[] = new int[v];
		arr = new LinkedList[v];//arr can now store V LL
		for(int i=0;i<v;i++)
		{
			arr[i] = new LinkedList<>();
		}
	}
	void addEdge(int a,int b)
	{
		arr[a].add(b);
		arr[b].add(a); //if we want undirectional graph then both statements required
	}
	void print() {
		for(int i=0;i<v;i++) {
			System.out.println("Neighbours of "+i+" are: ");
			for(Integer  x:arr[i])
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	void BFS(int s)
	{
		System.out.println("-----BFS-----");
		boolean visited[] = new boolean[v];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while(!queue.isEmpty())
		{
			int temp = queue.poll();
			System.out.print(temp+" ");
			for(Integer x:arr[temp])
			{
				if(!visited[x])
				{
					queue.add(x);
					visited[x] = true;
				}
			}
		}
		System.out.println();
	}
	
	void DFS(int s)
	{
		boolean visited[] = new boolean[v];
		System.out.println("-----DFS-----");
		DFSUtil(s,visited);
		System.out.println();
	}
	void DFSOverall()
	{
		boolean visited[] = new boolean[v];
		System.out.println("-----DFS Overall-----");
		int count = 0;
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				count++;
				DFSUtil(i, visited);
				System.out.println();//print line after each component
			}
		}
		System.out.println("Total Components are: " + count);
	}
	void DFSUtil(int s, boolean visited[]) {
		visited[s]=true;
		System.out.print(s + " ");
		for(Integer x:arr[s])
		{
			if(!visited[x]) {
				DFSUtil(x, visited);				
			}				
		}
	}	
}

public class graphLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph graph = new graph(8);
		graph.addEdge(0, 1);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.addEdge(5, 6);
		graph.print();
		graph.BFS(0);
		graph.BFS(3);
		graph.BFS(2);
		graph.DFS(0);
		graph.DFS(3);
		graph.DFS(4);
		graph.DFSOverall();
	}

}