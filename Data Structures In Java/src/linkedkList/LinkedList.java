package linkedkList;

public class LinkedList<E> implements BhushanLnkliistInterface<E> {

	@SuppressWarnings("hiding")
	class Node<E> {

		E data;
		Node<E> next;

		public Node(E obj) {

			data = obj;
			next = null;

		}
	}

	private Node<E> head;
	private int currentSize;

	public LinkedList() {
		head = null;
		currentSize = 0;

	}

	public void addFirst(E obj) {
		System.out.println("Inside of Add First Method");
		Node<E> newNode = new Node<E>(obj);
		newNode.next = head;
		head = newNode;
		currentSize++;
	}

	public void addLast(E obj) {
		System.out.println("Inside of Add Last Method");
		Node<E> newNode = new Node<E>(obj);
		if (head == null) {
			// Empty list so make head point to new node and increment the current size
			head = newNode;
			currentSize++;
			return;

		}
		Node<E> temp = head;
		while (temp.next != null) {
			// iterate till we get the last element in list
			temp = temp.next;
		}
		temp.next = newNode;

		System.out.println(
				"The complexity to traverse the linked list is O(n) and that is where the tail pointer comes into the picture \n"
						+ "Which can provide O(1) complexity for the add Last method "
						+ "Which we will see in doubly linkl list implementation  ");

	}

	public void displayList() {

		System.out.println("Printing the List data : ");
		Node<E> temp = head;
		while (temp.next != null) {
			System.out.println("Data Element : " + temp.data);
			temp = temp.next;
		}
		System.out.println("Data Element : " + temp.data); // printing the last elemnt

	}

	public void removeFirst(E obj) {
		// TODO Auto-generated method stub

	}

	public void removeLast(E obj) {
		// TODO Auto-generated method stub

	}

	public void removeAndFind(E obj) {
		// TODO Auto-generated method stub

	}

	public void removePeek(E obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAndFind() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePeek() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		System.out.println("Calling main Method ");
		LinkedList<Integer> list = new LinkedList<Integer>();
		// list.addFirst(1);
		// list.addFirst(2);
		// list.addFirst(3);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.displayList();

	}

}
