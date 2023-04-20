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