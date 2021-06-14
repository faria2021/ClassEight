package JavaCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<String> tfClass = new  HashSet<String>();
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
		//tfClass.remove(3);                            //its a dianamic.
		tfClass.remove("alm");
		tfClass.remove("java");
		
		
		System.out.println(tfClass.size());                              // because its random it does not know which one to remove.you have to specificly tale me which value you want to remove.
		
		System.out.println("===========================================");  //there will be no duplicat value it take.it will take once.if there is three alm once it will take.
		
		for(String item :tfClass) {                                      //it will print randomly.
			System.out.println(item);                                   //its not remove able ,becaue of it is random thats why it can not remove unic number.
			                                       //to remove you have to specify the name which one you want to remove ,becauee it is random index number not going to work you have to specify the data
		}

	}

}
