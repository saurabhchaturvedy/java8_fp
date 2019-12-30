package functionalinterfaces;

import java.util.function.Function;

public class FunctionTest1 {


    private static String performConcat(String str)
    {
       return  FunctionTest.addStringfunction.apply(str);
    }

    public static void main(String[] args) {
        String kashmir = performConcat("kashmir");
        System.out.println("the result is "+kashmir);
    }
}
