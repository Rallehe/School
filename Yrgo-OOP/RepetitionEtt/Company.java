import java.util.Scanner;

public class Company {
    private String managerName;
    private String companyName;
    private int organizationNumber;
    private int totalAssets;
    private int totalDebt;

    public Company (String managerName, String companyName, int organizationNumber, int totalAssets, int totalDebt){
        this.managerName = managerName;
        this.companyName = companyName;
        this.organizationNumber= organizationNumber;
        this.totalAssets = totalAssets;
        this.totalDebt= totalDebt;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(int organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public int getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(int totalAssets) {
        this.totalAssets = totalAssets;
    }

    public int getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(int totalDebt) {
        this.totalDebt = totalDebt;
    }

    public String toString(){
        return ("Your company manager is "+ this.managerName + ", company name "+ this.companyName + " and organizationnumber is " + this.organizationNumber +
        ".\nYou have a total of " + this.totalAssets +" in assets and " + totalDebt + " in debt.");
    }
}
