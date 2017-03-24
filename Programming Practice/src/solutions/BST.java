package solutions;

public class BST {
	NodeB root;
	
	public BST(NodeB r)
	{
		root = r;
	}
	
	
	private void insert(NodeB head, NodeB n)
	{	
		if(n.number < head.number)
		{
			if(head.left == null)
				head.left = n;
			else
				insert(head.left,n);
		}
		else if(n.number > head.number)
		{
			if(head.right == null)
				head.right = n;
			else
				insert(head.right,n);
		}
	}
	
	public void insert(int x)
	{
		NodeB newNode = new NodeB(x);
		this.insert(root, newNode);
	}
	
	public NodeB deleteNode(NodeB root, int key) {
		    if(root == null){
		        return null;
		    }
		    if(key < root.number){
		        root.left = deleteNode(root.left, key);
		    }else if(key > root.number){
		        root.right = deleteNode(root.right, key);
		    }else{ //found
		        if(root.left == null){
		            return root.right;
		        }else if(root.right == null){
		            return root.left;
		        }
		        
		        NodeB minNode = findMin(root.right);
		        root.number = minNode.number;
		        root.right = deleteNode(root.right, root.number);
		    }
		    return root;
		}

	private NodeB findMin(NodeB node){
		    while(node.left != null){
		        node = node.left;
		    }
		    return node;
	}
	
	private NodeB findMax(NodeB node){
	    while(node.right != null){
	        node = node.right;
	    }
	    return node;
	}
	
	private void visit(NodeB j)
	{
		System.out.print(j.number + " ");
	}
	
	public void inOrder(NodeB node)
	{
		if(node != null)
		{
			inOrder(node.left);
			visit(node);
			inOrder(node.right);
		}
	}
	
	public void pOrder(NodeB node)
	{
		if(node != null)
		{
			visit(node);
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	
	public void ppOrder(NodeB node)
	{
		if(node != null)
		{
			inOrder(node.left);
			inOrder(node.right);
			visit(node);
		}
	}

}
