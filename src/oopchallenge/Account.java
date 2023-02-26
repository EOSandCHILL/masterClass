package oopchallenge;

public class Account {
    public static void main(String[] args) {

    }

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println(
                "Deposit of $" + depositAmount + " made. New balance is $" +
                        accountBalance
        );
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account!");
        } else {

            accountBalance -= withdrawalAmount;
            System.out.println(
                    "Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" +
                            accountBalance
            );
        }
    }
}
