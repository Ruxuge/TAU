package functions.mathFunction;

import org.apache.commons.lang3.math.Fraction;

public class FractionFunction {

    public static Fraction fractor(int a, int b){
        Fraction x = Fraction.getFraction(a,b);
        return x;
    }

    public static Fraction addFractor(int a, int b, int c, int d){
        Fraction x = fractor(a, b);
        Fraction y = fractor(c, d);

        Fraction result = x.add(y);

        return result;
    }

    public static Fraction subFractor(int a, int b, int c, int d){
        Fraction x = fractor(a, b);
        Fraction y = fractor(c, d);

        Fraction result = x.subtract(y);

        return result;
    }
}
