package javabasic.module6.toshibaAsusInterface.interfacesAbstracts;

public abstract class AbstractNotebook extends AbstractED implements Notebook {
	private boolean CdWritable;
	private double ram;
	private double hdd;
	private boolean cdWritable;
	private boolean loaded;
    
	
	/*public AbstractNotebook(String name, double weight, double ram, double hdd, boolean cdWritable) {
		super(name, weight, ram, hdd, cdWritable);
	}*/

	public AbstractNotebook(String name) {
		super(name);
	}

	public AbstractNotebook(String name, boolean cdWritable) {
		super(name);
		this.CdWritable = cdWritable;
	}

	public abstract void workFromBattery();

	public abstract void connect();/*
									 * { System.out.
									 * println("ToshibaModel1 connect();"); }
									 */
	public void writeDisc() {
        if (cdWritable) {
            System.out.println("Computer is writing disc");
        } else {
            System.out.println("Computer isn't able to write disc");
        }
	}
        
	/*@Override
	public void load() {
		System.out.println(getName() + " loading");
	}*/

	@Override
	public void on() {
		System.out.println(getName() + " on");
	}

	@Override
	public void off() {
		System.out.println(getName() + " off");
	}
	
	//setters - getters
	
	
	
}
