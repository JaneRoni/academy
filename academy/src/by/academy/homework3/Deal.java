package by.academy.homework3;

public class Deal {

	public class Buyer extends Person{
		public Buyer() {
			super();
		}
		
		public Buyer(String name,double money) {
			this();
			this.money = money;
			this.name = name;
		}
	}
	
	
	
	public class Seller extends Person{
		public Seller() {
			super();
		}
		
		public Seller(String name, double money) {
			super(name, money);
		}
		
		
	}
	
	public double SumDeal() { //сумма сделки = сумма пр1+сумма пр2
		//SumDeal1 = 
		return 1;
	} 

	
	/*String Products[] = new String [30];
	Products[0] = "апельсин";
	Products[1] = "банан";
	Products[2] = "вино";
	Products[3] = "хлеб";
	Products[4] = "масло";
	Products[5] = "джем";
	Products[6] = "молоко";
	Products[7] = "кофе";*/
			
	
}
