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