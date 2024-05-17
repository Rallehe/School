public class PrimTal {
    /**
     * Börja på tre
     * Kolla om det kan delas jämnt med 2 eller upp till hälften av sig själv
     * Lägg på ett på numret
     * Kolla igen
     * fortsätt till 99;
     */
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void increaseNumber() {
        this.number += 2;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
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
