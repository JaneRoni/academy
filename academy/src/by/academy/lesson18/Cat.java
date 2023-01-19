package by.academy.lesson18;

import java.io.Serializable;

public class Cat implements Serializable {

	private static final long serialVersionUID = 1;

	private String name;
	private transient int old;

	public Cat(String name, int old) {
		super();
		this.name = name;
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

}
