package javabasic.module6.toshibaAsusTask.toshiba;

public class ToshibaModel2 extends Toshiba {
	
	public ToshibaModel2(String name){
		super(name);
	}
	
	public void initializeBeforeConnect(){
		System.out.println("Model" + getName() + "initializing Before Connect");
	}
	
	@Override
	 public void connect(){
		 System.out.println("ToshibaModel1 connect();");
	 }

	@Override
	 public void lightKeaboard(){
		 System.out.println("Keaboard w/o light");
	 }
	
	@Override
	 public void workFromBattery(){
		 System.out.println("Toshiba is slow");
	 }

	@Override
	public void reboot() {
		// TODO Auto-generated method stub
		
	}

}
