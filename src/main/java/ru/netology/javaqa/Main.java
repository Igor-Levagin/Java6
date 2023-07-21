package ru.netology.javaqa;

import ru.netology.sqr.SQRService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println( service.calcSqr( 500, 600));
    }
    }
