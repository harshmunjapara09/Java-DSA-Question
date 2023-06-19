package Oops2;

import java.util.Arrays;

public class Oops2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Harsh", new int[]{98, 89, 23, 90, 78});
        Student s2 = new Student();
        s2.input("Munjapara", new int[]{99, 89, 68, 98, 95});
        Student s3 = new Student();
        s3.input("Munjapara", new int[]{99, 99, 78, 68, 65});

        //Show Function
        Student.show(s1);
        Student.show(s2);
        System.out.println();

        //Total Student
        System.out.println("Total Student :");
        Student.TotalStudents();
        System.out.println();

        //Total Mark
        System.out.println("Total Mark : "+s1.TotalMarks());
        System.out.println("Total Mark : "+s2.TotalMarks());
        System.out.println();

        //Highest Mark of Subject
        System.out.println("Highest Mark of Subject : "+s1.getHighest());
        System.out.println("Highest Mark of Subject : "+s2.getHighest());
        System.out.println();

        //Lowest Mark of Subject
        System.out.println("Lowest Mark of Subject : "+s1.getLowest());
        System.out.println("Lowest Mark of Subject : "+s2.getLowest());
        System.out.println();

        //Average marks of student
        System.out.println("average marks of student : "+s1.getAverage());
        System.out.println("average marks of student : "+s2.getAverage());
        System.out.println();

        //Passed Student
        System.out.println("A student is passed Subject : " + s1.getPassCount() );
        System.out.println("A student is passed Subject : " + s2.getPassCount() );
        System.out.println("A student is passed Subject : " + s3.getPassCount() );

    }
}

class Student {
    static int totalStudent = 0;
    private static int uniqueNumber = 101;
    private int rollNumber;
    private String name;
    private int[] marks;

    Student() {
        this.rollNumber = uniqueNumber++;
        this.name = "";
        this.marks = null;
        totalStudent++;
    }

    public static void show(Student s) {
        System.out.println("RollNo : "+s.rollNumber + ", Name : " + s.name + ", Marks : " + Arrays.toString(s.marks));
    }

    public static void TotalStudents() {
        System.out.println(totalStudent);
    }

    public void input(String name, int[] marks) {
        this.name = name;
        if (marks.length == 5) {
            this.marks = marks;
        } else {
            System.out.println("Note :" + this.name + ", Please Enter marks for all 5 subjects.");
        }
    }

    public  int TotalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public int getHighest(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            max=Math.max(max,marks[i]);
        }
        return max;
    }

    public int getLowest(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i< marks.length;i++){
            min = Math.min(min,marks[i]);
        }
        return min;
    }

   public int getAverage(){
        return TotalMarks() / marks.length;
   }

   public  int getPassCount(){
        int count=0;
        for(int i=0;i<marks.length;i++){
        if(marks[i] >= 50) {
            count++;
        }
        }
        return count;
   }
}


