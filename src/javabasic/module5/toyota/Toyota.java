package javabasic.module5.toyota;

public class Toyota {

	private String name;
	private double volume;

		
	//Setters and Getters
	public Toyota (double volume){
		this.volume = volume;
	}
	
	public Toyota (String name){
		this.name = name;
	}
	
	public Toyota (String name, double volume){
		this.name = name;
		this.volume = volume;
	}
	
	
	//Constructors
	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public Toyota(){};
	
	
    /*public static void main(String[]args){ 
    	
    	Rav4 rav4 = new Rav4();
    	rav4.setName("1010101");
    	//System.out.println(rav4.name);
    }*/
}
