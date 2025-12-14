package rvt;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer a = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer b = Integer.valueOf(scanner.nextLine());

        System.out.println(a + " + " + b + " = " + (a + b));

        scanner.close();
    }
}
