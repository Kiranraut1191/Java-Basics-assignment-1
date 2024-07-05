package assignment1;

public class Rectangle1 {

	// Fields to store the dimensions of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the dimensions of the rectangle
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Rectangle object with given length and width
        Rectangle1 rect = new Rectangle1(5.0, 3.0);

        // Calculate and print the area
        double area = rect.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Calculate and print the perimeter
        double perimeter = rect.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}