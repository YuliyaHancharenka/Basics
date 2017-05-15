package javabasic.module6.toshibaAsusTask.asus;

public class AsusModel1 extends Asus {
	public AsusModel1(String name) {
		super(name);
		}

	@Override
	 public void connect(){
		 System.out.println("AsusModel1 connect();");
	 }
	
	@Override
	 public void workFromBattery(){
		 System.out.println("AsusModel1 can't work from battery();");
	 }

	@Override
	public void reboot() {
		// TODO Auto-generated method stub
		
	}
}
