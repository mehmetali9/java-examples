package FibonacciSerisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz : ");
        int number = scanner.nextInt();

        int ilkDeger = 0;
        int ikinciDeger = 1;
        int a = 0, b = 1;
        int sonuc = 0;
        System.out.print(ilkDeger + " " + ikinciDeger + " ");
        for (int i = 2; i < number; i++) {
            sonuc = a + b;
            System.out.print(sonuc + " ");
            a = b;
            b = sonuc;
        }

    }
}
