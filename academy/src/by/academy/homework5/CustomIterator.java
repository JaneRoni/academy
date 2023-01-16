package by.academy.homework5;

public class CustomIterator<T> implements Iterator<T> {

	public T[][] array;

	public CustomIterator(T[][] array) {
		this.array = array;
	}

	int l = array.length;

	@Override
	public boolean hasNext() {
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		int i = 0, j = 0;
		T obj = array[i][j++];
		for (i = 0; i < l; i++) {
			for (j = 0; j < l; j++) {

			}
		}

		return obj;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
