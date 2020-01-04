package data;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorter {

    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);


         Comparator<Employee> salaryComparator = (e1,e2) -> (int) (e2.getSalary()-e1.getSalary());

//sorting employees array using Comparable interface implementation
        Arrays.sort(empArr,salaryComparator);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
    }
}
