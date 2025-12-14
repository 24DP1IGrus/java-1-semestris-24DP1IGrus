package rvt;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThree(2, 10);
    }

    public static void divisibleByThree(int start, int end) {
        for (; start <= end; start++) {
            if (start % 3 == 0)
                System.out.println(start);
        }
    }
}
