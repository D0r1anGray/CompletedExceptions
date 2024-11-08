package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataValidator {
    public static void validateData(String[] data) throws IllegalArgumentException {
        if (data.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных. Требуется 6 значений.");
        }

        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];

        if (!isValidName(lastName) || !isValidName(firstName) || !isValidName(patronymic)) {
            throw new IllegalArgumentException("Неверный формат имени, фамилии или отчества.");
        }

        if (!isValidBirthDate(birthDate)) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается формат dd.MM.yyyy.");
        }

        if (!isValidPhoneNumber(phoneNumberStr)) {
            throw new IllegalArgumentException("Неверный формат номера телефона. Ожидается целое беззнаковое число.");
        }

        if (!isValidGender(genderStr)) {
            throw new IllegalArgumentException("Неверный формат пола. Ожидается 'f' или 'm'.");
        }
    }

    private static boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    private static boolean isValidBirthDate(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(birthDate, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static boolean isValidPhoneNumber(String phoneNumberStr) {
        try {
            Long.parseLong(phoneNumberStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidGender(String genderStr) {
        return genderStr.equalsIgnoreCase("жен") || genderStr.equalsIgnoreCase("муж");
    }
}

