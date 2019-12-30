package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    static Comparator<Integer> integerComparator = (a,b) -> a.compareTo(b);
    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
    static BinaryOperator<Integer> binaryOperatorMaxBy = BinaryOperator.maxBy(integerComparator);


    public static void main(String[] args) {
        System.out.println("The result is " + binaryOperator.apply(5, 3));
        System.out.println("The result is " + binaryOperatorMaxBy.apply(7,8));
    }
}
