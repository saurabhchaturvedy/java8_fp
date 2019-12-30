package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndConsumerTest {


    Predicate<Student> gradePredicate = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.9;

    BiPredicate<Integer,Double> biPredicate = (grade,gpa) -> grade >=3 && gpa >=3.9;

    BiConsumer<String, List<String>> nameActivityConsumer = (name, activity) -> System.out.println("Name is " + name + " " + activity);


    private void printNameAndActivities() {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
                nameActivityConsumer.accept(student.getName(), student.getActivities());
            }
        });
    }

    public static void main(String[] args) {

        PredicateAndConsumerTest predicateAndConsumerTest = new PredicateAndConsumerTest();
        predicateAndConsumerTest.printNameAndActivities();
    }
}
