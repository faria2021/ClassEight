package javaException;
                                               import java.util.InputMismatchException;
//in java this is called a unchecked exception,because there is no errors showing in the code.
import java.util.Scanner;                      //Javac filename.java>> checked exception.compiled it.
                                               //java filename>> unchecked exception
                                               //the is two kinds of exception -checked and unchecked exception.
public class TryCatchFinally {                 //they need to handle exception by there code
                                               //by try and catch you will catch problem that you already aware of.and you are making it pretty by saying try it again. 
	public static void main(String[] args) {
	
	 
		 //Try Catch block
try {

	System.out.println("this is the division calculator");

Scanner userInput = new Scanner(System.in);



System.out.println("give me the first number");

int a = userInput.nextInt();

System.out.println("give me the second number");
	
	int b = userInput.nextInt();
	
	System.out.println("result: "  + a/b);
}
catch(ArithmeticException e) {
	//e.printStackTrace();
	System.out.println("try running again ,i think your second input was 0.and thats not possible");
	
}

catch(InputMismatchException e) {
	//e.printStackTrace();
	System.out.println("try running again.your input data type was wrong");//you can have multipule try and catch block in same class.
	
}
catch(Exception e) { //this is a generic exception you can catch int or static exception by using this Exception.it will catch every kind s of exception.
	//e.printStackTrace();
	System.out.println("try running again.your input data type was wrong");//you can have multipule try and catch block in same class.
	//if i didnot catch the error it not going to go to the cateh optoing and the rest of the code not going to print .it will stop right away .if it catch the error
	//then it will do the hole work.print rest of the code to.
}
finally {
	System.out.println("finally block");//the finally block will exequit even if you dont get to catch your execption.finally code will exequte even the after 
	
}                          


System.out.println("more code after try catch");
	}
	
}
