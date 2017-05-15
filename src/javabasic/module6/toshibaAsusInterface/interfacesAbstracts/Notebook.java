package javabasic.module6.toshibaAsusInterface.interfacesAbstracts;

public interface Notebook extends Computer {
	/*private boolean CdWritable;

	public Notebook(String name, double weight, double ram, double hdd, boolean cdWritable) {
		super(name, weight, ram, hdd, cdWritable);
	}

	public Notebook(String name) {
		super(name);
	}

	public Notebook(String name, boolean cdWritable) {
		super(name);
		this.CdWritable = cdWritable;
	}*/

	public abstract void workFromBattery();

	public abstract void connect();
	
	public abstract void useTachPad();
/*
	@Override
	public void load() {
		System.out.println(getName() + " loading");
	}

	@Override
	public void on() {
		System.out.println(getName() + " on");
	}

	@Override
	public void off() {
		System.out.println(getName() + " off");
	}*/
}
