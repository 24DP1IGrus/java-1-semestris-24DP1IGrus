package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int skruvesPrice = 5;
        final int uzgrieznesPrice = 3;
        final int paplaknesPrice = 1;

        System.out.print("Skruvju skaits: ");
        Integer skruves = Integer.valueOf(scanner.nextLine());

        System.out.print("Uzgrieznu skaits: ");
        Integer uzgrieznes = Integer.valueOf(scanner.nextLine());

        System.out.print("Paplaksnu skaits: ");
        Integer paplaknes = Integer.valueOf(scanner.nextLine());

        if (uzgrieznes < skruves && paplaknes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu un paplaksnu");
        } else if (uzgrieznes < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        } else if (paplaknes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        } else {
            System.out.println("Pasutijums ir kartiba.");
        }

        System.out.println(
                "Kopeja cena: " + (skruves * skruvesPrice + uzgrieznes * uzgrieznesPrice + paplaknes * paplaknesPrice));

        scanner.close();
    }
}