package javabasic.module3.computers;

public class Main {
	public static void main(String[] args) {

		Computer comp1 = new Computer();

		comp1.turnOn();
		comp1.turnOff();
		comp1.load();

		comp1.setName("C1");
		comp1.getName();
		System.out.println(comp1.getName());

		comp1.setFactoryNumber("AS100");
		comp1.getFactoryNumber();
		System.out.println(comp1.getFactoryNumber());

		comp1.setWeight(1.2);
		comp1.getWeight();
		System.out.println(comp1.getWeight());
		
		comp1.setHdd(-1);
		comp1.getHdd();
		System.out.println(comp1.getHdd());
		
		comp1.setCpuNumber(-2);
		comp1.getCpuNumber();
		System.out.println(comp1.getCpuNumber());
	}

}
