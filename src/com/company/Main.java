package com.company;

public class Main {

    public static void main(String[] args) {

        int monthNumber = 5;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца задан некорректно");
        }
        else {
            switch (monthNumber) {

                case 1:
                case 2:
                case 12:
                    System.out.println(monthNumber + " месяц - зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц - весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц - лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц - осень");
                    break;

            }
        }

    }
}
