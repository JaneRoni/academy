package by.academy.homework4;

public class CustomIterator<E> implements Iterator<E> {

	public E[] array;
	public static int count;
	public static Integer x;

	public CustomIterator() {
		super();
	}

	public CustomIterator(E[] array) {
		this();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || array.length <= count) {

			return false;
		}
		return array[count] != null;

	}

	@Override
	public E next() {
		return array[count++];
	}

	@Override
	public void remove() {
		if (x == array[count]) {
			while (array.length >= count) {

				array[count] = array[count++];
			}
		}
	}

}
