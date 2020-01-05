package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceTest {


    public static int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> multiplySansIdentity(List<Integer> integerList) {
        return integerList.stream().reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPA() {
        return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> {
                    if (s1.getGpa() > s2.getGpa()) {

                        return s1;
                    } else {
                        return s2;
                    }
                }
        );
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        //System.out.println(multiply(integers));
        // System.out.println(multiplySansIdentity(integers));
        Optional<Integer> integer = multiplySansIdentity(integers);
        integer.ifPresent(System.out::println);
        Optional<Integer> integer1 = multiplySansIdentity(Arrays.asList());
        integer1.ifPresent(System.out::println);
        Optional<Student> highestGPA = getHighestGPA();
        System.out.println(highestGPA.get().getName());

    }
}
