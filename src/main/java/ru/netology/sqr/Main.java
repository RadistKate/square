package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
       SQRService service = new SQRService ();
       int square = service.calcSQR (  10,  99 );
       System.out.println(square);
    }
}
