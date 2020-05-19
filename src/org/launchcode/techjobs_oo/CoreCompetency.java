package org.launchcode.techjobs_oo;

public class CoreCompetency extends JobField {
    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (this.getValue() == "") {
            return "Data not available";
        } else {
            return "Core Competency: " + this.getValue();
        }
    }
}
