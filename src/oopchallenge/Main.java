package oopchallenge;

public class Main {
    public static void main(String[] args) {
        Account billsAccount = new Account();
        billsAccount.withdrawFunds(100.00);
        billsAccount.depositFunds(250.00);
        billsAccount.withdrawFunds(50);
        billsAccount.withdrawFunds(200);
        billsAccount.depositFunds(100.00);
        billsAccount.withdrawFunds(45.55);
        billsAccount.withdrawFunds(54.46);
        billsAccount.withdrawFunds(54.45);
    }
}
