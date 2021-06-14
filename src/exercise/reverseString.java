package exercise;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {// in interview they might told you to writedown the code you just did ,so you have to memorize itthe formula.to put this together.l
		
		//i give you a word ,you reverse it.
		
		//Palendrome:a word is palindrom if it reads the same way when reading backward such madam,level,mom,wow etc
		
		//formula for anytime you want to combind things doesnot matter it could be word,it could be scentences,it could be numbers,character,anythings.
		//formula is first figure it out what kinds of data you are dealing with.at the end of the day it will be string.so before the forloop write a amty string.
		//String finalOutput="  ";create a empty string.
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("give me a word");
		String userData = userInput.next();
		
		userData.toCharArray();
		char[] allCharacters = userData.toCharArray();
		
		String finalOutput ="  ";
		for(int i =allCharacters.length-1; i>=0; i--) {
			finalOutput=  finalOutput + allCharacters[i] ;//this is the formula for combind thins.you just have to rember it.
		}
		System.out.println( "Reversed word: "+  finalOutput);
		
		if(userData.equalsIgnoreCase(finalOutput)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
		
		
	}

}
