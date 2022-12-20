package by.academy.homework3;

	public class Cheese extends Product{
		private int old;
		
		public Cheese() {
			super();
		}
		
		public Cheese(String name,double quantity,double price) {
			super(name,quantity,price);
			this.old=old;
		}

		@Override
		protected double getDiscount() { 
			// TODO Auto-generated method stub
			return 1;
		}
		
	}

