public class basic2 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.addDetails(123456789,"Dip",100000,8);
        a1.calculateInterest();
        a1.displayAccountDetails();
        Account a2 = new Account();
        a2.addDetails(123456782,"Dp",200000,8);
        a2.calculateInterest();
        a2.displayAccountDetails();
    }
}

class Account{
    int accountNumber;
    String custName;
    int balance;
    int interestRate;
    int Total;

    public void addDetails(int accountNumber,String custName,int balance,int interestRate){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public void calculateInterest(){
        this.balance = balance + (interestRate*balance)/100;
    }

    public void displayAccountDetails(){
        System.out.println("accountNumber: "+ accountNumber + "\ncustName: "+ custName  + "\ninterest with balance: " + balance);
    }
}