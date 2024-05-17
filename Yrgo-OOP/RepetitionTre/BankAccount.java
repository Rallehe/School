public abstract class BankAccount {
    protected int accountNumber;
    protected int totalAmount;
    
    public BankAccount(int accountNumber, int totalAmount) {
        this.accountNumber = accountNumber;
        this.totalAmount = totalAmount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    public abstract int addMoney();
    
    public abstract int withdrawMoney();
    
    public String printAccountDetails(BankAccount myAccount) {
        return "AccountNumber = " + myAccount.accountNumber + "\nTotalAmount = " + myAccount.totalAmount + "\n";
    }
}
