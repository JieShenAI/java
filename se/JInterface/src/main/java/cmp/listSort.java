package cmp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class listSort {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,18,"Alice");
        Employee employee2 = new Employee(2,18,"Bob");
        Employee employee3 = new Employee(1,100,"Bob");
        Employee employee4 = new Employee(1,17,"Bob");
        Employee employee5 = new Employee(2,16,"Bob");
        Employee employee6 = new Employee(2,19,"Bob");
        List<Employee> employees = new LinkedList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
