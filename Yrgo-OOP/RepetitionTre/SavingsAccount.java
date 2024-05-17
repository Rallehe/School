public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, int totalAmount) {
        super(accountNumber, totalAmount);
    }

    @Override
    public int addMoney() {
        totalAmount += addMoney() + 50;
        return totalAmount;
    }

    @Override
    public int withdrawMoney() {
        totalAmount -= withdrawMoney();
        return totalAmount;
    }

}
