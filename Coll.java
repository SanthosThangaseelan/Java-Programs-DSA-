
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+"-"+age;
    }
}

public class Coll{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        // List<String> linklist = new LinkedList<>();
        Student stud1 = new Student("Sanhosh", 20);
        Student stud2 = new Student("Chella", 02);
        Student stud3 = new Student("virat", 36);
        
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud2);
        
        // list.add("jello");
        // list.add("hello");
        // list.add("tulla");
        // list.add("chella");
         System.out.println(list);

        // linklist.add("Hello");
        // linklist.add("jello");
        // linklist.add("bye");
        // linklist.add("virat");
        // linklist.add("mrf");

        // System.out.println(linklist);

        // int index = linklist.indexOf("bye");
        // linklist.

        // System.out.println(" Bye is in index of : "+index);
        // System.out.println(" Bye is in position of : "+(index+1));
    }

}