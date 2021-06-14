package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
           
		List<String> tfClass = new  LinkedList<String>();
		
		tfClass.add("cns");
		tfClass.add("sql");
		tfClass.add("alm");
		tfClass.add("java");
		tfClass.add("sdlc1");
		tfClass.add("sql4");
		tfClass.add("alm7");
		tfClass.add("java8");
		tfClass.add("sdlc9");
		
		System.out.println(tfClass.size());
		tfClass.remove(3);                        //its a dianamic.
		System.out.println(tfClass.get(0));
		System.out.println(tfClass.get(3));
		
		System.out.println("===========================================");
		
		for(String item :tfClass) {
			System.out.println(item);
			
		}
		

	}

}
