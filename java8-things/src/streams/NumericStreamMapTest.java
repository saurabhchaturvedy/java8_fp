package streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapTest {


    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
            return new Integer(i);
        }).collect(toList());
    }

    public static List<Long> mapToLong() {
        return LongStream.rangeClosed(1, 5).mapToObj((i) -> {
            return new Long(i);
        }).collect(toList());
    }

    public static List<Double> mapToDouble() {
        return LongStream.rangeClosed(1, 5).asDoubleStream().mapToObj((i) -> {
            return new Double(i);
        }).collect(toList());
    }


    public static void main(String[] args) {

        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
