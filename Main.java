import java.util.Scanner;

class Main {
    static Bank bank = new Bank();

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("\nwaiting for command : ".toUpperCase());
            String input = sc.nextLine();
            if (toQuit(input)) break;
            handleInput(input.split(" "));
        }
    }

    static void handleInput(String[] splitted) {
        String task = splitted[0].toLowerCase();
        
        switch (task) {
            case "create":
                bank.createAccount(ParseInput.parseCreateAccount(splitted));
                break;
            case "deposit":
                bank.deposit(ParseInput.parseDeposit(splitted));
                break;
            case "withdrawl":
                bank.withDrawl(ParseInput.parseWithdrawl(splitted));
                break;
            case "balance":
                bank.getBalance(ParseInput.parseBalance(splitted));
                break;
            case "end":
                bank.endOfDay(ParseInput.parseEnd(splitted));
                break;
            case "statement":
                bank.getStatement(ParseInput.parseStatement(splitted));
                break;
            default:
                break;
        }
    }

    static boolean toQuit(String input) {
        if (input.equals("q")) return true;
        return false;
    }
}