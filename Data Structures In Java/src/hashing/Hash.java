package hashing;

import linkedkList.LinkedList;;

public class Hash<K, V> implements HashI<K, V> {

	@SuppressWarnings("hiding")
	/*
	 * Inner class to store HAsh Element (This is not visible to outer world)
	 */
	class HashElement<K, V> implements Comparable<HashElement<K, V>> {
		K key;
		V value;

		public HashElement(K key, V value) {
			this.key = key;
			this.value = value;

		}

		@SuppressWarnings("unchecked")
		@Override
		public int compareTo(HashElement<K, V> o) {

			return ((Comparable<K>) this.key).compareTo(o.key);
		}

	}

	int tableSize, numberOfElements;
	double maxLoadFactor;
	LinkedList<Hash<K, V>.HashElement<K, V>>[] harray;

	// Constructor for main Hash Class
	@SuppressWarnings("unchecked")
	public Hash(int tableSize) {
		this.tableSize = tableSize;

		// harray =new LinkedList<Hash<K, V>.HashElement<K, V>> [tableSize]; //This is
		// my way of intialization for linkedlist

		harray = (LinkedList<Hash<K, V>.HashElement<K, V>>[]) new LinkedList[tableSize];
		// initializing linkedlist at each position
		for (int i = 0; i < tableSize; i++) {

			harray[i] = new LinkedList<HashElement<K, V>>();

		}
		maxLoadFactor = 0.75;
		numberOfElements = 0;

	}
	public double loadFactor() {
		return (numberOfElements/tableSize);
	}
	
	public boolean addElement(K key ,V value) {
		if(loadFactor() > maxLoadFactor) {
			//resize(tableSize *2);
		}
		
		HashElement<K, V> NewElement=new HashElement<K, V>(key, value);
		
		int hashvalue=key.hashCode();
		hashvalue=hashvalue & 0x7FFFFF;
		hashvalue=hashvalue%tableSize;
		harray[hashvalue].addFirst(NewElement);
		numberOfElements++;
		return true;
		
		
	}
	public static void main(String[] args) {

		int hashvalue=100;
		hashvalue=hashvalue & 0x7FFFFFFF;
		System.out.println("HashValue is : " + hashvalue);
	}
}
