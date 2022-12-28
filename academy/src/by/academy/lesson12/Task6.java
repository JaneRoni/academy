package by.academy.lesson12;

//6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), 
//методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех 
//переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, 
//String), V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.



public class Task6 {

	public static void main (String ...args) {
		
		ThreeGeneric <String, Cheese, Double> threegeneric = new ThreeGeneric<>("Cheese", new Cheese, 2.0);
	
		threegeneric.Name();
	}

}
