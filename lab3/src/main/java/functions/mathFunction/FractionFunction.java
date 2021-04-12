package functions.mathFunction;

import org.apache.commons.lang3.math.Fraction;

public class FractionFunction {

    public static Fraction fractor(int a, int b){
        Fraction x = Fraction.getFraction(a,b);
        return x;
    }

    public static void addFraction(int a, int b, int c, int d){
        Fraction x = fractor(a, b);
        Fraction y = fractor(c, d);

        Fraction result = x.add(y);

        System.out.println(x + " + " + y + " = " + result);
    }

    public static void subFraction(int a, int b, int c, int d){
        Fraction x = fractor(a, b);
        Fraction y = fractor(c, d);

        Fraction result = x.subtract(y);

        System.out.println(x + " - " + y + " = " + result);
    }
}
