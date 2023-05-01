package U3ExamenE2;

import java.util.Scanner;

/**
 * @author hanane
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int num1, num2;
		
		//We declare an object of the Scanner class
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Introduce the first number: ");
		num1 = input.nextInt();
		System.out.println("Introduce the second number: ");
		num2 = input.nextInt();
		
		Ejercicio2 ejer2 = new Ejercicio2(num1, num2);
		
		//Show the factorial of the: num1
		System.out.println("The factorial of " + num1 + " is: " + ejer2.factorial());
		
		//Show the rounded arithmetic mean of num1 and num2
		System.out.println("The rounded arithmetic mean of: " +
		num1 + " and: " + num2 + " is: " + ejer2.arithmeticMean());
				
		
		//Show number by concatenating num1 with num2
		System.out.println("By concatenating: " +
		num1 + " and " + num2 + " gives us: " + ejer2.concatenate());
		
		//Close the object
		input.close();
	}
}
