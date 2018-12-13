package tree;

import java.util.Stack;

public class BST {
	private class Node {
		int data ;
		Node left;
		Node right;	
		
		 Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	 Node root;
	BST(){
		root=null;
	}
		
	void insert(int data) {
		insertNonRec(root,data);
		
		
	}
	public Node insertRec(Node root,int data) {
		if (root==null) {
			root=new Node(data);
			return root;
		}
		
		if(data< root.data) {
				root.left=insertRec(root.left,data);	
		}
		else if(data>root.data){
			root.right=insertRec(root.right, data);
		}	
		return root;
	}
	
	public void insertNonRec(Node root,int data) {
		if (this.root==null) {
			this.root=new Node(data);
			return ;
		}
		Node current=root;
		Node prev=null;
		while (current!=null){
			if(data< current.data) {
				prev=current;
				current=current.left;
			}
			else if(data>current.data){
				prev=current;
				current=current.right;
			}	
		}
		if (data<prev.data) {
			prev.left=new Node(data);
		}
		else {
			
			prev.right=new Node(data);
		}
	
	}
	
	void inorder() {
		
		inorderRec(root);
		
	}	
		
	public void inorderRec(Node root) {
		
		if (root!=null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
		
	}
	
	public void inorderNonRec(Node root) {
		Stack traversed =new Stack();
		while(traversed.isEmpty()==false) {
			while(root!=null) {
				traversed.push(root);
				root=root.left;
			}
			root=(Node) traversed.pop();
			System.out.println(root.data);
			while(root!=null) {
				traversed.push(root);
				root=root.right;
			}
		}
	}

	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(1);
		bst.insert(3);
		bst.insert(10);
		bst.insert(8);
		bst.insert(7);
		bst.insert(28);
		bst.inorder();
	}
}
