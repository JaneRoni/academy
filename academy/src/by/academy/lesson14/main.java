package by.academy.lesson14;

import java.util.Arrays;

public class main<T> {

	private static final int DEFAULT_CAPASITY = 16;
	private T[] array;
	private int index = 0;

	public main() {
		super();
		this.array = (T[]) new Object[DEFAULT_CAPASITY];
	}

	public main(int capasity) {
		super();
		this.array = (T[]) new Object[capasity];
	}

	public void add(T obj) {
		if (array.length < index) {
			grow();
		}
		array[index++] = obj;

	}

	private void grow() {
		T[] newArray = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
	}

	public void print() {
		T[] temp = (T[]) new Object[index];
		System.arraycopy(array, 0, temp, 0, index);
		System.out.println(Arrays.toString(temp));
	}

	public T get(int i) {
		return array[i];
	}

	public T getLast() {

		// return index ==0 ? null: array[index - 1];
		if (index == 0) {
			return null;
		}
		return array[index - 1];

	}

	public T getFirst() {

		// return index ==0 ? null: array[0];
		if (index == 0) {
			return null;
		}
		return array[0];

	}

	public int size() {
		return index;
	}

	public int capasity() {
		return array.length;
	}

	public T remove(int i) {
		T temp = array[i];
		System.arraycopy(array, i + 1, array, i, index - i);

		array[array.length - 1] = null;

		index--;
		return temp;
	}

	public T remove(T obj) {
		int tempIndex = -1;
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				return remove(i);
			}
		}

		return null;
	}

}
