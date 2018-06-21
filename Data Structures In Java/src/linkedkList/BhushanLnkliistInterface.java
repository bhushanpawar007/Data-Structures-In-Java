/**
 * 
 */
package linkedkList;

/**
 * @author Bhushan
 * @param <E>
 *
 */
public interface BhushanLnkliistInterface<E> {

	/*
	 * This method is use to add element from first Boundary conditions 1. Empty
	 * list 2.Only one element in the list 3.All other conditions will be eliminated
	 * as its just adding in first place
	 * 
	 * Algorithm : 1.Create new node 2.Point its next to the head 3.Then point the
	 * head to new node created Note: The pointer assignment sequence is most
	 * important
	 */
	public void addFirst(E obj);

	/*
	 * This method is use to add element at last position in the list Boundary
	 * conditions 1. Empty list -->Will get null pointer exception so make special
	 * exception 2.Only one element in the list 3.All other conditions will be
	 * eliminated as its just adding in first place
	 * 
	 * Algorithm : 1.Create new node 2.take temporary pointer and start traversing
	 * from head to the end of list using while loop 3.Assign temporary next to the
	 * new node created
	 */
	public void addLast(E obj);

	public void removeFirst();

	public void removeLast();

	public void removeAndFind();

	public void removePeek();
	
	public void displayList() ;


}
