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
	//массив продуктов
	//цена финальная
	//calculatefinalprice как переменная, необязательно хранить
	public double SumDeal() { //сумма сделки = сумма пр1+сумма пр2
		//SumDeal1 = 
		return 1;
	}
	
	/*String Products[] = new String [30];
	Products[0] = "Р°РїРµР»СЊСЃРёРЅ";
	Products[1] = "Р±Р°РЅР°РЅ";
	Products[2] = "РІРёРЅРѕ";
	Products[3] = "С…Р»РµР±";
	Products[4] = "РјР°СЃР»Рѕ";
	Products[5] = "РґР¶РµРј";
	Products[6] = "РјРѕР»РѕРєРѕ";
	Products[7] = "РєРѕС„Рµ";*/
			
	
}
