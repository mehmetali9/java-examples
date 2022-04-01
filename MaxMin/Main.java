package MaxMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, num, max = 0, min = 0;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println( i + ". Sayıyı giriniz : ");
            num = scanner.nextInt();

            if (num > max) {
                if (min == 0) {
                    min = num;
                }
                max = num;
            }
            if (num < min) {
                if (max==0){
                    max=num;
                }
                min = num;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }

}

