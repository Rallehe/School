public class RasmusHedinInl1 {
    public static void main(String[] args) {
        byte numberOne = 127;
        short numberTwo = 32767;
        int numberThree = 2147;
        float numberFour = 1.42f;
        double numberFive = 1.4242;
        double numberSix = numberOne + numberTwo + numberThree + numberFour + numberFive;
        System.out.println(numberSix);
        //System.out.println(numberOne + numberTwo + numberThree + numberFour + numberFive);
        
    }
}
