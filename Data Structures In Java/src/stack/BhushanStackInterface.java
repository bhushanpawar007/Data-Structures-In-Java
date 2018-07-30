package stack;

public interface BhushanStackInterface<E> {
	
	public void push(E obj) ;
	public void pushMultiple(E obj) ;
	public E  pop();
	public void popAll();
	public void displayStack();
	public void DiaplyPeek();
}
