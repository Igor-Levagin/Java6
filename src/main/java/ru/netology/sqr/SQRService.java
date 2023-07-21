package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int x1, int x2) {
       for (int i = 10; i < 99; i++){
           if ( i * i >= x1 & i * i <= x2){
               return i;


           }

           }
       return 0;
    }
       }