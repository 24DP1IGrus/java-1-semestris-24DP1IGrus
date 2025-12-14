package rvt;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int start) {
        for (; start >= 1; start--) {
            System.out.println(start);
        }
    }
}
