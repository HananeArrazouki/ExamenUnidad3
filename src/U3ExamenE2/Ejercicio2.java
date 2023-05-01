package U3ExamenE2;

/**
 * @author hanane
 *
 */
public class Ejercicio2 {

	private int num1;
	private int num2;
	
	
	/**
	 * @param num1
	 * @param num2
	 */
	public Ejercicio2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * @return the factorial of num1 whenever it is greater than 0, else returns 0.
	 */
	public int factorial () {
		int fact=0;
		
		if (lessOfZero(num1)) {
			System.out.println("To calculate the factorial you must enter a number greater than 0");
			
		}else {
			fact = fact +1;
			for (int i = 2; i<= num1; i++) {
				fact *= i;
			}
		}
			
		return fact;
	}
	
	/**
	 * @param num
	 * @return true if the number is less of 0.
	 */
	public boolean lessOfZero (int num) {
		
		return (num<0);
	}

	/**
	 * @return: the rounded arithmetic mean of two integers.
	 */
	public int arithmeticMean () {
		int mean;
		
		mean = (num1+num2)/2;
		mean = Math.round(mean);
				
		return mean;
	}
	
	/**
	 * @return: Concatenation of two integer numbers.
	 */
	public int concatenate () {
		int result;
		
		String sA = String.valueOf(num1);
		String sB = String.valueOf(num2);

		String res = sA + sB;

		result = Integer.parseInt(res);
		
		return result;
	}	
}