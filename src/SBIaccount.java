import java.util.UUID;

public class SBIaccount implements Bank {
 private  int balance;
 private int ROI;
private String Name;
private String password;
private UUID accountNumber;
public SBIaccount(String Name,String password){
this.Name=Name;
this.password=password;
this.accountNumber=UUID.randomUUID();
this.balance=0;
}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public boolean addMoney(int amount) {
        balance+=amount;
        return true;
    }

    @Override
    public boolean withDraw(int amount) {
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        else return false;
    }

    @Override
    public int rateOfIntrest() {
        return this.ROI;
    }
    @Override
    public int totalIntrest(int loanAmount,int timePeriod){
return loanAmount*ROI*timePeriod/100;
    }
}
