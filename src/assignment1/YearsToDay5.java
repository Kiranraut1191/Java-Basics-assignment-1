package assignment1;

	import java.util.Scanner;

	public class YearsToDay5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the number of minutes
	        System.out.print("Enter the number of minutes: ");
	        long minutes = scanner.nextLong();

	        // Define the number of minutes in a day and a year
	        final int MINUTES_IN_A_DAY = 24 * 60;
	        final int MINUTES_IN_A_YEAR = 365 * MINUTES_IN_A_DAY;

	        // Convert minutes to years and days
	        long years = minutes / MINUTES_IN_A_YEAR;
	        long days = (minutes % MINUTES_IN_A_YEAR) / MINUTES_IN_A_DAY;
	        
	        scanner.close();

	        // Print the result
	        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
	    }
	}
