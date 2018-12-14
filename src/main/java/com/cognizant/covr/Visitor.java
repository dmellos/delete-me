package com.cognizant.covr;

final class Visitor {

    private String firstName;

    private  String lastName;

    public Visitor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Visitor() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
