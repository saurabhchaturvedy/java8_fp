package streams;

import java.util.stream.IntStream;

public class NumericStreamRangesExamples {

    public static void main(String[] args) {

        IntStream range = IntStream.range(1, 50);
        IntStream rangeClosed = IntStream.rangeClosed(1, 50);
        System.out.println(range.count());
        System.out.println(rangeClosed.count());

        IntStream.range(1,50).limit(3).forEach((x)->{System.out.println(x+",");});
        IntStream.rangeClosed(1,50).asDoubleStream().limit(3).forEach(System.out::println);
    }
}
