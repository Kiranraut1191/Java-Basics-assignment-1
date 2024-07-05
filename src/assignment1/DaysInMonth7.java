package assignment1;

import java.util.Scanner;

public class DaysInMonth7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Calculate the number of days in the given month and year
        int daysInMonth;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2:  // February
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month. Month should be between 1 and 12.");
                daysInMonth = -1; // Default value to handle invalid input
                break;
        }
        
        scanner.close();

        // Print the number of days in the month
        if (daysInMonth != -1) {
            System.out.println("Number of days in month " + month + " in year " + year + " is: " + daysInMonth);
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
