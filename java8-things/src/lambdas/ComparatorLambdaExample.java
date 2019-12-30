package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is "+comparator.compare(5,7));
        Comparator<Integer> comparator1 = (Integer a,Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is "+comparator1.compare(5,7));
        Comparator<Integer> comparator2 = (a,b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda without type declaration is "+comparator2.compare(15,5));

    }
}
