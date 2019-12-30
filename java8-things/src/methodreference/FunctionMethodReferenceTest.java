package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceTest {

    static Function<String,String> functionLambda = (s) -> s.toUpperCase();
    static Function<String,String> functionReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println("Result using Lambda is "+functionLambda.apply("hello"));
        System.out.println("Result using Reference is "+functionReference.apply("hello"));
    }
}
