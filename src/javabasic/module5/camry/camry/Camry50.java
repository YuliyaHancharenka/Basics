package javabasic.module5.camry.camry;

public class Camry50 extends Camry30 {
	@Override
	public void stop() {
		System.out.println("Camry50 can stop faster");
		super.stop();
	}
}
