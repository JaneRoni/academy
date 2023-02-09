package test_final;

import java.util.List;
import java.util.ListIterator;

//главный (внешний) итератор

public class SuperIteratorT3<E> implements IteratorTask3<E> {
	public List<ListIterator<String>> array;
//	int l = array.length;

//	public SuperIteratorT3(E[] array) {
//		super();
//		this.array = array;
//	}

	public SuperIteratorT3(List<ListIterator<String>> arrOfIterators) {
		super();
		this.array = arrOfIterators;
	}

	@Override
	public boolean hasNext() {

		return false;
	}

	@Override
	public E next() {

		return null;
	}

}
