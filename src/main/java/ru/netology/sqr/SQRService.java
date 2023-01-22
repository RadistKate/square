package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int min, int max) {
        int quantity = 0;

        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min) {
                if (square <= max) {
                    quantity++;
                }
            }
        }
        return quantity;

    }
}

















