import javax.print.DocFlavor;
import java.util.*;

public class ObjectSort {
    public static void main(String[] args) {
        Student [] arr = new Student[4];
        arr[0] = new Student("aa",80);
        arr[1] = new Student("bb",90);
        arr[2] = new Student("cc",60);
        arr[3] = new Student("dd",85);

        Arrays.sort(arr);

        for (Student s : arr){
            System.out.println(s.name);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks > o.marks){
            return 1;
        } else if (this.marks < o.marks) {
            return -1;
        }
        return 0;
    }
}

