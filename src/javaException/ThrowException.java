package javaException;//throw used for making a error on perpass,it one of handling the error ,one porpose,what ever error s you want to through.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		//throw new InputMismatchException("KJFDSJDFKS");
		
		System.out.println("this is division calculator");
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("give me the first number");
		int a = userInput.nextInt();
		
		System.out.println("give me the second number");
		int b = userInput.nextInt();
		
		if(b==0) {
			
			throw new ArithmeticException("can not put 0 in here");
		}
		else {
		System.out.println(" result :" + a/b);}

	}

}
