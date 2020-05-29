package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String str = "\nID: " + this.getId() + "\n";

        if (this.getName().equals("")) {
            str += "Name: Data not available\n";
        } else {
            str += "Name: " + this.getName() + "\n";
        }

        str += "Employer: " + this.getEmployer().toString() + "\n";
        str += "Location: " + this.getLocation().toString() + "\n";
        str += "Position Type: " + this.getPositionType().toString() + "\n";
        str += "Core Competency: " + this.getCoreCompetency().toString() + "\n";

        if (this.getName().equals("") && this.getEmployer().getValue().equals("") && this.getLocation().getValue().equals("") && this.getPositionType().getValue().equals("") && this.getCoreCompetency().getValue().equals("")) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return str;
        }

//        Works but a bit cumbersome:
//
//        String message = "Data not available";
//        String str = "\nID: " + this.getId() + "\n";
//        int numOfEmptyData = 0;
//
//        if (this.getName() == "") {
//            str += "Name: " + message + "\n";
//            numOfEmptyData += 1;
//        } else {
//            str += "Name: " + this.getName() + "\n";
//        }
//
//        if (this.getEmployer().getValue() == "") {
//            str += "Employer: " + message + "\n";
//            numOfEmptyData += 1;
//        } else {
//            str += "Employer: " + this.getEmployer().getValue() + "\n";
//        }
//
//        if (this.getLocation().getValue() == "") {
//            str += "Location: " + message + "\n";
//            numOfEmptyData += 1;
//        } else {
//            str += "Location: " + this.getLocation().getValue() + "\n";
//        }
//
//        if (this.getPositionType().getValue() == "") {
//            str += "Position Type: " + message + "\n";
//            numOfEmptyData += 1;
//        } else {
//            str += "Position Type: " + this.getPositionType().getValue() + "\n";
//        }
//
//        if (this.getCoreCompetency().getValue() == "") {
//            str += "Core Competency: " + message + "\n";
//            numOfEmptyData += 1;
//        } else {
//            str += "Core Competency: " + this.getCoreCompetency().getValue() + "\n";
//        }
//
//        if (numOfEmptyData == 5) {
//            return "OOPS! This job does not seem to exist.";
//        } else {
//            return str;
//        }
//    }

//    Does not work because HashMap does not guarantee the order of the map:
//
//        HashMap<String, String> jobInfo = new HashMap<>();
//        jobInfo.put("ID: ", String.valueOf(this.getId()));
//        jobInfo.put("Name: ", this.getName());
//        jobInfo.put("Employer: ", this.getEmployer().getValue());
//        jobInfo.put("Location: ", this.getLocation().getValue());
//        jobInfo.put("Position Type: ", this.getPositionType().getValue());
//        jobInfo.put("Core Competency: ", this.getCoreCompetency().getValue());
//
//        String str = "\n";
//        for (Map.Entry<String, String> eachJobInfo : jobInfo.entrySet()) {
//           if (eachJobInfo.getValue() == "") {
//               eachJobInfo.setValue("Data not available");
//           }
//           str += eachJobInfo.getKey() + eachJobInfo.getValue() + "\n";
//        }
//
//        return str;

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
