package Oops;

public class Oops5 {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Janmastmi", 10, "Aug");
        Holiday h2 = new Holiday("Azad Din", 15, "Aug");
        Holiday h3 = new Holiday("Diwali", 11, "Nov");
        Holiday h4 = new Holiday("Utrayan", 14, "Jan");

        Holiday arrHoliday[] = {h1, h2, h3, h4};

        Holiday.sameMonth(h1,h2);
        System.out.println("The average day of the holidays is " + Holiday.getAvg(arrHoliday));
    }
}

class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
    public boolean inSameMonth(Holiday other) {
        return this.month.equals(other.month);
    }
    public static double getAvg(Holiday[] arrHoliday) {
        int total = 0;
        for (int i = 0; i < arrHoliday.length; i++) {
            total = total + arrHoliday[i].day ;
        }
        return (double) total/arrHoliday.length;
    }
    public static boolean sameMonth(Holiday h1 , Holiday h2){
        if((h1.getMonth()).equals(h2.getMonth())){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
}
