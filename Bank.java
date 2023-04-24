import java.util.HashMap;
import java.util.LinkedList;

class Bank {
    HashMap<Integer, Account> accountsList;
    int accNo;

    Bank () {
        accountsList = new HashMap<>();
        accNo = 1;
    }

    void createAccount (Account account) {
        account.accNo = accNo++;
        accountsList.put(account.accNo, account);
        System.out.println("\nCreated account with account number : ".toUpperCase() + account.accNo);
    }

    void deposit(Deposit deposit) {
        Account account = accountsList.get(deposit.accNo);
        account.deposit(deposit);
        accountsList.put(deposit.accNo, account);
        System.out.println("\namount deposited".toUpperCase());
    }

    void getBalance (int accNo) {
        System.out.println("\ncurrent balance : ".toUpperCase() + accountsList.get(accNo).getBalance());
    }

    void withDrawl (Deposit deposit) {
        Account account = accountsList.get(deposit.accNo);

        if (account.withDrawl(deposit.amount)) {
            System.out.println("\nwithdrawl successful".toUpperCase());
        } else {
            System.out.println("\ncurrent balance is less than minimum balance, withdrawl failed.".toUpperCase());
        }
    }   

    void endOfDay(int accNo) {
        Account account = accountsList.get(accNo);
        account.endOfDay();
    }

    void getStatement(int accNo) {
        LinkedList<Transaction> history = accountsList.get(accNo).history;
        
        int end = history.size() <= 5 ? 0 : history.size() - 5;
        for (int i = history.size() - 1; i >= end; i--) {
            System.out.println(history.get(i).amount + history.get(i).sign);
        }
    }
}