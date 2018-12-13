package tree;

public class BinarySearchTree<E> {
	private Node<E> root;
	private int currentSize;
	
	public BinarySearchTree(){
		root=null;
		currentSize=0;
	}
	class Node<E> {
		E data;
		Node left;
		Node right;
		
		
		public Node(E obj) {
			this.data=obj;
			left=right=null;
			
		}
	}

	@SuppressWarnings("unchecked")
	public E Insert(E obj ,  Node root) {
	
		if (((Comparable<E>)obj).compareTo(obj)>=0){
			//If the obj data is greater we will go to right side 
			if (root.right==null) {
				Node<E> newNode=new Node<E>(obj);
				root.right=newNode;
				return obj;
			}
			return (E) Insert(obj, root.right);
		}
		else {
			
			//go to left side 
			if (root.left==null) {
				Node<E> newNode=new Node<E>(obj);
				root.left=newNode;
				return obj;
			}
			return (E) Insert(obj, root.left);
		}
	}
	public void displayTree(Node<E> root) {
		
		if (root==null) {
			return ;
		}
		System.out.println(root.data);
		displayTree(root.left);
		displayTree(root.right);
		
	}

	public E Remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
