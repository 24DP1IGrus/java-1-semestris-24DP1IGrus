package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer a = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer b = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        Integer c = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is " + ((a + b + c) / 3.0));

        scanner.close();
    }
}
