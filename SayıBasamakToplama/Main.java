package SayıBasamakToplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, total= 0;

        System.out.print("Sayı giriniz : ");

        number = scan.nextInt();

        while (number != 0) {
            int rakam = number % 10;
            total = rakam + total;
            number = number / 10;
        }

        System.out.println("Rakamlar toplamı : " + total);
    }
}
