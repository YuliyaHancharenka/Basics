package javabasic.module6.toshibaAsusTask;

public abstract class ElectronicDevice {
	//Variables
    private double weight;
    protected String name;
    protected boolean power;

    public ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public ElectronicDevice(String name) {
		this.name = name;
	}

	//Methods
    public abstract void on();/* {
        this.power = true;
        System.out.println("ElectonicDevice on();");
    }*/

    public abstract void off();/* {
        this.power = false;
        System.out.println("ElectonicDevice off();");
    }*/

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean isPower() {
        return power;
    }
}
