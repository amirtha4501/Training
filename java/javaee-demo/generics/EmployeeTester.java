/*
    REQUIREMENTS:
        - To write a program to print employees name list by implementing iterable interface.
    ENTITIES:
        - Employee
        - EmployeeTester
    METHOD SIGNATURE:
        - public Iterator<T> iterator();
    WORK TO DONE:
        - create class Employee that implements Iterable interface
        - create method called iterator that iterates the employeeNames
        - call it via EmployeeTester class
*/

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
 
class Employee<T> implements Iterable<T> {
 
    List<T> employeeNames;
 
    Employee(T[] names) { 
        employeeNames = Arrays.asList(names);
    }
 
    public Iterator<T> iterator() {
        return employeeNames.iterator();
    }
}


class EmployeeTester {
 
    public static void main(String[] args) {
 
        String[] employeeNames = {"ammu", "appu", "pappu"};
 
        Employee<String> employees = new Employee<>(employeeNames);
 
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
