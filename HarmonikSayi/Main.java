package HarmonikSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N Sayısını giriniz : ");
        int n = scanner.nextInt();
        double total = 0.0;

        for (int i = 1; i <= n; i++) {
            total += (1.0/i);
        }
        System.out.println(total);
    }
}
