class Main {
    public static void main (String args[]) {
        SavingAcc logesh = new MyAcc();
        logesh.printName();
        logesh.getMinBalance();

        CurrentAcc shimo = new YourAcc();
        shimo.printName();
        shimo.getBalance();
    }
}

interface Account {
    public String accHolderName = "xxxxx";
    public String accNo = "123456789";

    public void printName();
}

interface SavingAcc extends Account {
    public int minBalance = 10000;
    public int interest = 10;

    public void getMinBalance();
}

interface CurrentAcc extends Account {
    public int balance = 999999;

    public void getBalance();
}

class MyAcc implements SavingAcc {

    @Override
    public void printName () {
        System.out.println(accHolderName);
    }

    @Override 
    public void getMinBalance() {
        System.out.println(minBalance);
    }
}

class YourAcc implements CurrentAcc {

    @Override
    public void printName () {
        System.out.println(accHolderName);
    }

    @Override
    public void getBalance() {
        System.out.println(balance);
    }
}
