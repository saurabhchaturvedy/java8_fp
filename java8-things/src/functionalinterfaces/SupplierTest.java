package functionalinterfaces;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import data.Student;
import data.StudentDataBase;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Student> supplier = () -> {
            return new Student("Anil", 4, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball", "football"));
        };

        System.out.println("Result is " + supplier.get());

        Supplier<List<Student>> studentsSupplier = () -> {
            return StudentDataBase.getAllStudents();
        };

        System.out.println("The Supplier Output with List Args is " + studentsSupplier.get());
    }

}
