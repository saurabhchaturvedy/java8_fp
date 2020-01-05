package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxTest {


    public static int findMax(List<Integer> integers) {
        return integers.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10, 15);
        System.out.println("Max Element : " + findMax(integerList));
    }
}
