package assignment1;

	import java.util.Scanner;

	public class Factorial12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to calculate factorial: ");
	        int number = scanner.nextInt();
	        
	        long factorial = calculateFactorial(number);
	        
	        System.out.println("Factorial of " + number + " = " + factorial);
	        
	        scanner.close();
	    }
	    
	    public static long calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}

