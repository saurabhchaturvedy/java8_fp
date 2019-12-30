package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionTest {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        List<Student> allStudents = StudentDataBase.getAllStudents();

            allStudents.forEach(student -> {
                if(studentPredicate.test(student)) {
                    studentGpaMap.put(student.getName(), student.getGpa());
                }
            });
        return studentGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentTest.predicate));
    }
}
