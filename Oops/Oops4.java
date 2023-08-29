package Oops;

public class Oops4 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Ram", 78, 91, 79);
        Student1 s2 = new Student1(102, "Krishna", 70, 92, 99);
        Student1 s3 = new Student1(103, "kgf", 85, 93, 89);
        Student1 s4 = new Student1(104, "rrr", 90, 94, 99);
        Student1 s5 = new Student1(105, "mahadev", 78, 95, 69);

        Student1 stud[] = {s1,s2,s3,s4,s5};

        Student1.getTop3Student(stud);

    }
}

class Student1{
    private int rollNo;
    private String Name;
    private int marks1;
    private int marks2;
    private int marks3;
    private int total;
    private double perc;

    public Student1(int rollNo, String Name, int marks1, int marks2, int marks3){
        this.rollNo = rollNo;
        this.Name = Name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        total = marks1+marks2+marks3;
        perc = total/3;
    }

    public double getPerc(){
        return perc;
    }
    public static void getTop3Student(Student1 stud[]){
        for(int i=0;i<stud.length;i++){
            for(int j=0;j<stud.length-1;j++){
                if(stud[j].perc < stud[j+1].perc){
                    Student1 temp = stud[j];
                    stud[j] = stud[j+1];
                    stud[j+1] = temp;
                }
            }
        }

        Student1 max1=stud[0];
        Student1 max2=stud[1];
        Student1 max3=stud[2];

        for(int i=4;i< stud.length;i++){
            if(stud[i].perc > max1.perc){
                max3 = max2;
                max2=max1;
                max1=stud[i];
            } else if (stud[i].perc > max2.perc && stud[i].perc != max1.perc) {
                max3=max2;
                max2=stud[i];
            } else if(stud[i].perc > max3.perc && stud[i].perc != max2.getPerc()){
                max3=stud[i];
            }
        }
        System.out.println(max1.perc +" "+ max1.Name);
        System.out.println(max2.perc +" "+ max2.Name);
        System.out.println(max3.perc +" "+ max3.Name);


    }
}