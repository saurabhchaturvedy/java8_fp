package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    static void printNameAndActivities()
    {
        BiConsumer<String, List<String>> nameActivityConsumer = (name,activity) -> System.out.println("Name ="+name+" Activity : "+activity);
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> nameActivityConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("Value a =" + a + " Value b = " + b);
        biConsumer.accept("hello", "world");

        BiConsumer<Integer, Integer> multiplicationBiConsumer = (a, b) -> System.out.println("Value is " + a * b);
        //multiplicationBiConsumer.accept(7,8);

        BiConsumer<Integer, Integer> divisionBiConsumer = (a, b) -> System.out.println("Value is " + (a / b));
        //  divisionBiConsumer.accept(56,8);

        multiplicationBiConsumer.andThen(divisionBiConsumer).accept(90, 10);
        printNameAndActivities();

    }
}
