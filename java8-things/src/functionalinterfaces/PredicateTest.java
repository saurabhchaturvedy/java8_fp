package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateTest {

   static Predicate<Integer> predicate = (i) -> {return i%2==0;};
    static Predicate<Integer> oddPredicate = (i) -> i%5==0;

    static void predicateAnd()
    {
        System.out.println(predicate.or(oddPredicate).negate().test(15));
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(5));


        System.out.println(oddPredicate.test(7));
        predicateAnd();
    }
}
