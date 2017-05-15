package javabasic.module6.toshibaAsusInterface.interfacesAbstracts;

public abstract class AbstractED implements ElectronicDevice {
	//Variables
    private double weight;
    protected String name;
    protected boolean power;
    
    public AbstractED(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public AbstractED (String name2) {
		this.name = name;
	}

	//Methods
    
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
