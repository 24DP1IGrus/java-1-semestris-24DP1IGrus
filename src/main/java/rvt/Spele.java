package rvt;

import java.util.Random;
import java.util.Scanner;

public class Spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es domaju par skaitli no 1 lidz 10.\nTev tas jauzmin tris meginajumos.");

        Random random = new Random();

        int num = random.nextInt(10) + 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadi minejumu:");

            int guess = Integer.valueOf(scanner.nextLine());

            if (num == guess) {
                System.out.println("PAREIZI!!!");
                System.out.println("Tu esi uzvarejis speli.");

                scanner.close();
                return;
            }
            System.out.println("nepareizi");
        }

        System.out.println("Pareizajs skaitlis bija " + num + ".");
        System.out.println("Tu esi zaudejis speli.");

        scanner.close();
    }
}
