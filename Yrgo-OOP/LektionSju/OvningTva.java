import java.net.MalformedURLException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class OvningTva {
    public static void main(String[] args) {
        MathFunctions averageInt = new MathFunctions(15, 35);
        averageInt.averageInt();
        System.out.println(averageInt.averageInt());

        MathFunctions minDouble = new MathFunctions(43.5, 13.5);
        minDouble.maxDouble();
        System.out.println(minDouble.minDouble());

        MathFunctions maxInt = new MathFunctions(55, 12);
        maxInt.maxInt();
        System.out.println(maxInt.maxInt());

        MathFunctions averageDouble = new MathFunctions(32.4, 132.9);
        averageDouble.averageDouble();
        System.out.println(averageDouble.averageDouble());
    }
}
