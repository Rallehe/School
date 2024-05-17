import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company company = new Company("Java javanssson", "Java", 6942042, 13371337, 73317331);
        
        boolean menu = true;
        while(menu){
            System.out.println(company);
            System.out.println("What do you wish to do with your company?\n" +
            "1) Change manager\n" + 
            "2) Add or remove assets\n" +
            "3) Add or remove debt\n" +
            "4) Quit");

            int choise = input.nextInt();
            input.nextLine();
            switch (choise){
                case (1):
                System.out.println("Who is your new manager?");
                String newManagerName = input.nextLine();
                company.setManagerName(newManagerName);
                break;

                case (2):
                System.out.println("How much would you like to add or remove from your assets?");
                int updateAssets = input.nextInt();
                int assetsNow = company.getTotalAssets();
                int assetsResult = assetsNow + updateAssets;
                company.setTotalAssets(assetsResult);
                break;

                case (3):
                System.out.println("How much would you like to add or remove from your assets?");
                int updateDebt = input.nextInt();
                int debtNow = company.getTotalDebt();
                int debtResult = debtNow + updateDebt;
                company.setTotalDebt(debtResult);
                break;

                case (4):
                menu = false;
                break;
            }
        }
    }
}
