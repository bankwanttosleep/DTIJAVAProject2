package com.sau.workshop;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("       Shape Area Program        ");
        System.out.println("+++++++++++++++++++++++++++++++++");

        System.out.println("Please select an option:");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Select menu: ");
        int choice = scanner.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++");

        switch (choice) {
            case 1:
                System.out.print("Input widths: ");
                double width = scanner.nextDouble();
                System.out.print("Input longs: ");
                double length = scanner.nextDouble();
                double areaRectangle = width * length;
                System.out.println("Area of Rectangle: " + areaRectangle);
                System.out.println("+++++++++++++++++++++++++++++++++");
                break;

            case 2:
                System.out.print("Input bases: ");
                double base = scanner.nextDouble();
                System.out.print("Input highs: ");
                double height = scanner.nextDouble();
                double areaTriangle = (base * height) / 2;
                System.out.println("Area of Triangle is : " + areaTriangle);
                System.out.println("+++++++++++++++++++++++++++++++++");
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                System.out.printf("Area of Circle: %.2f\n", areaCircle);
                System.out.println("+++++++++++++++++++++++++++++++++");
                break;

            default:
                System.out.println("Thank you for using the program. Goodbye!");
                break;
        }

    }
}
