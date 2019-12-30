package functionalinterfaces;

import java.util.function.Function;

public class FunctionTest {


    static Function<String,String> function = (s) -> s.toUpperCase();
    static Function<String,String> addStringfunction = (s) -> s.toUpperCase().concat(" Technology");

    public static void main(String[] args) {

        System.out.println("Result is "+function.apply("java 8"));
        System.out.println("Resuly addString is "+addStringfunction.apply("java 8"));
        System.out.println("Resuly addString is "+addStringfunction.andThen(function).apply("java 8"));
        System.out.println("ResulyX addString is "+function.compose(addStringfunction).apply("java 8"));
    }
}
