package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        Predicate<Student> booleanPredicate = x -> x.getGradeLevel() >= 3;
        Predicate<Student> booleanPredicate2 = x -> x.getGpa() >= 3.9;

        Map<String, List<String>> collect = StudentDataBase.getAllStudents().stream().peek(student -> {
            System.out.println(student);
        }).
        filter(booleanPredicate).filter(booleanPredicate2).collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(collect);
    }
}
