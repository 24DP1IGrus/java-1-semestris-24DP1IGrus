package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegade (0==ne, 1==ja): ");
        int express = Integer.valueOf(scanner.nextLine());

        double piegade = express == 1 ? 3 : 0;
        if (cena < 10) {
            piegade += 2;
        }

        System.out.println("\nRekins:");
        System.out.printf("    %s    %4.2f\n", prece, cena);
        System.out.printf("    piegade    %4.2f\n", piegade);
        System.out.printf("    kopa    %7.2f\n", cena + piegade);

        scanner.close();
    }
}
