
/*
Write a program to sort the elements in collections?
public class Employee {int id; int age; double salary; String name;
}
    use above the Employee class and sort the Employee objects in descending order based on name
        and salary.
*/

import java.util.ArrayList;
import java.util.Comparator;

class Student1{
    int id;
    int age;
    double salary;
    String name;

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +" "+ name + " " + age +" " + salary ;
    }

    public Student1(){
        super();
    }

    Student1( int id, int age, double salary, String name){
        this.id=id;
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
}

class nameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class salaryComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return (int) (o2.getSalary()-o1.getSalary());
    }
}
public class CollectionsProblem {
    public static void main(String[] args) {

        Student1 s1=new Student1(1,10, 250.0,"Rishabh");
        Student1 s2=new Student1(2,8, 350.0,"Rishabh");
        Student1 s3=new Student1(3,7, 200.0,"Tishabh");
        Student1 s4=new Student1(5,12, 150.0,"Aishabh");

        ArrayList<Student1> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.stream().forEach(System.out::println);
        list.stream().sorted(new nameComparator().thenComparing(new salaryComparator())).forEach(System.out::println);
    }
}
