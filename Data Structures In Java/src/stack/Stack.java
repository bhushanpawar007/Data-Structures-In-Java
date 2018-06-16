package stack;

import java.util.Arrays;

public class Stack {

	private String[] StackData;
	private int topOfStack;
	private int stackSize;

	public Stack(int size) {
		super();
		StackData = new String[size];
		stackSize = size;
		topOfStack = -1;
		Arrays.fill(StackData, "-1");
	}

	public void displayStack() {
		System.out.println("Displaying Stack ");

		for (int i = 0; i < stackSize; i++) {
			System.out.print("\t" + i + "\t|");

		}
		System.out.println("");
		System.out.print(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		for (int i = 0; i <= topOfStack; i++) {
			if (StackData[i] != "-1") {
				System.out.print("\t" + StackData[i]  + "\t|");
			}
		}
		System.out.println();

	}

	public String pop() {

		String toPop;
		if (topOfStack < 0) {
			return "Failed to pop the element ..Stack is already Empty ";

		} else {
			toPop = StackData[topOfStack];
			StackData[topOfStack]="-1";
			topOfStack--;
			return "poped the Element " + toPop + " from location :" + (topOfStack+1);

		}
	}

	public String push(String toPush) {

		if (topOfStack + 1 < stackSize) {
			topOfStack++;
			StackData[topOfStack] = toPush;

			return "Pushed the Element " + toPush + "At location :" + (topOfStack);
		} else {
			return "Failed to push the element ..Stack is already full ";
		}
	}

	public void pushMultiple(String multipleValues) {

		String [] toPush=multipleValues.split(" ");
		for(String item : toPush) {
			System.out.println(push(item));
		}
		
	}
	public void popAll() {

		
		for(int i=topOfStack;i>=0;i--) {
			System.out.println(pop());
		}
		
		
	}


	public void DiaplyPeek() {
		
		if (topOfStack < 0) {
			System.out.println( "Stack is already Empty ");

		} else {
			System.out.println("Peek  Element is : " + StackData[topOfStack] );

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stack Initiated !!");
		System.out.println("Filling array with the default values");
		Stack s = new Stack(10);
		s.displayStack();
		System.out.println(s.push("7"));
		System.out.println(s.push("8"));
		System.out.println(s.push("9"));
		System.out.println(s.push("10"));
		s.displayStack();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.displayStack();
		System.out.println("Single push and pop donee ..Now executing mutiple push and pop");
		s.pushMultiple("1 2 3 4 5 6 7");
		s.displayStack();
		System.out.println("The yop of the stack value aftermultiple pushe is : "+ s.topOfStack);
		s.popAll();
		s.displayStack();

	}

}
