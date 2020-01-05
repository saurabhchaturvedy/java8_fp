package streams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamsBoxingUnboxingTest {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 5).boxed().collect(toList());
    }


    private static int unboxing(List<Integer> integers) {

        return integers.stream().mapToInt(Integer::intValue).sum();
    }


    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println("Sum of unboxed integers is " + unboxing(boxing()));
    }
}
