package javabasic.module3.computers;

public class Computer {

	private String name;
	private int ram;
	private int hdd;
	private double weight;

	private String factoryNumber;
	private int cpuNumber;
	private double hight;
	private double width;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		if (newName != null) {
			name = newName;
		} else {
			System.out.println("Value can't be null");
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int newRam) {
		ram = newRam;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int newHdd) {
		if (newHdd >= 0) {
			hdd = newHdd;
		} else {
			System.out.println("Value can't be below zero");
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double newWeight) {
		if (newWeight >= 0) {
			weight = newWeight;
		} else {
			System.out.println("Value can't be below zero");
		}
	}

	public String getFactoryNumber() {
		return factoryNumber;
	}

	public void setFactoryNumber(String newFactoryNumber) {
		if (newFactoryNumber != null) { // equals?
			factoryNumber = newFactoryNumber;
		} else {
			System.out.println("Value can't be empty");
		}

	}

	public int getCpuNumber() {
		return cpuNumber;
	}

	public void setCpuNumber(int newCpuNumber) {
		if (newCpuNumber >= 1) {
			cpuNumber = newCpuNumber;
		} else {
			System.out.println("Value can't be below 1");
		}
	}

	public double getHight() {
		return hight;
	}

	public void setHight(int newHight) {
		hight = newHight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int newWidth) {
		width = newWidth;
	}

	public void turnOn() {
		System.out.println("Computer is turning on");
	}

	public void turnOff() {
		System.out.println("Computer is turning off");
	}

	public void load() {
		System.out.println("Computer is loading");
	}

}
