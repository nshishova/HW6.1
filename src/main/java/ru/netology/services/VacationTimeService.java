package ru.netology.services;

public class VacationTimeService {

    public int vacationCal(int income, int expenses, int threshold) {

        int currentSavings = 0;
        int monthCount = 0;

        for (int month = 0; month < 12; month++) {

            if (currentSavings >= threshold) {
                monthCount++;
                currentSavings = (currentSavings - expenses) / 3;

            } else {
                currentSavings = currentSavings + income - expenses;

            }

        }
        return monthCount;

    }


}
