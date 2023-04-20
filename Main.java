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