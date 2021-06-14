package JavaCollection;

import java.util.ArrayList;// ArrayList is the most used in work life.
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Array
		//Array:1.By knowing the values
		
		String[] Students = {"tom","time","jane"};
       
		//2.By knowing the number of values
		String[] names = new String[5];
		
		//3.sometime you may not know how many values you have and you dont know the adject values.group of data Arraylist
		//ArrayList = dynamic in size
		
		//List<objectDataType> identifier = new TypeOfList<objectDataType>//non permeative data.by writing hole word you can make int a non permeative data like string
		
		//List<Integer> al = new ArrayList<Integer>();
		
		//List<Character> al1 = new ArrayList<Character>();
		
		//List<Boolean> al3 = new  ArrayList<Boolean>();  //YOU HAVE TO WRITE DATA TYPE WITH BIGERCASE AND FUL SPELLING THEN IT WILL BE NON permeative data.
		
		 
		
		//or this way both way you can write
		
		//ArrayList<String> al4 = new  ArrayList<String>(); 
		
		List<String> tfClass = new  ArrayList<String>();
		
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
