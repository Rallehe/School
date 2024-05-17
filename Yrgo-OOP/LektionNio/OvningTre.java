import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vilket språk vill du översätta till? (Rovar/All)");
        String choise = input.nextLine();
        if (choise.equalsIgnoreCase("rovar")) {
            Rovar convertRovar = new Rovar();
            convertRovar.rovar(input);
        }
        else if (choise.equalsIgnoreCase("all")) {
            All convertAll = new All();
            convertAll.all(input);
        }
    }
}
