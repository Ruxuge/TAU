package starter;

import functions.createStrings.Menu;

import static functions.mathFunction.FractionFunction.*;

import functions.others.EndSwitch;

import java.util.Scanner;

public class FractionCalculator {
        public static void fCalculator() {
            Scanner scanner = new Scanner(System.in);

            boolean exit = true;
            while(exit) {

                System.out.println("\n First fraction: ");

                System.out.print("\n Numerator: ");
                int firstNumerator = scanner.nextInt();

                System.out.print("\n Denominator: ");
                int firstDenumerator = scanner.nextInt();

                System.out.println("\n Second fraction: ");

                System.out.print("\n Numerator: ");
                int secondNumerator = scanner.nextInt();

                System.out.print("\n Denominator: ");
                int secondDenumerator = scanner.nextInt();

                System.out.println("\n Please choose function ");



                Menu menu = new Menu();
                System.out.println(menu.CreateFractionenu());
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println(firstNumerator + "/" + firstDenumerator + " + " + secondNumerator + "/" + secondDenumerator + " = " + addFractor( firstNumerator, firstDenumerator, secondNumerator, secondDenumerator ));
                        break;
                    case 2:
                        System.out.println(firstNumerator + "/" + firstDenumerator + " - " + secondNumerator + "/" + secondDenumerator + " = " + subFractor(firstNumerator, firstDenumerator, secondNumerator, secondDenumerator));
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
