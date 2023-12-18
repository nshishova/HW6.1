package ru.netology.services;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;


public class VacationTimeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/variables.csv")
    public void test(int expected, int income, int expenses, int threshold) {

        VacationTimeService service = new VacationTimeService();


        int actual = service.vacationCal(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }


}
