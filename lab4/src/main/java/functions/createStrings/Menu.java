package functions.createStrings;

public class Menu {
    public String CreateMainMenu(){
        String MainMenu = ("********************************\n" +
                "** 1. Basic function(+,-,*,/) **\n" +
                "** 2. NWD                     **\n" +
                "** 3. NWW                     **\n" +
                "** 4. Extend function(mod, )  **\n" +
                "** 5. Fraction function       **\n" +
                "** 9. EXIT                    **\n" +
                "********************************");
        return MainMenu;
    }

    public String CreateBasicMenu(){
        String BasicMenu = ("********************************\n" +
                "** 1. Add                     **\n" +
                "** 2. Multiplication          **\n" +
                "** 3. Subtraction             **\n" +
                "** 4. Division                **\n" +
                "** 9. EXIT                    **\n" +
                "********************************");
        return BasicMenu;
    }

    public String CreateExtendMenu(){
        String ExtendMenu = ("********************************\n" +
                "** 1. Modulo                  **\n" +
                "** 2. Sqrt                    **\n" +
                "** 9. EXIT                    **\n" +
                "********************************");
        return ExtendMenu;
    }

    public String CreateFractionenu(){
        String FractionMenu = ("********************************\n" +
                "** 1. Add                     **\n" +
                "** 2. Subtraction             **\n" +
                "** 9. EXIT                    **\n" +
                "********************************");
        return FractionMenu;
    }
}
