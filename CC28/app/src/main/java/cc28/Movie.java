package CC28.app.src.main.java.cc28;

import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private List<String> genres;

    public Movie(String title, int year, List<String> generis) {
        this.title = title;
        this.year = year;
        this.genres = generis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGenres() {
        return genres;
    }

    @Override
    public int compareTo(Movie o) {
            return o.getYear()-this.getYear();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genres=" + genres +
                '}';
    }
static class compareLexicographic implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        String[] title1Words = o1.getTitle().split(" ");
        String[] title2Words = o2.getTitle().split(" ");
        String[] prefixes = {"a","an","the"};
        String correctTitle1=title1Words[0];
        String correctTitle2=title2Words[0];
        for (String prefix: prefixes) {
          if(  title1Words.length > 1 & title1Words[0].toLowerCase().equals(prefix))
              correctTitle1=title1Words[1];
            if(  title2Words.length > 1 & title2Words[0].toLowerCase().equals(prefix))
                correctTitle2=title2Words[1];
        }

        return correctTitle1.compareToIgnoreCase(correctTitle2);
    }

}
}
