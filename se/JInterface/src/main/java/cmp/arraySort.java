package cmp;

import java.util.Arrays;

public class arraySort extends Data {
    public static void main(String[] args) {
        arraySort arr = new arraySort();
        Employee[] arr1 = arr.getArr().toArray(new Employee[0]);
        System.out.printf("size: %d\n", arr1.length);
        for (Employee employee : arr1) {
            System.out.println(employee);
        }
        Arrays.sort(arr1);
        System.out.println("***********");
        for (Employee employee : arr1) {
            System.out.println(employee);
        }
    }
}
