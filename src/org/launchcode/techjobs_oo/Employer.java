package org.launchcode.techjobs_oo;

public class Employer extends JobField {
    public Employer(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (this.getValue() == "") {
            return "Data not available";
        } else {
            return "Employer: " + this.getValue();
        }
    }
}