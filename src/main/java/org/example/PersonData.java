package org.example;

public class PersonData {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final String birthDate;
    private final long phoneNumber;
    private final char gender;

    public PersonData(String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender;
    }
}

