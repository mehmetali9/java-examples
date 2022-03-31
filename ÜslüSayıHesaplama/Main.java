package ÜslüSayıHesaplama;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, k;
        int total = 1;
        System.out.println("Üssü Alınacak sayı : ");
        n = scan.nextInt();
        System.out.println("Üs olacak sayı : ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        
        System.out.println("Sonuç : " + total);

    }
}
