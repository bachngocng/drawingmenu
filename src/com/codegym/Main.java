package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw a triangle");
        System.out.println("2.Draw a square");
        System.out.println("3.Draw a rectangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Draw a triangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * ");
                System.out.println("* * * *  ");
                System.out.println("* * *  ");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw a square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw a Rectangle");
                System.out.println("* * * * * * * * *");
                System.out.println("* * * * * * * * *");
                System.out.println("* * * * * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }

    }
}
