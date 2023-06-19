package Oops;

public class Oops6 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Sholey", "SRK");
        Movie m2 = new Movie("Karan Arjun", "T-Series", "4.5 Star");
        Movie m3 = new Movie("Ram Lakhan", "Akki", "4 Star");
        Movie m4 = new Movie("Shivay", "SRK");
        Movie m5 = new Movie("Kick", "Yash Raj", "5 Star");

        Movie[] arrMovie = {m1, m2, m3, m4, m5};
        Movie[] result = Movie.get5StarMovies(arrMovie);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i+1+".");
            System.out.println("Title : " + result[i].getTitle());
            System.out.println("Studio : " + result[i].getStudio());
            System.out.println("Rating : " + result[i].getRating());
            System.out.println();
        }
    }
}

class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 Star";
    }

    public static Movie[] get5StarMovies(Movie[] arrMovie) {
        int count = 0;
        for (int i = 0; i < arrMovie.length; i++) {
            if (arrMovie[i].rating.equals("5 Star")) {
                count++;
            }
        }
        Movie[] result = new Movie[count];
        int j = 0;
        for (int i = 0; i < arrMovie.length; i++) {
            if (arrMovie[i].rating.equals("5 Star")) {
                result[j] = arrMovie[i];
                j++;
            }
        }
        return result;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}