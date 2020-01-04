package functionalinterfaces;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {

    public static void main(String[] args) {

        Supplier<Stream<String>> a1 = () -> Stream.of("a1", "a2", "b3", "f1", "f2", "f3", "c1", "c2").filter(x->x.startsWith("f"));
    }
}
