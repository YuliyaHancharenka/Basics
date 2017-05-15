package javabasic.module7.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Collection col1 = createFirstCollection();
		Collection col2 = createSecondCollection();
		System.out.println("===== Demo collection");
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		System.out.println();
		
		System.out.println("===== Demo collection by iterator");
		for (Iterator it = col2.iterator(); it.hasNext();){
			String s = (String)it.next();
			System.out.println("Item" + s);
		}
		System.out.println();
		
//Demo group operations
		System.out.println();
		System.out.println("===== Demo group operations");
	
//Check containsAll
		if( col1.containsAll(col2)){
			System.out.println("Col1 contains all from col2");
		}
		
//Add to col1 all items from col2	
		System.out.println();
		System.out.println("===== Adding to col1");
		col1.addAll(col2);
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
	
//Delete all items from col1 (equals col2)
		System.out.println();
		System.out.println("===== Deleting from col1");
		col1.removeAll(col2);
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		
				
//Recreating collections
		
		col1 = createFirstCollection();
		col2 = createSecondCollection();
		System.out.println();
		System.out.println("===== Deleting from col1 items aren't in col2");
		
		col1.retainAll(col2);
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		
		//Delete all items from col1		
		System.out.println();
		System.out.println("===== Deleting from col1 items");
		
		col1.removeAll(col1);
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		
//Recreating collections
		
		col1 = createFirstCollection();	
		System.out.println();
		System.out.println("===== Demo col1");
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		
		System.out.println();
		System.out.println("===== Demo col1 w/o 3d item");
		
		col1.remove("string3");
		for (Object o : col1) {
			System.out.println("Item" + o);
		}
		
		System.out.println("===== Delete col1 all");
		while(!col1.isEmpty()){
			Iterator it = col1.iterator();
			Object o = it.next();
			System.out.println("Delete:" + o);
			it.remove();
		}
	}

	private static Collection createFirstCollection() {
		Collection<String> col1 = new ArrayList<>();
		col1.add("string1");
		col1.add("string2");
		col1.add("string3");
		col1.add("string4");
		col1.add("string5");
		col1.add("string6");
		col1.add("string7");
		return col1;
	}
	
	private static Collection createSecondCollection() {
		Collection<String> col2 = new ArrayList<>();
		col2.add("string1");
		col2.add("string2");
		col2.add("string3");
		col2.add("string4");
		col2.add("string5");
		return col2;
}
}