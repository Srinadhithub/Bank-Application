public interface Bank {
    int checkBalance();
    void setBalance( int balance);
    boolean addMoney(int amount);
    boolean withDraw(int amount);
    int rateOfIntrest();
    int totalIntrest(int loanAmount,int timePeriod);
}
