package javabasic.module6.toshibaAsusInterface.toshibaModels;


import javabasic.module6.toshibaAsusInterface.interfacesAbstracts.AbstractNotebook;

public class ToshibaModel1 extends AbstractNotebook implements Toshiba {

	public ToshibaModel1(String name){
		super(name);
	}
	
	@Override
	public void workFromBattery() {
		System.out.println("ToshibaModel1 slow works");
		
	}

	@Override
	public void load() {

	}

	@Override
	public void connect() {
		System.out.println("ToshibaModel1 connect");		
	}

	@Override
	public void useTachPad() {
		System.out.println("ToshibaModel1 using tachpad");
		
	}

	@Override
	public void lightKeaboard() {
		System.out.println("Keaboard w/o light");
		
	}

}
