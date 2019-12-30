package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentTest {


    static Function<List<Student>, Map<String, Double>> function = (student -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        student.forEach((student1 -> {
            if(PredicateStudentTest.predicate.test(student1)) {
                studentGpaMap.put(student1.getName(), student1.getGpa());
            }
        }));

        return studentGpaMap;

    });

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));
    }
}
