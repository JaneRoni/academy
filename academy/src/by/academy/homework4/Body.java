package by.academy.homework4;

public class Body {

	Body body;
	Heart heart;
	Lungs lungs;

	public Body() {
		super();
		this.heart = new Heart();
		this.lungs = new Lungs();
	}

//	public void createBody() {
//		Body body = new Body();
//		Heart heart = body.new Heart();
//		Lungs lungs = body.new Lungs();
//	}

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
