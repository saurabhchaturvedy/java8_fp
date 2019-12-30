package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceTest {

    static Predicate<Student> predicate = (student) -> student.getGradeLevel() >= 3;

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
    }
}
