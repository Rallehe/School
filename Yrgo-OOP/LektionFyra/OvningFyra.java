public class OvningFyra {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num++;
            int numberOne = num % 3;
            int numberTwo = num % 5;

            if (numberOne == 0 && numberTwo == 0){
                System.out.println("FizzBuzz");
            }
            else if(numberOne == 0){
                System.out.println("Fizz");
            }
            else if (numberTwo == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(num);
            }
        }
    }
}
