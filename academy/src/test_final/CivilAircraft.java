package test_final;

//Гражданские самолёты

public class CivilAircraft extends AirplaneSuper {

	double length; // Длина
	double height; // Высота
	int weightMax; // Максимальный взлётный вес:
	int distance; // Дальность
	double speedMax; // Максимальная скорость
	
	private final Integer capacity;

//	public CivilAircraft() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public CivilAircraft(Integer capacity, double length, double height, int weightMax, int distance, double speedMax) {
		super();
		this.capacity = capacity;
		this.length = length;
		this.height = height;
		this.weightMax = weightMax;
		this.distance = distance;
		this.speedMax = speedMax;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public long getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(int weightMax) {
		this.weightMax = weightMax;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(double speedMax) {
		this.speedMax = speedMax;
	}



	@Override
	protected int getCapacity() {
		return capacity;
	}

//	@Override
//	protected void add(AirplaneSuper airplaneSuper) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	protected int getWeight() {
		return weightMax;
	}

//	1
//	Грузовые
//	Ан-12
//	

//	Двигатели: Турбовинтовой двигатель АИ-20М 4х4250 л.с.);
//	Размеры:
//	размах крыла 38,015 м;
//	длина самолёта 33,109 м;
//	высота 10,525 м;
//	Размеры грузовой кабины:
//	длина 13,5 м;
//	максимальная ширина 3-3,5 м;
//	максимальная высота 2,4-2,6 м;
//	Экипаж: 6-7 человек (командир, помощник командира, штурман, борттехник, бортрадист; бортовой техник по АДО; воздушный стрелок);
//	Пассажировместимость: 90 солдат или 60 парашютистов.
//	Массы и нагрузки:
//	взлётная 61 т;
//	пустого снаряжённого 50 т;
//	самолёта без топлива 36,7 т;
//	максимальная коммерческая нагрузка 21 т;
//	посадочная 58 т;
//	запас топлива 22,066 т;
//	Лётные данные:
//	максимальная скорость: 660 км/ч;
//	крейсерская скорость: 570 км/ч;
//	эксплуатационный потолок: 7200-8600 м, максимальный 10000 м;
//	дальность полёта перегоночная 5530 км;
//	с максимальной загрузкой 3600 км;
//
//	Требуемая длина ВПП (условия МСА, на уровне моря): 900—2200 м в зависимости от взлётного веса.
//	

//	2
//	Почтовые
//	Boeing Monomail
//	
//	
//	Длина, м	12.55
//	Размах крыла, м	18.02
//	Высота самолёта, м	3.20
//	Площадь крыла, м²	49.70
//	Двигатель  	Pratt & Whitney R-1860 Hornet B[en]
//	Тяга, л.с.	575
//	Макс. скорость, км/ч	254
//	Крейсерская скорость, км/ч	217
//	Дальность полёта, км	853
//	Максимальная высота, м	4265
//	Вес пустого, кг	2158
//	Макс. взлётный вес, кг	3639

//	3
//	Пассажирские
//	Boeing 747-8
//	
//	Вместимость 410 (3 класса)
//	Длина	76,3 м
//	Размах крыла	68,4 м
//	Высота	19,4 м
//	Масса пустого самолёта	213,2 т
//	Максимальная взлётная масса	447,7 т
//	Максимальная скорость	988 км/ч
//	Дальность полёта с максимальной нагрузкой	14 310 км
//	Максимальное количество топлива	193,3 т

}
