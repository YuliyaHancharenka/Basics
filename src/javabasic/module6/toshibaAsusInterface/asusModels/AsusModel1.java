package javabasic.module6.toshibaAsusInterface.asusModels;


import javabasic.module6.toshibaAsusInterface.interfacesAbstracts.AbstractNotebook;

public class AsusModel1 extends AbstractNotebook implements Asus {
	public AsusModel1(String name) {
		super(name);
		}

	@Override
	public void load() {

	}

	@Override
	 public void connect(){
		 System.out.println("AsusModel1 connect();");
	 }
	
	@Override
	 public void workFromBattery(){
		 System.out.println("AsusModel1 works from battery();");
	 }

	//@Override
	//public void reboot() {
	//	// TODO Auto-generated method stub
		
	//}

	@Override
	public void useTachPad() {
		 System.out.println("AsusModel1 uses tachpad");
		
	}

	@Override
	public void printStartScreen() {
		System.out.println("AsusModel1 prints startScreen");
		
	}
}
