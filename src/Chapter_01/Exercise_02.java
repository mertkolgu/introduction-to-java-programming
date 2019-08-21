package Chapter_01;

/*
    (Display five messages)
    Write a program that displays Welcome to Java five times.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        // solution one

        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        // solution two

        System.out.print("Welcome to Java"
                + "\nWelcome to Java"
                + "\nWelcome to Java"
                + "\nWelcome to Java"
                + "\nWelcome to Java");
    }
}