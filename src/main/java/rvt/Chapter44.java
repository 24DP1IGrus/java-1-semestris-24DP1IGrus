package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex7();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your name: ");

            String[] name = scanner.nextLine().trim().split(" ");
            if (name.length < 2) {
                System.out.println("Please enter valid name and surname!");
                continue;
            }

            System.out.println(name[0] + " " + name[1].toUpperCase());
            break;
        }
        scanner.close();
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        scanner.close();
    }

    public static void ex3() {
        String[] males = { "Elroy", "Fred", "Graham" };
        String[] females = { "Amy", "Buffy", "Cathy" };

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine();
            if (name.isEmpty())
                break;

            String firstname = name.split(" ")[0];

            for (int i = 0; i < 3; i++) {
                if (males[i].equals(firstname)) {
                    System.out.println("Mr. " + name + "\n");
                    break;
                } else if (females[i].equals(firstname)) {
                    System.out.println("Ms. " + name + "\n");
                    break;
                } else if (i == 2)
                    System.out.println(name + "\n");
            }
        }
        scanner.close();
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        int time = scanner.nextInt();

        System.out.println("Your time->  " + time / 100 + ":" + time % 100);

        scanner.close();
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        boolean comment = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("/*")) {
                System.out.println(line);
                comment = true;
            } else if (line.startsWith("*/")) {
                System.out.println(line);
                comment = false;
            } else if (line.startsWith("//") || comment) {
                System.out.println(line);
            }
        }
        scanner.close();
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{7,}$")) {
                System.out.println("Acceptable password.");
                break;
            }
            System.out.println("That password is not acceptable.\n");
        }

        scanner.close();
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length() / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(word.substring(i, word.length() - i));
        }

        scanner.close();
    }
}
