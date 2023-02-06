package org.example;
import java.util.Scanner;
abstract class Calculator {
    int num1, num2;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
     abstract int calculate();
}
class Addition extends Calculator {
    @Override
    int calculate() {
    return num1 + num2;
    }
}
class Subtraction extends Calculator {
    @Override
    int calculate() {
        return num1 - num2;
    }
}
class Multiplication extends Calculator {
    @Override
    int calculate() {
        return num1 * num2;
    }
}
class Division extends Calculator {
    @Override
    int calculate() {
        return num1 / num2;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        while (true) {
            System.out.println("\n choose a option");
            System.out.println("choose the options to perform operations ");
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 0 to exit");
            int choice = sc.nextInt();
            Calculator c = null;
            switch (choice) {
                case 1:
                    c = new Addition();
                    break;
                case 2:
                    c = new Subtraction();
                    break;
                case 3:
                    c = new Multiplication();
                    break;
                case 4:
                    c = new Division();
                    break;
                default:
                    sc.close();
                    System.exit(0);
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
            c.setNum1(num1);
            c.setNum2(num2);
            System.out.println("Result: " + c.calculate());
        }
    }
}