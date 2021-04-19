package functions.mathFunction;


public class MoreFunction {

    public static int NWD(int pierwsza, int druga)
    {
        if (druga == 0)
        {
            return pierwsza;
        }
        else {
            return NWD(druga, pierwsza%druga);
        }
    }

    public static int NWW(int a, int b){
        return a*b/NWD(a, b);
    }


    public static boolean betterThen(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }


}
