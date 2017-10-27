//Part 2 of this is called DisplayPrimeFactors.java
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	public StackOfIntegers(int capacity) {//set size
		elements = new int[capacity];
	}
	public void push(int value) {//add new to top
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}
	public int pop() {//top number is removed
		return elements[--size];
	}
	public int peek() {//top number is only looked at
		return elements[size - 1];
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}