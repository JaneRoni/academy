package by.academy.homework4;

//Задание 2.
//1.+ Создать класс Body.
//2. +Создать внутренний класс Heart, объект которого создается в конструкторе Body.
//+Реализовать метод live (в классе Heart), в котором вы в цикле 
//+пробегаетесь от нуля до Integer.MAX_VALUE 
//+и на каждую 100 итерацию выводите на экран
//+"Knock-knock-knockin' on heaven's door".
//+3. Создать внутренний класс Lungs, объект которого создается в конструкторе Body.
//+Реализовать метод live (в классе Lungs), в котором вы в цикле пробегаетесь 
//+от нуля до Integer.MAX_VALUE 
//+и на каждую 50 итерацию выводите на экран "breathe in", 
//+а на каждую 100 - "breathe out".
//+4. Реализовать метод live в классе Body, в котором мы запускаем метод live 
//+на объекте lungs (lungs.live()) 
//+и метод live на объекте heart (heart.live()).
//После отработки обоих методов выведем на экран:
//"You stand on the shore and feel the salty smell of the wind that blows from 
//the sea. 
//And I believe that you are free, and life has only begun.".

public class Body {

	Body body;
	Heart heart;
	Lungs lungs;

	public Body() {
		super();
	}

	public Body(Heart heart, Lungs lungs) {
		super();
		this.heart = body.new Heart();
		this.lungs = body.new Lungs();
	}

	public void createBody() {
		Body body = new Body();
//		System.out.println("new body bo ");// test
		Heart heart = body.new Heart();
//		System.out.println("new heart bo ");// test
		Lungs lungs = body.new Lungs();
//		System.out.println("new lungs bo ");// test

	}

	class Heart {

		public Heart() {
			super();
		}

		public void live() {
			int counterLiveHeart = 0;
			while (counterLiveHeart < Integer.MAX_VALUE) {// Integer.MAX_VALUE
				counterLiveHeart++;

				if ((counterLiveHeart % 100) == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");

				}
			}
		}

	}

	class Lungs {

		public void live() {
			int counterLiveLungs = 0;
			while (counterLiveLungs < Integer.MAX_VALUE) {
				counterLiveLungs++;

				if ((counterLiveLungs % 50) == 0) {
					System.out.println("breathe in");

					if ((counterLiveLungs % 100) == 0) {
						System.out.println("breathe out");

					}
				}

			}
		}
	}

	public void live() {

		lungs.live();
		heart.live();
		System.out.println(
				"You stand on the shore and feel the salty smell of the wind that blows from the sea. And I believe that you are free, and life has only begun.");
	}

}
