package myjava;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class GraphSM{
	HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
	void addVertex(int data)
	{
		if(graph.containsKey(data))
		{
			System.out.println("Error: Vertex exists");
			return;
		}
		graph.put(data, new HashSet<>());
	}
	void addEdge(int a,int b)
	{
		//Add B to the set of A
//		graph.get(a);// this is a set
		graph.get(a).add(b);
	}
	void print() {
		System.out.println("Vertices are: "+graph.keySet());
		for(Integer x:graph.keySet()) {
			System.out.print("Neighbours of "+ x +" are - ");
			System.out.println(graph.get(x));
		}
	}
	void BFS(int s)
	{
		System.out.println("-----BFS-----");
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while(!queue.isEmpty())
		{
			int temp = queue.poll();
			System.out.print(temp+" ");
			for(Integer x:graph.get(temp))
			{
				if(!visited.contains(x))
				{
					queue.add(x);
					visited.add(x);
				}
			}
		}
		System.out.println();
	}
	void DFS(int s)
	{
		HashSet<Integer> visited = new HashSet<>();
		System.out.println("-----DFS-----");
		DFSUtil(s,visited);
		System.out.println();
	}
	void DFSUtil(int s, HashSet<Integer> visited) {
		visited.add(s);
		System.out.print(s + " ");
		for(Integer x:graph.get(s))
		{
			if(!visited.contains(x)) {
				DFSUtil(x, visited);				
			}				
		}
	}
}
public class GraphImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphSM g = new GraphSM();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addEdge(0, 1);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.print();
		g.addVertex(0);
		g.print();
		g.BFS(0);
		g.BFS(3);
		g.BFS(2);
		g.DFS(0);
		g.DFS(3);
		g.DFS(4);
	}

}