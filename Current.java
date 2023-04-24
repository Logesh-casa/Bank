import java.util.LinkedList;

class Current extends Account {
    Current (String accHolderName) {
        this.accHolderName = accHolderName;
        this.balance = 0;
        this.history = new LinkedList<>();
    }

    @Override
    void endOfDay() {
        System.out.println("This is a current account, end of day only available on savings account".toUpperCase());
    }
}