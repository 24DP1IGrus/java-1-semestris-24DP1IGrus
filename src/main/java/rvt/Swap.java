package rvt;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nGive two indicies to swap:");

        int a = Integer.valueOf(reader.nextLine());
        int b = Integer.valueOf(reader.nextLine());

        numbers[a] ^= numbers[b];
        numbers[b] ^= numbers[a];
        numbers[a] ^= numbers[b];

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        reader.close();
    }
}
