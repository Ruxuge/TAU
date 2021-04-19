package starter;
import functions.createStrings.Menu;

import java.util.Scanner;

import static starter.BasicCalculator.bCalculator;
import static starter.CalclatorNWD.nwdCalculator;
import static starter.CalculatorNWW.nwwCalculator;
import static starter.ExtendCalculator.eCalculator;
import static starter.FractionCalculator.fCalculator;

public class Start {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In this program you can calculate everything\n");
        System.out.println("Choose what you want: \n");

        Menu menu = new Menu();
        System.out.println(menu.CreateMainMenu());

        int calc = scanner.nextInt();
        int x, y;


        switch (calc) {
            case 1:
                bCalculator();
                break;
            case 2:
                nwdCalculator();
                break;
            case 3:
                nwwCalculator();
                break;
            case 4:
                eCalculator();
                break;
            case 5:
                fCalculator();
            case 9:
                System.out.println("GoodBay");
                break;
            default:
                System.out.println("\n Please select a valid character");
        }
        scanner.close();
    }
}
