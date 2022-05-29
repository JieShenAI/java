package cmp;

public class Employee implements Comparable<Employee>{
    private int id;
    private int age;
    private String name;

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(id != o.id){
            return id - o.id;
        }
        return age - o.age;
    }

}
