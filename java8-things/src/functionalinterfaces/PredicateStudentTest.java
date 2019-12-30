package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentTest {

    static Predicate<Student> predicate = (student) -> student.getGradeLevel() >= 3;

    static void filterStudentsByGradeValue() {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {

        filterStudentsByGradeValue();
    }
}
