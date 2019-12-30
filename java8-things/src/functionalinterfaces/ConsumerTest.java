package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    static Consumer<Student> studentConsumer = (s) -> System.out.println(s);
    static Consumer<Student> studentNameConsumer = (s) -> System.out.print(s.getName());
    static Consumer<Student> studentActivityConsumer = (s) -> System.out.println(s.getActivities());

    static void printNames() {

        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentConsumer);

    }

    static void printNamesAndActivities() {


        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentNameConsumer.andThen(studentActivityConsumer));

    }

    static void printNameAndActivitiesConditionally() {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println("Printing Students Conditionally");
        allStudents.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                studentNameConsumer.andThen(studentActivityConsumer).andThen(studentConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Java 8");
       // printNames();
        System.out.println("Printing Names and activities :");
      //  printNamesAndActivities();
        printNameAndActivitiesConditionally();
    }
}
