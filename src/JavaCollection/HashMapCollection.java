package JavaCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {
                                                       //hashset is random,quicker,linked hashset is insert order,and treeset is alaphabatical order.
	public static void main(String[] args) {
		                                        // set doesnot deal with duplict,list bring duplicat.

	
	
	
	Map<Integer,String> tfClass = new  HashMap<Integer,String>();
	
	//hashmapset works with key value pair.if the key is always o,each key is uniqe .o is the key.key should be uniqe,key must must be uniqe it cannot be the same.
	//if you use o key for all  the size will show wrong ,so ke y should be uniqe for every line.	if one have same key the map will count one vale becaue key are we use same.
	
	    tfClass.put(0, "alm");
		tfClass.put(2,"sql");
		tfClass.put(3 ,"alm");
		tfClass.put(4 ,"java");
		tfClass.put( 5,"sdlc1");
		tfClass.put(6,"sql4");
		tfClass.put(7,"alm7");
		tfClass.put(8,"java8");
		tfClass.put(9,"sdlc9");
		tfClass.put(10,"alm");
		
		System.out.println(tfClass.size());
		tfClass.remove(5);                            
		tfClass.remove(2);//when you remove the key you are removing the value.
		System.out.println(tfClass.values());//ifyou want to read key set you can do it it you want to read value set you can do thay by tfClass.by doing this you will get key set or value set what ever you need
		System.out.println(tfClass.keySet());
		System.out.println(tfClass.get(3));
		System.out.println(tfClass.values());//you can get the value based on the key
		
		
		
		
		
		System.out.println(tfClass.size());                              // because its random it does not know which one to remove.you have to specificly tale me which value you want to remove.
		
		
		
		
		
		System.out.println("===========================================");  //there will be no duplicat value it take.it will take once.if there is three alm once it will take.
		
		for(Integer item :tfClass.keySet()) {                                      //it will print randomly.
			System.out.println(item);                                   //its not remove able ,becaue of it is random thats why it can not remove unic number.
			                                       //to remove you have to specify the name which one you want to remove ,becauee it is random index number not going to work you have to specify the data
		
		for (Entry<Integer, String> item1 : tfClass.entrySet()) {
			System.out.println(item1);
		}
		for (Entry<Integer, String> item1 : tfClass.entrySet()) {
			System.out.println(item1.getKey());
		}
		for (Entry<Integer, String> item1 : tfClass.entrySet()) {
			System.out.println(item1.getValue());
		}
		
		}
	
	
	
	
	
	}

}
