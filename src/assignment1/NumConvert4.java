package assignment1;



	import java.util.Scanner;

	public class NumConvert4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number in inches
	        System.out.print("Enter a number in inches: ");
	        double inches = scanner.nextDouble();

	        // Conversion factor from inches to meters
	        final double INCHES_TO_METERS = 0.0254;

	        // Convert inches to meters
	        double meters = inches * INCHES_TO_METERS;
	        
	        scanner.close();

	        // Print the result
	        System.out.println(inches + " inches is equal to " + meters + " meters.");
	    }
	}

