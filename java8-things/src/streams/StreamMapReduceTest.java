package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceTest {


    private static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel() >= 3).map(Student::getNotebooks).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println(noOfNotebooks());
    }
}
