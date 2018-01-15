package com.demo.refactoring;

/**
 * @author Turbo
 * @date 17/6/1.
 */
public class Movie {
    public static final int CHILDRENS= 2;
    public static final int REGULAR= 0;
    public static final int NEW_RELEASE= 1;

    private String _title;
    private String _priceCode;

    public Movie(String title, String priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public String get_title() {
        return _title;
    }

    public String get_priceCode() {
        return _priceCode;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_priceCode(String _priceCode) {
        this._priceCode = _priceCode;
    }
}
