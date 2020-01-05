package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {


    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream().filter(x -> x.getGender().equals("female")).filter(x -> x.getGpa()>=4.0).collect(toList());
    }

    public static void main(String[] args) {

        System.out.println(filterStudents());
    }
}
