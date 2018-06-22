/**
 * 
 */
package linkedkList;

/**
 * @author Bhushan
 * @param <E>
 *
 */

/*
 * Boundry conditions 1.Empty List 2.Single Element 3.beginning Of List 4.End Of
 * list 5.Middle of list
 * 
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

	/*
	 * This method removes from the head Algorithm : 1. Check if the list is empty
	 * if yes then just return null don't do anything 2.But if not then Store the
	 * data object in temp variable and increment head pointer (it will cover one
	 * element case as well) but if we have tail pointer then we have to make tail
	 * null explicitly for one element list
	 */
	public E removeFirst();

	/*
	 * Have to traverse till the last node
	 * Use to pointers Previous and current where previous will be null first and current will point to first element 
	 * then traverse till end and then just set previous next to null 
	 *if empty list ruturn null 
	 * if only one element then just call removeFirst method 
	 * else traverse and then assign previous->next to null
	 */
	public E removeLast();

	public void removeAndFind();

	public void removePeek();

	public void displayList();

}
