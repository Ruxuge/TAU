package starter;

import functions.others.EndSwitch;

import java.util.Scanner;

import static functions.mathFunction.MoreFunction.NWD;

public class CalculatorNWW {
    public static void nwwCalculator(){
            Scanner scanner = new Scanner(System.in);
            boolean exit = true;

            while (exit) {

                System.out.println("Type first number: ");
                int x = scanner.nextInt();
                System.out.println("Type second number: ");
                int y = scanner.nextInt();
                int sum = (NWD(x, y));
                System.out.println("Result is " + sum + "\n");

                EndSwitch endSwitch = new EndSwitch();
                endSwitch.endSwitch(exit);



            }
            scanner.close();
            System.out.println(" Closing Application ");
        }
    }
