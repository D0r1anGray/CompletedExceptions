package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String input = scanner.nextLine();

        String[] data = input.split(" ");

        try {
            DataValidator.validateData(data);

            String lastName = data[0];
            String firstName = data[1];
            String patronymic = data[2];
            String birthDate = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            PersonData personData = new PersonData(lastName, firstName, patronymic, birthDate, phoneNumber, gender);

            FileWriterUtil.writeToFile(lastName + ".txt", personData.toString());

            System.out.println("Данные успешно записаны в файл.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
