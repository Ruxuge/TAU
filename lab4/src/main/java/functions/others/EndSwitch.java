package functions.others;

import starter.Start;

import java.util.Scanner;

import static starter.Start.start;

public class EndSwitch {
    public void endSwitch(boolean exit) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want use basic calculator again ?\n");
        System.out.println("If you want use it again type 'Y'.\n");
        System.out.println("Or click 'A' to use other option in this app.\n");
        System.out.println("If you want exit app type 'X'");

        String choose = scanner.next();

        switch (choose) {
            case "y":
                exit = true;
                break;
            case "a":
                Start start = new Start();
                start();
                scanner.close();
                break;
            case "x":
                exit = false;
                break;
            default:
                exit = false;
                break;

        }
        scanner.close();
    }
}
