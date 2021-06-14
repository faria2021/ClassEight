package JavaCollection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		
		
		Set<String> tfClass = new  TreeSet<String>();     //  set doesnot deal with duplicat ,hashset is random, linkhashset is in insertion order and tree is in alfabitical order.
		
		                    //set does not work with index number.you have to convert it into an array.
		tfClass.add("cns");
		tfClass.add("sql");              
		tfClass.add("alm");          
		tfClass.add("java");
		tfClass.add("sdlc1");
		tfClass.add("sql4");
		tfClass.add("alm7");
		tfClass.add("java8");
		tfClass.add("sdlc9");
		tfClass.add("alm");
		
		System.out.println(tfClass.size());
		//tfClass.remove(3);                           
		tfClass.remove("alm");
		tfClass.remove("java");
		
		
		System.out.println(tfClass.size());                              
		
		System.out.println("===========================================");  
		
		for(String item :tfClass) {                                      
			System.out.println(item);                                   
			                                       
		}
		System.out.println("===============");
		
		tfClass.toArray();
		Object[] myValuesArray = tfClass.toArray();// this is a built in option,this is how you convert into array.
		System.out.println(myValuesArray[0]);

//in set there is no get option ,like for specific location set,there is nating get.we couldnot get any specific item then we said why dont we converted in to an array,so we took the
//tfClass and convert into an array and we just called out array to myValuesArray and its an object type array,you array has to an object type array.thats how you convert it to a regular array
	}

}
