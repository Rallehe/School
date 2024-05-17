import java.util.Scanner;

public class PrimTalTva {
    private int number;

    public int getNumber() {
        return number;
    }
    
    public void setNumber() {
        this.number = 1;
    }
    
    public void increaseNumber() {
        this.number += 2;
    }
    public void input(Scanner input) {
        int chooseNumber = input.nextInt();
        number = chooseNumber;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
    public String toString() {
        if (isPrime(number)) {
            return "Primtal [number=" + number + "]";
        }
        else {
            return "";
        }
    }

}