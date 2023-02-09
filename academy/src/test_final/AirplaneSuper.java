package test_final;

import java.util.Objects;

abstract class AirplaneSuper {

	protected double length; // Длина
	protected double height; // Высота //потре
	protected int weightMax; // Максимальный взлётный вес:
	protected int distance; // Дальность
	protected double speedMax; // Максимальная скорость

	public AirplaneSuper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirplaneSuper(double length, double height, int weightMax, int distance, double speedMax) {
		super();
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





	protected abstract int getCapacity(); //вместимость
	protected abstract int getWeight(); //грузоподъемность.

//	protected abstract void add(AirplaneSuper airplaneSuper);

	@Override
	public int hashCode() {
		return Objects.hash(distance, height, length, speedMax, weightMax);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirplaneSuper other = (AirplaneSuper) obj;
		return distance == other.distance && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(speedMax) == Double.doubleToLongBits(other.speedMax)
				&& weightMax == other.weightMax;
	}

	@Override
	public String toString() {
		return "AirplaneSuper [length=" + length + ", height=" + height + ", weightMax=" + weightMax + ", distance="
				+ distance + ", speedMax=" + speedMax + "]";
	}
	
	

}
