package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double bal) {
        balance = bal;
    }

    public void eatAffordably() {
        if (balance - 2.6 >= 0) {
            balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance - 4.6 >= 0) {
            balance -= 4.6;
        }
    }

    public void addMoney(double money) {
        if (money < 0)
            return;

        balance += money;
        balance %= 151;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
