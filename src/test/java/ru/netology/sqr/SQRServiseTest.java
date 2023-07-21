package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiseTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testSqrService(int expected, int x1, int x2) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(x1, x2);
        Assertions.assertEquals(expected, actual);

    }


}