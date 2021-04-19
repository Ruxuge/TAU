package runer;

import functions.createStrings.Clock;
import functions.createStrings.Hello;
import starter.Start;

import static starter.Start.start;

public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.sayHello());
        Clock clock = new Clock();
        System.out.println("The current local time is: " + clock.currentTime());
        Start start = new Start();
        start();
    }
}