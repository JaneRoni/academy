package test_final;

//Учебные самолёты

public class TrainingAircraft extends AirplaneSuper {

	double length; // Длина
	double height; // Высота
	int weightMax; // Максимальный взлётный вес:
	int distance; // Дальность
	double speedMax; // Максимальная скорость
	
	private final Integer capacity;

//	public TrainingAircraft() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public TrainingAircraft(Integer capacity, double length, double height, int weightMax, int distance, double speedMax) {
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
//	Як-130
//	 учебно-боевой 

//	Двигатель - 2 × ТРД АИ-222-25
//	Длина, м 11,49
//	Годы производства c 2009
//	Макс. взлётная масса, кг 10 290
//	Размах крыла, м 9,84
//	Масса пустого, кг 4600
//	Макс. скорость, км/ч 960 (1060 без подвесок[37])
//	Макс. тяга двигателя, кН 2 × 24,7
//	Дальность без ПТБ, км	2000[38]

}
