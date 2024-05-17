public class ExOne{
    public static void main(String[] args) {
        

        SavingsAccount savingsAccount = new SavingsAccount(12, 1000);
        savingsAccount.addMoney();
        System.out.println(savingsAccount.printAccountDetails(savingsAccount));
        
    }
}