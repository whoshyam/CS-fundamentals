import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Student kunal; // just declaring object kunal of class Student
        // kunal = new Student();
        
        //creating the object
        //new keywords--dynamically allocate the memory at runtime and return a reference to it
        // Student kunal = new Student();
        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        // kunal.rno = 13;
        // kunal.name = "Kunal Kushwaha";
        // kunal.marks = 88.5f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        // kunal.changeName("Shoe lover");
        // kunal.greeting();

        Student rahul = new Student(18, "Rahul Rana", 90.3f);
        
        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
class Student {
    int rno;
    String name;
    float marks = 90; //by default marks will be 90 now 

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
