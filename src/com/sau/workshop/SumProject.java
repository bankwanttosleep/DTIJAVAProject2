package com.sau.workshop;
import java.util.Scanner;

public class SumProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number 1: ");
            float num1 = scanner.nextFloat();

            System.out.print("Enter Number 2: ");
            float num2 = scanner.nextFloat();

            float sum = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = "  + sum);
            System.out.println("--------------------");

            if (sum > 500) {
                break;
            }
        }

        scanner.close();
    }
}
