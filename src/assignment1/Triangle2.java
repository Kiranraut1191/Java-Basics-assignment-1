package assignment1;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        scanner.close();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Print the area of the triangle
        System.out.println("Area of the triangle: " + area);
    }
}
