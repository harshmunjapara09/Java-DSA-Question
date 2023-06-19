package Oops;

public class Oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNum(101);
        s1.setStudName("Harsh");
        s1.setMark1(90);
        s1.setMark2(91);
        s1.setMark3(81);
        s1.setMark4(80);
        s1.displayStudDetails();
        s1.calculateTotal();
    }
}

class Student {
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int totalMarks;

    public void setRollNum(int rollNum) {

        this.rollNum = rollNum;
    }

    public void setStudName(String studName) {

        this.studName = studName;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public void setMark4(int mark4) {
        this.mark4 = mark4;
    }

    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3 + mark4;
        System.out.println("TotalMarks :"+totalMarks);
    }

    public void displayStudDetails() {
        System.out.println("Student Roll No :"+rollNum);
        System.out.println("Student Name :"+studName);
        System.out.println("Mark1 :"+mark1);
        System.out.println("mark2 :"+mark2);
        System.out.println("mark3 :"+mark3);
        System.out.println("mark4 :"+mark4);
    }
}

