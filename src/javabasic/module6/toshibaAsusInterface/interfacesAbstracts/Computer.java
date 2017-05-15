package javabasic.module6.toshibaAsusInterface.interfacesAbstracts;

public interface Computer extends ElectronicDevice {
    /*public Computer(String name, double weight) {
        super(name, weight);
    }*/

    //Variables
    /*private double ram;
    private double hdd;
    private boolean cdWritable;
    private boolean loaded;*/

    /*public Computer(String name, double weight, double ram, double hdd, boolean cdWritable) {
        super(name, weight);
        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;
        this.loaded = false;
    }

    public Computer(String name) {
		super(name);
	}*/

	//Methods
    public abstract void load(); 

    public abstract void connect(); 

    /*public void writeDisc() {
        if (cdWritable) {
            System.out.println("Computer is writing disc");
        } else {
            System.out.println("Computer isn't able to write disc");
        }
    }*/

    /*@Override
    public void on() {
        power = true;
        System.out.println("ElectonicDevice - Computer on();");
    }

    @Override
    public void off() {
        power = false;
        System.out.println("ElectonicDevice - Computer off();");
    }*/

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getHdd() {
        return hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }*/
    

}
