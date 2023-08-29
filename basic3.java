public class basic3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccountDetails(123456789,"Dip",10000);
        a1.withdraw(5000);
        a1.deposit(4000);
        a1.displayAccountDetails();
        Account a2 = new Account();
        a2.setAccountDetails(123456782,"Dp",20000);
        a2.withdraw(5000);
        a2.deposit(4000);
        a2.displayAccountDetails();
    }
}

class Account{
    int accountNumber;
    String custName;
    int balance;

    public void setAccountDetails(int accountNumber,String custName,int balance){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
    }

    public void withdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
    }

    public void deposit(int depositAmount){
        balance= balance + depositAmount;
    }

    public void displayAccountDetails(){
        System.out.println("accountNumber: "+ accountNumber + "\ncustName: "+ custName +"\nbalance: " + balance );
    }
}