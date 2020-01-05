package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {


    private static int sum(List<Integer> integers) {
        return integers.stream().reduce(0, (a, b) -> a + b);
    }

    private static int sumIntStream() {
        return IntStream.rangeClosed(1,6).sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sum(integers));
        System.out.println(sumIntStream());
    }
}
