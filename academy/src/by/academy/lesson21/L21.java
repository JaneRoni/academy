package by.academy.lesson21;

import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class L21 {

	public static void main(String... args) {

		Cat cat = new Cat("Vaska", 10, "��������");
		Class<Cat> catClass = Cat.class;
		System.out.println("catClass " + catClass);

		Tiger tiger = new Tiger("��������", "������ ������", "��");
		Class<Tiger> tigerClass = Tiger.class;
		System.out.println("tigerClass " + tigerClass);

		System.out.println("catClass.get " + catClass.getDeclaredMethods());
		System.out.println("tigerClass.get " + tigerClass.getDeclaredMethods());

		// Methods
		try {
			Method catSleep = catClass.getDeclaredMethod("sleep");
			Method cateat = catClass.getDeclaredMethod("eat");

			Method catawake = catClass.getDeclaredMethod("awake");
			catawake.setAccessible(true);

		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Fields
		try {
			java.lang.reflect.Field catname = catClass.getDeclaredField("name");// public
			System.out.println("catname " + catname);

			java.lang.reflect.Field catold = catClass.getDeclaredField("old");// private
			catold.setAccessible(true);
			System.out.println("catold " + catold);

			java.lang.reflect.Field catbreed = catClass.getDeclaredField("breed");// protected
			System.out.println("catbreed  " + catbreed);

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//			System.out.println(catClass.getDeclaredMethods());

	}
}
