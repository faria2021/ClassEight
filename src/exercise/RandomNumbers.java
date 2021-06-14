package exercise;

import java.util.Random;
import java.util.TreeSet;

public class RandomNumbers {

	public static void main(String[] args) {
		
		int result = getRandomNumberInRange(100,999) ;                                             // how to get random number.with duplict number will be there.in this code.
        System.out.println(result);
        int result1 =getRandomNumberInRange(100,999) ; 
        System.out.println(result1);
        System.out.println( getRandomNumberInRange(100,999) );
       
        TreeSet<Integer> randomValue = new TreeSet<Integer>();
        
        
//        for (int i = 0; i<500 ; i++) {
//        	System.out.println(getRandomNumberInRange(100,999)  );
//        	
//        	randomValue.add(getRandomNumberInRange(100,999));
//        }   
        while(randomValue.size() != 500) {
        	randomValue.add(getRandomNumberInRange(100,999));
        }
        
        
        
        System.out.println(randomValue);
        System.out.println(randomValue.size());
	}
            
	
	
	 public static int getRandomNumberInRange(int min, int max) {
            	 if (min>=max) {
            		 throw new IllegalArgumentException("maz must be greater than min");
            	 }
            	 Random r = new Random();
            	 return r.nextInt((max - min) + 1) + min;
            	 
	
}
}
