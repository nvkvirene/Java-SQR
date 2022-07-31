package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.scv")
    public void testRangeLimitZeroNegative(int expected, int underRangeLimit, int upperRangeLimit) {

        SQRService service = new SQRService();
        int actual = service.numberOfSquares(underRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);
    }
}