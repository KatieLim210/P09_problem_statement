package sg.edu.rp.c346.id21023701.p09problemstatement;

import java.io.Serializable;

public class song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;



    public song(int id, String title, String singers, int year, int stars) {
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public int get_id() {

        return id;
    }

    public String getTitle() {

        return title;
    }
    public String getSingers() {

        return singers;
    }
    public int getYear() {

        return year;
    }
    public int getStar() {
        return stars;
    }


    public String setTitle(String toString) {
        return title;
    }
    public int setYear(String toString) {
        return year;
    }
    public String setSinger(String toString) {
        return singers;
    }

}
