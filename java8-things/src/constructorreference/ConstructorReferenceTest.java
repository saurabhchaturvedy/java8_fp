package constructorreference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceTest {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentNameSupplier = Student::new;
    public static void main(String[] args) {
        System.out.println(studentSupplier.get().getName());
        System.out.println(studentNameSupplier.apply("abc"));
    }
}
