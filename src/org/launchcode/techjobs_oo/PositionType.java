package org.launchcode.techjobs_oo;

public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (this.getValue() == "") {
            return "Data not available";
        } else {
            return "Position Type: " + this.getValue();
        }
    }
}
