package rvt;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        Integer a = Integer.valueOf(scanner.nextLine());

        if (a % 2 == 0) {
            System.out.println("Number " + a + " is even.");
        } else {
            System.out.println("Number " + a + " is odd.");
        }

        scanner.close();
    }
}
