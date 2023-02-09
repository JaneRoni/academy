package test_final;

//3) Написать итератор, который в конструктор принимает массив итераторов
//и позволяет пройтись по элементам всех итераторов.

//одномерный итератор
public class CustomIteratorTask3<E> implements IteratorTask3<E> {

	public E[] array;
	String arrayName;

	public CustomIteratorTask3(String arrayName,E[] array) {
		super();
		this.array = array;
		this.arrayName = arrayName;
	}

//	int l = array.length;

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public E next() {
		return null;
	}

	// находим в поз 0 итераттор пройтись по нему ? вывести все сод + фор или
	// хеснекст/некст?
	// 2 варинта
	// хеснекст в хеснексте

}
