package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int underRangeLimit, int upperRangeLimit) {
        int amound = 0;

        for (int i = 0; i <= upperRangeLimit; i++) {
            if (i * i >= underRangeLimit && i * i <= upperRangeLimit) {
                amound++;
            }
        }
        return amound;
    }
}



