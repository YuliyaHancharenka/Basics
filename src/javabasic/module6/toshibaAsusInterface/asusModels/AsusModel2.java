package javabasic.module6.toshibaAsusInterface.asusModels;

import javabasic.module6.toshibaAsusInterface.interfacesAbstracts.AbstractNotebook;

public class AsusModel2 extends AbstractNotebook implements Asus {
	public AsusModel2(String name) {
		super(name);
		}
	@Override
	public void load() {

	}
	@Override
	 public void connect(){
		 System.out.println("AsusModel2 connect();");
	 }
	
	@Override
	 public void workFromBattery(){
		 System.out.println("AsusModel2 works from battery();");
	 }

	//@Override
	//public void reboot() {
	//	// TODO Auto-generated method stub
		
	//}

	@Override
	public void useTachPad() {
		 System.out.println("AsusModel2 uses tachpad");
		
	}

	@Override
	public void printStartScreen() {
		System.out.println("AsusModel2 prints startScreen");
		
	}
}
