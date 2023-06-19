package Oops;

public class Oops3 {
    public static void main(String[] args) {
        saving_Account c1 = new saving_Account();
        c1.setAccountDetails(1212121231,"Harsh Munjapara",9000);
        c1.dispAccountDetails();
        System.out.println();
        System.out.println("Now User Withdraw And deposit ");
        c1.withdraw(1000);
        c1.deposit(2000);
        System.out.println();
        System.out.println("After Withdraw And deposit Amount Account Details");
        System.out.println();
        c1.dispAccountDetails();
    }
}

class saving_Account {
    long accountNo;
    String custName;
    long accountBalance;


    public void setAccountDetails(long accountNo,String custName,long accountBalance){
        this.accountNo = accountNo;
        this.custName = custName;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int withdrawAmount){
        System.out.println("Withdraw Amount :" + withdrawAmount);
        accountBalance -= withdrawAmount;
    }

    public void deposit(int depositAmount){
        System.out.println("Deposit Amount :" + depositAmount);

        accountBalance +=depositAmount;
    }

    public void dispAccountDetails(){
        System.out.println("Your Account No :"+accountNo);
        System.out.println("Name :"+custName);
        System.out.println("Balance  :"+accountBalance);

    }
}
