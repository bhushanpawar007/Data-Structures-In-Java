package tree;

public class BinarySearchTreeWihoutGenerics {

	class Node{
		int data ;
		Node left;
		Node right;
	
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
	}
	
	Node root;
	
	public BinarySearchTreeWihoutGenerics() {
		root=null;
	}
	public int addNode(int data) {
		Node temp=root;
		if (root==null) {
			Node newNode =new Node(data);
			root=newNode;
		}
		else {
			if (data >=temp.data) {
				return addNode(data);
			}
			else {
				return addNode(data);
			}
			
			
		}
		return data;
			
	}
	
	/*public void displayTreeInorder() {
		
		if (temp==null) {
			
			return;
		}
		else {
			
			displayTreeInorder(temp.left);
			System.out.println(temp.data);
			displayTreeInorder(temp.right);
		}
		
		
	}
	*/
	public static void main(String[] args) {
		BinarySearchTreeWihoutGenerics bst=new BinarySearchTreeWihoutGenerics();
		bst.addNode( 1);
		bst.addNode( 2);
		bst.addNode(3);
		bst.addNode( 4);
		bst.addNode(5);
		System.out.println(bst.root.data);
		//bst.displayTreeInorder(bst.root);
	}

}
