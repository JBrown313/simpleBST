package solutions;

public class Tester {

	public static void main(String[] args) {
		NodeB first = new NodeB(13);
		BST tree = new BST(first);
		tree.insert(12);
		tree.insert(5);
		tree.insert(7);
		tree.insert(24);
		tree.insert(32);
		tree.insert(300);
		tree.insert(89);
		tree.insert(177);
		tree.inOrder(first);
		tree.deleteNode(first, 300);
		System.out.println("\n");
		tree.ppOrder(first);
		System.out.println("\n");
		System.out.println("\n");
		//Graph graph = new Graph();
		/*graph.insert(5);
		graph.insert(18);
		graph.insert(37);
		graph.insert(9);
		graph.insert(24);
		graph.insert(56);
		graph.map(37, 24);
		graph.map(24, 9);
		graph.map(5, 56);
		graph.map(56, 18);
		graph.map(9, 5);
		graph.map(18, 37);*/
		//graph.bfs(graph.nodes.get(0));

	}

}
