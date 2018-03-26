package katas.kyu7;

public class FIXMEGetFullName {
}

class Dinglemouse {
    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        String separator = firstName.length() == 0 || lastName.length() == 0 ? "" : " ";
        return firstName + separator + lastName;
    }
}