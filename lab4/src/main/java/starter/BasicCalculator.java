package starter;

import functions.others.EndSwitch;

import java.util.Scanner;

import static functions.mathFunction.CalculatorBasicFunc.*;

public class BasicCalculator {
    public static void bCalculator() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while(exit) {

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


            EndSwitch endSwitch = new EndSwitch();
            endSwitch.endSwitch(exit);

        }
        scanner.close();
        System.out.println(" Closing Application ");
    }
}
