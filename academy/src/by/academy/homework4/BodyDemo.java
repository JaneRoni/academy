package by.academy.homework4;

import by.academy.homework4.Body.Heart;
import by.academy.homework4.Body.Lungs;

public class BodyDemo {

	public static void main(String... args) {

		Body body = new Body();
//		System.out.println("body de" + body);// test
		Heart heart = body.new Heart();
//		System.out.println("new Heart de");// test
		Lungs lungs = body.new Lungs();
//		System.out.println("new Lungs de ");// test

//		body.createBody();
		lungs.live();
		heart.live();

		System.out.println(
				"You stand on the shore and feel the salty smell of the wind that blows from the sea. And I believe that you are free, and life has only begun.");

		body.live();
	}

}

