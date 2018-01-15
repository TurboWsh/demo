package com.demo.refactoring;

/**
 * @author Turbo
 * @date 17/6/1.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int _daysRented) {
        this._movie = movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }
}
