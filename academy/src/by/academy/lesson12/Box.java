package by.academy.lesson12;

import java.util.Arrays;

public class Box <T>{
	private T[] items;

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public void addItem() {
		// TODO
	}

	public T getItem(int i) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [items=");
		builder.append(Arrays.toString(items));
		builder.append("]");
		return builder.toString();
	}

}




