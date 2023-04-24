import java.util.LinkedList;

abstract class Account {
    protected int accNo;
    protected String accHolderName;
    protected double balance;
    protected LinkedList<Transaction> history;

    double getBalance () { return balance;}
    String getName () { return accHolderName; }
    LinkedList<Transaction> getHistory () { return history; }

    void deposit (Deposit deposit) { 
        balance += deposit.amount; 
        history.add(new Transaction(deposit.amount, "+")); 
    }

    boolean withDrawl(double amount) { 
        balance -= amount; 
        System.out.println("Podhuva iruka withdrawl");
        history.add(new Transaction(amount , "-"));
        return true; 
    }

    abstract void endOfDay ();
}
