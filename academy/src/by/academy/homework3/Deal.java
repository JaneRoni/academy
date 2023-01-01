package by.academy.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal implements Menu {

	public Buyer buyer;
	public Seller seller;
	public LocalDate deadlineDate;

	static Product productDeal[] = new Product[100];// корзина
	private static String total;

	public Deal() {
		super();
	}

	public Deal(Buyer buyer, Seller seller, Product productDeal[]) {
		this();
		this.buyer = buyer;
		this.seller = seller;
		this.productDeal = productDeal;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public Seller getSeller() {
		return seller;
	}

	public Product[] getProducts() {
		return productDeal;
	}

	public void setProducts(Product[] productDeal) {
		this.productDeal = productDeal;
	}

	public static LocalDate getDeadlineDate() {
		LocalDate deadlineDate = LocalDate.now();
		return deadlineDate.plusDays(10);
	}

	public void AddProductToStore() {

		// хлеб
		Bread bread1 = new Bread();
		bread1.name = "Хлеб Водар светлый под. нар. 430г";
		bread1.price = 1.12;

		Bread bread2 = new Bread();
		bread2.name = "Хлеб Маг с сем. нарез. 350г";
		bread2.price = 1.82;

		Bread bread3 = new Bread();
		bread3.name = "Хлеб Харрис пшеничный с отрубями 515г";
		bread3.price = 3.96;

		Bread bread[] = new Bread[10];
		bread[0] = bread1;
		bread[1] = bread2;
		bread[2] = bread3;

		// сыр
		Cheese cheese1 = new Cheese();
		cheese1.name = "Сыр полутвердый Брест-Литовск сливочный фас. нарезка-брусок 50% 200г";
		cheese1.price = 3.79;

		Cheese cheese2 = new Cheese();
		cheese2.name = "Сыр полутвердый Брест-Литовск Маасдам фас слайсерн нарезка 45%";
		cheese2.price = 2.99;

		Cheese cheese3 = new Cheese();
		cheese3.name = "Сыр с грецким орехом Cheese Lovers нарезка фас 50% 150г";
		cheese3.price = 5.99;

		Cheese cheese[] = new Cheese[10];
		cheese[0] = cheese1;
		cheese[1] = cheese2;
		cheese[2] = cheese3;

		// молоко
		Milk milk1 = new Milk();
		milk1.name = "Молоко ультрапастеризованное «Чудское озеро» 3,5%, 1 л";
		milk1.price = 3.95;

		Milk milk2 = new Milk();
		milk2.name = "Молоко «Parmalat Comfort» безлактозное, 1.8%, 1 л";
		milk2.price = 4.95;

		Milk milk3 = new Milk();
		milk3.name = "Молоко «Молочный гостинец» ультрапастеризованное, 1.5%, 1 л";
		milk3.price = 1.77;

		Milk milk[] = new Milk[10];
		milk[0] = milk1;
		milk[1] = milk2;
		milk[2] = milk3;

		Scanner scan = new Scanner(System.in);

		int counterError = 0;// ошибочно введенное значение

		System.out.println("нажмите 1 - для начала, 0 - для выхода");

		int answerUser = scan.nextInt();

		if (answerUser == 0) {
			System.out.println("Вы вышли из магазина");
			System.exit(0);
		}

		// System.out.println("cont");// проверка, удалить

		String category = null;

		while (counterError == 0) {// проверка на корректность введенного значения

			System.out.println("выберите категорию товара:" // выбор категории
					+ "молоко, нажмите - 1\r\n" + "	хлеб, нажмите - 2\r\n" + "	сыр, нажмите - 3\r\n\n" + " выход - 0");
			answerUser = scan.nextInt();

			switch (answerUser) {
			case 0:
				System.out.println("Вы вышли из магазина");
				System.exit(0);
			case 1:
				System.out.println("Вы выбрали категорию молоко");
				counterError = 1;
				category = "milk";
				break;
			case 2:
				System.out.println("Вы выбрали категорию хлеб");
				counterError = 1;
				category = "bread";
				break;
			case 3:
				System.out.println("Вы выбрали категорию сыр");
				counterError = 1;
				category = "cheese";
				break;
			default:
				System.out.println("Вы ввели некорректное значение, введите новое: ");
				counterError = 0;

			}

		}

		String prodAdd;// продукт для добавления
		counterError = 0;// обнуляем счетчик
		int countContinue = 1; // сч продолжения
		Double quantityAdd;
		while (countContinue == 1) {
			for (int i = 0; i < productDeal.length; i++) {// записываем продукты в массив продуктов
				while (counterError == 0) {// проверка на корректность введенного значения
					switch (category) {// выбор товара
					case "milk":
						System.out.println("Выберите товар из категории молоко");
						System.out.println("1: " + milk[0].name + "2: " + milk[1].name + "3: " + milk[2].name);

						answerUser = scan.nextInt(); // ответ
						prodAdd = category + answerUser;
						System.out.println(prodAdd);// проверка, удалить
						productDeal[i].name = prodAdd;

						System.out.println("Введите количество");
						quantityAdd = scan.nextDouble();
						productDeal[i].quantity = quantityAdd;

						countContinue = 1;
						counterError = 1;
						break;
					case "bread":
						System.out.println("Выберите товар из категории хлеб");
						System.out.println("1: " + bread[0].name + "2: " + bread[1].name + "3: " + bread[2].name);

						answerUser = scan.nextInt(); // ответ
						prodAdd = category + answerUser;
						System.out.println(prodAdd);// проверка, удалить
						productDeal[i].name = prodAdd;

						System.out.println("Введите количество");
						quantityAdd = scan.nextDouble();
						productDeal[i].quantity = quantityAdd;

						counterError = 1;
						countContinue = 1;
						break;
					case "cheese":
						System.out.println("Выберите товар из категории сыр");
						System.out.println("1: " + cheese[0].name + "2: " + cheese[1].name + "3: " + cheese[2].name);

						answerUser = scan.nextInt(); // ответ
						prodAdd = category + answerUser;
						System.out.println(prodAdd);// проверка, удалить
						productDeal[i].name = prodAdd;

						System.out.println("Введите количество");
						quantityAdd = scan.nextDouble();
						productDeal[i].quantity = quantityAdd;

						counterError = 1;
						countContinue = 1;
						break;
					default:
						System.out.println("Вы ввели некорректное значение, введите новое: ");

						counterError = 0;
					}

					System.out.println("Желаете купить еще? 1-да, 0-нет");

					countContinue = scan.nextInt();

					if (countContinue == 0) {
						break;
					}

					countContinue = 1;
				}
			}

		}
		Double total = 00.00; // итог по сделке

		for (int j = 0; j < productDeal.length; j++) {
			total = total + productDeal[j].getCalcPrice();
		}
		
		if (total > buyer.getMoney()) {
			System.out.println("недостаточно средств для проведения сделки, выберите заново");
			System.exit(0);
		}else {
			
			Deal.PrintBill();
			
			buyer.setMoney() { //списать деньги у покупателя
				int x = buyer.getMoney()-total;
			}
			seller.setMoney(){//закинуть деньги продавцу за сделку
				int y =	seller.getMoney()+total;
			}
			
		}
		
		scan.close();
	}// AddProductToStore

	public static void PrintBill(Product productDeal[]) { // печать чека

		System.out.println("Дата  " + LocalDate.now());
		System.out.println("Наименование  \t Количество \t Стоимость");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < productDeal.length; i++) {

			System.out.println(i + 1 + ":" + productDeal[i].getName() + " \t " + +productDeal[i].getQuantity()
					+ " \t          " + productDeal[i].getCalcPrice());

		}
		System.out.println("----------------------------------------------");
		System.out.println("Итог " + total + " руб.");
	}
}
