package javaException;

import java.util.Scanner;

public class FlagAndCounter {

	public static void main(String[] args) {
		//Flag= boolean value something is true the value is one
		//Counter= is counting somthing
		
		System.out.println("this is the division calculator");

		Scanner userInput = new Scanner(System.in);



		System.out.println("give me the first number");

		int a = userInput.nextInt();

		System.out.println("give me the second number");
			
			int b = userInput.nextInt();
			
			System.out.println("result: "  + a/b);
			
			int counter = 0;
			boolean flag = true;// true false value.memorie.concept clear koro.
			
			
			for(int i=a; i<=b; i++) {
				
				System.out.println(i);
				
				if(i==0) {
					flag= false;
				}
				
				if(flag) {
					
					if(i%3==0) {
						
						//System.out.println("divisible by 3");
						
						counter++;
					}
					
				}
				
				else {
					
				}
				System.out.println("total amount: " + counter);
				
			}
			//divisible by 3 ,multiple of 3 like 15, 10,5//mod in jave mod sige is %.you can get a number without getting any reminder,
			
		}

	}


