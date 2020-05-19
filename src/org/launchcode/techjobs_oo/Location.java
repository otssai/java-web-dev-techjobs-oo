package org.launchcode.techjobs_oo;

public class Location extends JobField {
    public Location(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (this.getValue() == "") {
            return "Data not available";
        } else {
            return "Location: " + this.getValue();
        }
    }
}
