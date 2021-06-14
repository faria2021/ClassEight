package javaException;
//one if and else is in another if and else its called nested.
import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		System.out.println("this is the division calculator");

		Scanner userInput = new Scanner(System.in);



		System.out.println("give me the first number");

		int a = userInput.nextInt();

		System.out.println("give me the second number");
			
			int b = userInput.nextInt();
			
			if(a==50) {
				if(b==0) {
					b=1;
					System.out.println(b);
				}
				else {
					b=2;
					System.out.println(b);
				}
			}
			
			else {
				System.out.println("result: "  + a/b);
			}
			
			
		}

	}


