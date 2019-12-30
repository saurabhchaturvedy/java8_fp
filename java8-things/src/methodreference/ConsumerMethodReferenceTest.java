package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceTest {

    static Consumer<Student> studentConsumer = System.out::println;

    // static Consumer<Student> studentNamesConsumer = Student::p;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }
}
