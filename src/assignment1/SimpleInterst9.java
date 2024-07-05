package assignment1;



	import java.util.Scanner;

	public class SimpleInterst9 
	{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter principal amount, rate of interest, and time duration
	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the annual interest rate (as a percentage): ");
	        double rate = scanner.nextDouble();

	        System.out.print("Enter the time duration in years: ");
	        double time = scanner.nextDouble();

	        // Calculate simple interest
	        double simpleInterest = (principal * rate * time) / 100;

	        // Print the calculated simple interest
	        System.out.println("Simple Interest: " + simpleInterest);

	        scanner.close();
	    }
	}

