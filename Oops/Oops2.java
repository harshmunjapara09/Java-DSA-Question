package Oops;

public class Oops2 {
    public static void main(String[] args) {
        Account c1 = new Account();
        c1.setAccountNumber(1002323232);
        c1.setCustName("Harsh Munjapara");
        c1.setBalance(10000);
        c1.setInterest_rate(7);
        c1.displayAccountDetails();
        c1.calculateInterest();
    }

}

class Account {
    long accountNumber;
    String custName;
    long balance;
    static float interest_rate;
    int interest;
    long p;
    long r;
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setInterest_rate(float interest_rate) {
        Account.interest_rate = interest_rate;
    }

     public void calculateInterest(){
         p=balance;
         r= (int)interest_rate;
        interest = (int)(p*r) / 100;
        long total_balance = balance + interest;
         System.out.println("Interest balance :" + interest);
         System.out.println("Total balance (Including Interest ) :"+total_balance);

     }
    public void displayAccountDetails(){
        System.out.println("Account Number :" +accountNumber);
        System.out.println("Name :"+custName);
        System.out.println("Your Balance :"+balance);
        System.out.println("interest_rate :"+interest_rate+" %");
    }

}
