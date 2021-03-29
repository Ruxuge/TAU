package main;
import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while(exit) {

            System.out.println(" Welcome to Java Calculator\n");

            System.out.println("\n Please enter two numbers");

            System.out.print("\n First number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
            String operation = scanner.next();

            System.out.print("\n Second number: ");
            int secondNumber = scanner.nextInt();

            switch (operation) {
                case "*":
                    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + MultiplicationFunction(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + DivisionFunction(firstNumber, secondNumber));
                    break;
                case "+":
                    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + AddFunction(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + SubtractionFunction(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("\n Please select a valid character");
            }
            System.out.println("Do you want use calculator again ?\n");
            System.out.println("If you want use it again type y.\n");
            System.out.println("In other way type n.\n");

            String choose = scanner.next();

            switch (choose){
                case "y":
                    exit = true;
                    break;
                default:
                    exit = false;
                    break;
            }

        }
        scanner.close();
        System.out.println(" Closing Application ");
    }

    public static int MultiplicationFunction(int a, int b){
        int sum = a * b;
        return sum;
    }

    public static int AddFunction(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int SubtractionFunction(int a, int b){
        int sum = a - b;
        return sum;
    }

    public static int DivisionFunction(int a, int b){
        int sum = a / b;
        return sum;
    }

}