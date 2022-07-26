package IntroductionToJava;

/**
 * a = a+5, we can write a += 5. 
 * Ternary operator = Replacement of If-Else loop
   	condition ? if true : if false
 */

// Program to find out greater of 3 numbers

public class TernaryOperator {

	public void greaterNumber() {
		
		int a = 20, b= 30, c= 15, result;
		
//		int result_intermediate = a>b?a:b;
//		result = result_intermediate > c ? result_intermediate :c;
//		
		result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		
		System.out.println("Highest Number:");
		
		System.out.println(result);
	}

}
