package javabasic.module6.toshibaAsusTask.asus;


import javabasic.module6.toshibaAsusTask.Notebook;

public abstract class Asus extends Notebook {

	protected Asus(String name) {
		super(name, false);
		
	}
	
	public void printStartScreen(){
		System.out.println("Asus Company. All right reserved");
	}
	

}
