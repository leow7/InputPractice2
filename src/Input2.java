//NAME - Leo Wang
//DATE - 9/15/2023
//PURPOSE - define, input, and print variables

import java.util.Scanner;

public class Input2
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter your first name :: ");
        firstName = keyboard.next();

        System.out.print("Enter your last name :: ");
        lastName = keyboard.next();

        System.out.println("\n####################");
        System.out.println("####################");
        System.out.println(firstName + " " + lastName);
        System.out.println("####################");
        System.out.println("####################");
        System.out.println(lastName + ", " + firstName);
        System.out.println("####################");
        System.out.println("####################");
    }
}