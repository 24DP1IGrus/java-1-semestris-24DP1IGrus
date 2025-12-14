package rvt;

public class Counter {
    private int count;

    public Counter(int startValue) {
        count = startValue;
    }

    public Counter() {
        count = 0;
    }

    public int value() {
        return count;
    }

    public void increase() {
        count += 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0)
            return;

        count += increaseBy;
    }

    public void decrease() {
        count -= 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0)
            return;

        count -= decreaseBy;
    }
}
