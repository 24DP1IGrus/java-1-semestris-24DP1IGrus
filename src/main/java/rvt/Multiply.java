package rvt;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.println("first number: ");
        double first = Double.valueOf(scanner.nextLine());

        System.out.println("second number: ");
        double second = Double.valueOf(scanner.nextLine());

        double result = first * second;

        System.out.println(first + " * " + second + " = " + result );

        scanner.close();   
    }
}
