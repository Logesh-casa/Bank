import java.util.LinkedList;

class Savings extends Account {
    double minBalance;
    double interest;

    Savings (String accHolderName) {
        this.accHolderName = accHolderName;
        this.minBalance = 5000;
        this.interest = 0;
        this.balance = 0;
        this.history = new LinkedList<>();
    }

    @Override
    boolean withDrawl(double amount) {
        if (balance >= 5000) {
            balance -= amount;
            history.add(new Transaction(amount , "-"));
            return true;
        }
        return false;
    } 

    @Override
    void endOfDay() {
        this.balance += this.balance * 0.01;
    }
}