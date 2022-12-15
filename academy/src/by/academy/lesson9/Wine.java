package by.academy.lesson9;
	
	class Wine extends Product {
		protected  int age;

		public Wine() {
			super();
		}

		public Wine(double price, String name, double quantity, int age) {
			this();
			this.age = age;	
		}
	}

