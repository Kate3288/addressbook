package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String secondName;
    private static String group;

    public ContactData(String firstName, String secondName, String Group) {
        this.firstName = firstName;
        this.secondName = secondName;
        group = Group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return secondName;
    }

    public static String getGroup() {
        return group;
    }
}
