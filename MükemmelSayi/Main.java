package MükemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, sum = 0;
        
        System.out.print("Bir sayı giriniz : ");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sum += i;
            }
        }
        if (sum == sayi)
            System.out.println(sayi + " sayısı mükemmel sayıdır!");
        else System.out.println(sayi + " sayısı mükemmel sayı değildir!");
    }
}
