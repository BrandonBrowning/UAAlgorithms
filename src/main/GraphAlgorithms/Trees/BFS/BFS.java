import java.util.*;

public class BFS
{
	// given the an array of nodes, will traverse the entire tree in a breadth
	// first search, starting from the node at graph[0]
	public void BFS(ArrayList<Node> graph)
	{
		ArrayList<Node> queue = new ArrayList<Node>();

		queue.add(graph.get(0));
		queue.get(0).visited = true; // so that we don't visit it again
		while(!queue.isEmpty())
		{
			Node cur_node = queue.remove(0);
			for(Node node : cur_node.children)
			{
				if(!node.visited)
				{
					queue.add(node);
					node.visited = true;
				}
			}
		}
	}

	public static class Node
	{
		public ArrayList<Node> children;
		public boolean visited = false;

		public Node(ArrayList<Node> childs)
		{
			this.children = new ArrayList<Node>(childs);
			this.visited = false;
		}
	}
}
