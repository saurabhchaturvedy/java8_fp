package streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorTest {

    public static List<Student> sortByNames() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(toList());
    }

    public static List<Student> sortByGPA() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(toList());
    }

    public static List<Student> sortByGPADesc() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(toList());
    }

    public static void main(String[] args) {

        System.out.println("Sorting Students by name : ");
        sortByNames().forEach(System.out::println);
        System.out.println("Sorting Students by GPA : ");
        sortByGPA().forEach(System.out::println);
        System.out.println("Sorting Students by GPA Desc");
        sortByGPADesc().forEach(System.out::println);
    }
}
