package starter;

import functions.createStrings.Menu;
import functions.mathFunction.*;
import functions.others.EndSwitch;

import java.util.Scanner;

import static functions.mathFunction.ExtensionMathFunc.*;

public class ExtendCalculator {
    public static void eCalculator() {
        Scanner scanner = new Scanner(System.in);
        MoreFunction moreFunction = new MoreFunction();

        int secondNumber = 0;

        boolean exit = true;
        while(exit) {

            System.out.print("\n First number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("\n Please choose function ");

            Menu menu = new Menu();
            System.out.println(menu.CreateExtendMenu());
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("\n Second number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println(firstNumber + " mod " + secondNumber + " = " + Modulo(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Sqrt from " + firstNumber + " = " + Sqrt(firstNumber));
                    break;
                case 3:
                    System.out.print("\n Second number: ");
                    secondNumber = scanner.nextInt();
                    if (moreFunction.betterThen(firstNumber, secondNumber)) {
                        System.out.println(firstNumber + " is better then " + secondNumber);
                    }else {
                        System.out.println(secondNumber + " is better then " + firstNumber);
                    }
                    break;
                    case 9:
                    System.out.println("GoodBay");
                    break;
                default:
                    System.out.println("\n Please select a valid character");
                    break;
            }

            EndSwitch endSwitch = new EndSwitch();
            endSwitch.endSwitch(exit);

        }
        scanner.close();
        System.out.println(" Closing Application ");
    }
}
