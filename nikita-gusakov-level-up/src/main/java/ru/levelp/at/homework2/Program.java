package ru.levelp.at.homework2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Счастливый билет - тот, номер которого является целым числом, состоит из 6-ти цифр и "
                    + "сумма первых 3-х цифр равна сумме вторых 3-х цифр.");
            System.out.print("Введите номер билета для проверки: ");

            String number = in.next();
            System.out.println();

            boolean result = HappyTicket.check(number);
            if (result) {
                System.out.println("Это счастливый билет :)");
            } else {
                System.out.println("Это не счастливый билет :(");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
