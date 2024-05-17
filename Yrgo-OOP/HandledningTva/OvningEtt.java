public class OvningEtt {
    public static void main(String[] args) {
        PrimTal newPrimtal = new PrimTal();
        newPrimtal.setNumber(3);
        for (int i = 0; i <= 99; i++) {
            System.out.println(newPrimtal.toString());
            newPrimtal.increaseNumber();
        }
    }
}