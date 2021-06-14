package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tfClass = new  LinkedHashSet<String>();         // duplicat gone,coming orderby alfabatic order.just the way we added them
		tfClass.add("cns");
		tfClass.add("sql");              //common thing about linkhashsetcollection and hashsetcollection is duplicat is not alowed in both
		tfClass.add("alm");          //difference between this two is one is random and one is order by ,followed by way it added
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

	}

}
