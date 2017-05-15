package javabasic.module6.toshibaAsusInterface.toshibaModels;


import javabasic.module6.toshibaAsusInterface.interfacesAbstracts.AbstractNotebook;

public class ToshibaModel2 extends AbstractNotebook implements Toshiba {

	public ToshibaModel2(String name){
		super(name);
	}
	
	public void initializeBeforeConnect() {
		System.out.println("Model "  + getName() + "initializing before connection");
			}
	
	@Override
	public void workFromBattery() {
		System.out.println("ToshibaModel2 slow works");
		
	}

	@Override
	public void load() {

	}

	@Override
	public void connect() {
		System.out.println("ToshibaModel2 connect");		
	}

	@Override
	public void useTachPad() {
		System.out.println("ToshibaModel2 using tachpad");
		
	}

	@Override
	public void lightKeaboard() {
		System.out.println("Toshiba2 Keaboard with light");
		
	}

}
