package rvt;

public class AdavancedAstrology {
    public static void main(String[] args) {
        cristmasTree(10);
    }

    public static void printSpaces(int number) {
        for (; number > 0; number--)
            System.out.print(" ");
    }

    public static void printStars(int number) {
        for (; number > 0; number--)
            System.out.print("*");
    }

    public static void printTriangle(int number) {
        for (int i = 0; i < number; i++) {
            printSpaces(number - i - 1);
            printStars(i + 1);
            System.out.println();
        }
    }

    public static void cristmasTree(int number) {
        // tree top
        for (int i = 0; i < number; i++) {
            printSpaces(number - i - 1);
            printStars(i * 2 + 1);
            System.out.println();
        }

        // base
        for (int i = 0; i < 2; i++) {
            printSpaces(number - 2);
            printStars(3);
            System.out.println();
        }
    }
}
