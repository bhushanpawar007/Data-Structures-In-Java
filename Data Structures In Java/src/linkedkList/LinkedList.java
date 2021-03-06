package linkedkList;

import java.util.Iterator;
import java.util.NoSuchElementException;

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

	@SuppressWarnings("hiding")
	class IteratorHelper<E> implements Iterator<E> {

		LinkedList<E>.Node<E> index;

		@SuppressWarnings("unchecked")
		public IteratorHelper() {

			index = (LinkedList<E>.Node<E>) head;
		}

		@Override
		public boolean hasNext() {
			return (index != null);
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException("List ended !!");
			}
			E val = index.data;
			index = index.next;
			return val;
		}

	}

	@Override
	public void addFirst(E obj) {
		System.out.println("Inside of Add First Method");
		Node<E> newNode = new Node<E>(obj);
		newNode.next = head;
		head = newNode;
		currentSize++;
	}

	@Override
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

	@Override
	public void displayList() {

		System.out.println("Printing the List data : ");
		/*
		 * Node<E> temp = head; if (head == null) { System.out.println("List is empty");
		 * return; } while (temp.next != null) { System.out.println("Data Element : " +
		 * temp.data); temp = temp.next; } System.out.println("Data Element : " +
		 * temp.data); // printing the last elemnt
		 */

		IteratorHelper<E> iter = new IteratorHelper<>();
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}

	}

	@Override
	public E removeFirst() {
		E temp = head.data;
		if (head == null) {
			System.out.println("List is empty");
			return null;
		} else {

			head = head.next; // The first element will not have any reference so it will automatically be
								// garbage collected
			currentSize--;
			return temp;
		}

	}

	@Override
	public E removeLast() {
		if (head == null) {
			return null;
		}
		Node<E> current = head, previous = null;

		while (current.next != null) {

			previous = current;
			current = current.next;
		}
		previous.next = null;
		currentSize--;
		return current.data;
		
	
		
		
	}

	@Override
	public E remove(E obj) {

		if (head == null) {
			System.out.println("List is Empty");
			return null;
		}
		Node<E> current = head, previous = null;
		while (current != null) {

			if ((current.data).equals(obj)) {
				if (current == head && current.next == null) {
					head = null;
					return current.data; // if its the first element
				}
				if (current == head) {
					head = head.next;
					return current.data; // if its the first element
				}
				previous.next = current.next; // if there are more than one element in the list
				current.next = null;
				return current.data;

			}

			previous = current;
			current = current.next;

		}

		return obj;

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
		System.out.println("After adding all the elements ...List will look like this ");
		list.displayList();
		// System.out.println("Removed this item from list : " + list.remove(new
		// Integer(2)));
		// System.out.println("Removed this item from list : " + list.remove(new
		// Integer(1)));
		System.out.println("Removed this item from list : " + list.remove(new Integer(3)));
		System.out.println("After removing the first element ..List will look like this ");
		list.displayList();

	}

}
