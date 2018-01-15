package com.demo.refactoring;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Turbo
 * @date 17/6/1.
 */
public class Customer {

    private String _name;
    private Vector<Rental> _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental rental){
        _rentals.addElement(rental);
    }

    public String get_name() {
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record " + get_name() + "\n";

        while (rentals.hasMoreElements()){

        }
        return "";
    }
}
