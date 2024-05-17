public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, int totalAmount) {
        super(accountNumber, totalAmount);
    }

    @Override
    public int addMoney() {
        this.totalAmount += addMoney();
        return totalAmount;
    }

    @Override
    public int withdrawMoney() {
        this.totalAmount -= withdrawMoney() + 100;
        return totalAmount;
    }

}
