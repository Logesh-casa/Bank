class ParseInput {
    static Account parseCreateAccount (String[] details) {
        String accHolderName = details[2];
        String accType = details[1].toLowerCase();
        Account account = null;

        switch (accType) {
            case "savings":
                account = new Savings(accHolderName);
                break;
            case "current":
                account = new Current(accHolderName);
                break;
            default:
                account = new Current(accHolderName);
                break;
        }

        return account;
    }

    static Deposit parseDeposit (String[] details) {
        int accNo = Integer.parseInt(details[1]);
        double amount = Double.parseDouble(details[2]);

        return new Deposit(accNo, amount);
    } 

    static int parseBalance (String[] details) {
        return Integer.parseInt(details[1]);
    }

    static Deposit parseWithdrawl (String[] details) {
        return new Deposit(Integer.parseInt(details[1]), Double.parseDouble(details[2]));
    }

    static int parseEnd(String[] details) {
        return Integer.parseInt(details[2]);
    }

    static int parseStatement(String[] details) {
        return Integer.parseInt(details[1]);
    }
}