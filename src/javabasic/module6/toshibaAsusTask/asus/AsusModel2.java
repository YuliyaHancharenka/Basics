package javabasic.module6.toshibaAsusTask.asus;

public class AsusModel2 extends Asus {

	public AsusModel2(String name) {
		super(name);
		}

	@Override
	 public void connect(){
		 System.out.println("AsusModel2 connect();");
	 }
	
	@Override
	 public void workFromBattery(){
		 System.out.println("AsusModel2 can't work from battery();");
	 }

	@Override
	public void reboot() {
		// TODO Auto-generated method stub
		
	}
}
