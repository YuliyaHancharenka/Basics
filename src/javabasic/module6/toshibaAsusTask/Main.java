package javabasic.module6.toshibaAsusTask;


import javabasic.module6.toshibaAsusTask.asus.AsusModel1;
import javabasic.module6.toshibaAsusTask.asus.AsusModel2;
import javabasic.module6.toshibaAsusTask.lenovo.Lenovo;
import javabasic.module6.toshibaAsusTask.sony.Sony;
import javabasic.module6.toshibaAsusTask.toshiba.ToshibaModel1;
import javabasic.module6.toshibaAsusTask.toshiba.ToshibaModel2;

public class Main {
	  public static void main(String[] args) {
	        Sony sonyModel1 = new Sony("Sonymodel1", 4, 6, 9 );
	        Lenovo lenovoModel1 = new Lenovo("Lenovomodel1", 3, 5, 8);

	        sonyModel1.writeDisc();
	        lenovoModel1.writeDisc();
	        
	        
	        AsusModel1 modelAsus1 = new AsusModel1("Asusmodel1");
	        AsusModel2 modelAsus2 = new AsusModel2("Asusmodel2");
	        
	        ToshibaModel1 modelToshiba1 = new ToshibaModel1("ToshibaModel1");
	        ToshibaModel2 modelToshiba2 = new ToshibaModel2("ToshibaModel2");
	        
	        modelAsus1.connect();
	        modelAsus2.printStartScreen();
	        modelAsus1.on();
	        modelToshiba1.reboot();
	        modelAsus1.writeDisc();
	        modelAsus1.off();
	        modelToshiba1.lightKeaboard();
	        modelAsus1.workFromBattery();
	    }
	  
	  
}
