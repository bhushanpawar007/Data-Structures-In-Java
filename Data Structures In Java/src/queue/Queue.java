package queue;

import java.util.Arrays;

public class Queue {

	String queueData[];
	private int sizeOfQueue;
	private int front, rear=-1;

	public Queue(int size) {
		super();
		queueData = new String[size];
		sizeOfQueue = size;
		Arrays.fill(queueData, "-1");

	}

	public void Insert(String toInsert) {
		if (rear + 1 < sizeOfQueue) {
			rear++;
			queueData[rear] = toInsert;
			System.out.println(queueData[rear] + " is inserted in queue at location : " + rear);

		} else {

			System.out.println("Queue is full !!");
		}

	}

	public void remove() {

		if (front != rear) {
			queueData[front] = "-1";
			front++;

		} else {
			System.out.println("Queue is Empty");
		}
	}

	public void displayQueue() {
		System.out.println("Displaying Queue ");

		for (int i = 0; i < sizeOfQueue; i++) {
			System.out.print("\t" + i + "\t|");

		}
		System.out.println("");
		System.out.print(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		for (int i = 0; i <sizeOfQueue; i++) {
			if (queueData[i] != "-1") {
				System.out.print("\t" + queueData[i]  + "\t|");
			}
		}
		System.out.println();

	}
	public static void main(String[] args) {
		System.out.println("Queue Initiated !!");
		Queue q=new Queue(10);
		q.Insert("7");
		q.Insert("8");
		q.Insert("9");
		q.Insert("10");
		q.Insert("11");
		q.displayQueue();
		q.remove();
		q.displayQueue();
		
	}

}
