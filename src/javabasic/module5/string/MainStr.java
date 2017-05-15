package javabasic.module5.string;

public class MainStr {
    public static void main(String[]args){ 
    	
    	Integer int1;
    	Integer int2;
    	int i;
    	
    	int1 = 100;
    	System.out.println(int1);


		//1. Применить к одному из объектов автораспаковку, затем операцию инкремента и автоупаковку.
		//Вывести новое значение на печать.


		//автораспаковкаи и автоупаковка автоматически
		++int1;
		//Integer int1 = i; //автоупаковка
		System.out.println(int1);



		//2.Применить к одному из объектов автораспаковку,
		//добавить треть значения этого примитива и упаковать во второй объект. Вывести в консоль.

		//автораспаковкаи и автоупаковка автоматически
    	int2 = int1 + (int1 / 3);
    	System.out.println(int2);
    	
    	i = int1 + (int1 / 3);
    	System.out.println(i);
    }

}
