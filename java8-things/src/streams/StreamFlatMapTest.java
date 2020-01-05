package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapTest {


    public static List<String> printListOfActivities()
    {

        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted((x,y) -> y.compareTo(x)).collect(toList());
    }

    public static Long getStudentActivityCount()
    {

        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
    }


    public static void main(String[] args) {

        System.out.println(printListOfActivities());
        System.out.println(getStudentActivityCount());
    }
}
