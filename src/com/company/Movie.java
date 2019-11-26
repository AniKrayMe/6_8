package com.company;

import java.util.Random;

public class Movie {
    private String title;
    private int rating;

    //region Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion

    //region Constructor
    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie() {
    }

    //endregion
    public int[] createMovieRating() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    public void printMoviesTitlesAndRatings(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println();
        for (int i = 0; i < 1; i++) {
            if (maximum == array[0]) {
                this.title = "Death Note";
                System.out.println(this.title + " - " + array[0]);
            }
            if (maximum == array[1]) {
                this.title = "Tokyo Ghoul";
                System.out.println(this.title + " - " + array[1]);
            }
            if (maximum == array[2]) {
                this.title = "Sword Art Online";
                System.out.println(this.title + " - " + array[2]);
            }
            if (maximum == array[3]) {
                this.title = "The Shawshank Redemption";
                System.out.println(this.title + " - " + array[3]);
            }
            if (maximum == array[4]) {
                this.title = "The Green Mile";
                System.out.println(this.title + " - " + array[4]);
            }
            if (maximum == array[5]) {
                this.title = "Forrest Gump";
                System.out.println(this.title + " - " + array[5]);
            }
            if (maximum == array[6]) {
                this.title = "Shutter Island";
                System.out.println(this.title + " - " + array[6]);
            }
            if (maximum == array[7]) {
                this.title = "The Prestige";
                System.out.println(this.title + " - " + array[7]);
            }
            if (maximum == array[8]) {
                this.title = "The Dark Knight";
                System.out.println(this.title + " - " + array[8]);
            }
            if (maximum == array[9]) {
                this.title = "The Matrix";
                System.out.println(this.title + " - " + array[9]);
            }
        }
    }
}

