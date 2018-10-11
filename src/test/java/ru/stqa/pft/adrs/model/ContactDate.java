package ru.stqa.pft.adrs.model;

public class ContactDate {
    private final String firstname;
    private final String lastname;

    public ContactDate(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
