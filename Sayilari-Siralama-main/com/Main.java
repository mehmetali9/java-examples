package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayı1,sayı2,sayı3;
        Scanner input = new Scanner(System.in);

        System.out.print("a sayısı: ");
        sayı1 = input.nextInt();

        System.out.print("b sayısı: ");
        sayı2 = input.nextInt();

        System.out.print("c sayısı: ");
        sayı3 =input.nextInt();

        if((sayı1<sayı2) && (sayı1<sayı3)){
            if(sayı2<sayı3){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        }else if((sayı2<sayı1) && (sayı2<sayı3)){
            if (sayı1<sayı3){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        }else {
            if(sayı1<sayı2){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }
    }
}
