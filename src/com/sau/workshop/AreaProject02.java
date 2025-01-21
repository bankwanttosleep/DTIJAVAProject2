package com.sau.workshop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("       Shape Area Program        ");
        System.out.println("+++++++++++++++++++++++++++++++++");

        System.out.println("Please select an option:");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Select menu: ");


        int choice = Integer.parseInt(reader.readLine());
        System.out.println("+++++++++++++++++++++++++++++++++");

        switch (choice) {
            case 1:
                System.out.print("Input widths: ");
                double width = Double.parseDouble(reader.readLine());
                System.out.print("Input longs: ");
                double length = Double.parseDouble(reader.readLine());
                double areaRectangle = width * length;
                System.out.println("Area of Rectangle: " + areaRectangle);
                System.out.println("+++++++++++++++++++++++++++++++++");
                break;

            case 2:
                System.out.print("Input bases: ");
                double base = Double.parseDouble(reader.readLine());
                System.out.print("Input highs: ");
                double height = Double.parseDouble(reader.readLine());
                double areaTriangle = (base * height) / 2;
                System.out.println("Area of Triangle is : " + areaTriangle);
                System.out.println("+++++++++++++++++++++++++++++++++");
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = Double.parseDouble(reader.readLine());
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
