import java.util.HashMap;

class Student{
    private final String name;
    Student(String name){
        this.name=name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String toString(){
        return name;
    }
}

public class HashMapOperation {
    public static void main(String args[]){
        HashMap<Student, Integer> hmap=new HashMap<>();
        Student s1=new Student("Test1");
        Student s2=new Student("Test2");
        hmap.put(s1,1);
        hmap.put(s2,2);

        System.out.println(hmap.hashCode());
        System.out.println(hmap);
        System.out.println(hmap.get(s2).hashCode());

        //System.out.println(hmap.get(new Student("Test2")).hashCode());
    }

}
