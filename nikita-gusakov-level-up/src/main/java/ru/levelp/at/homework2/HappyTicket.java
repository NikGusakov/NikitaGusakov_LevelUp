package ru.levelp.at.homework2;

public class HappyTicket {
    public static boolean check(String number) {

        if (number == null || number.length() == 0) {
            throw new IllegalArgumentException("Получаемое значение не должно быть пустым");
        } else {

            try {
                Integer.parseInt(number);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Номер должен быть целым числом");
            }

            if (number.length() == 6) {
                char[] charsOfNumber = number.toCharArray();

                int firstHalfSumm = 0;
                int secondHalfSumm = 0;
                for (int i = 0; i < 3; i++) {
                    firstHalfSumm += Character.getNumericValue(charsOfNumber[i]);
                }
                for (int i = 3; i < 6; i++) {
                    secondHalfSumm += Character.getNumericValue(charsOfNumber[i]);
                }
                return firstHalfSumm == secondHalfSumm;
            } else {
                throw new IllegalArgumentException("Номер должен состоять из 6-ти цифр");
            }

        }

    }
}
