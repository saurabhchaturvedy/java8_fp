package functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    private static UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();

    public static void main(String[] args) {
        System.out.println("The Result is " + unaryOperator.apply("hello java"));
    }
}
