interface SavingAcc extends Account {
    public int minBalance = 10000;
    public int interest = 10;

    public void getMinBalance();
}