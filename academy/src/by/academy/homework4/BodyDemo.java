package by.academy.homework4;

import by.academy.homework4.Body.Heart;
import by.academy.homework4.Body.Lungs;

public class BodyDemo {

	public static void main(String... args) {

		Body body = new Body();
		Heart heart = body.new Heart();
		Lungs lungs = body.new Lungs();

//		body.createBody();
		lungs.live();
		heart.live();

		System.out.println(
				"You stand on the shore and feel the salty smell of the wind that blows from the sea. And I believe that you are free, and life has only begun.");

		body.live();
	}

}
