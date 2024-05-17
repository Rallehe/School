public class OvningEtt {
    public static void main(String[] args) {
        byte  numberOne = 127;
        short numberTwo = 32767;
        int numberThree = 2147483647;
        long numberFour = 9223372036854775807L;
        float numberFive = 1.234567f;
        double numberSix = 1.1234567891234567891234;
        char numberSeven = 'a';
        //boolean numberEightBool = true;
        System.out.println(numberOne +" byte\n"+ numberTwo +" short\n" +
        numberThree +" int\n"+ numberFour +" long\n"+ numberFive +
        " float\n"+ numberSix +" double\n"+ numberSeven + " char");
    }
}
