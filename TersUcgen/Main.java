package TersUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz  : ");
        int num = input.nextInt();

        int temp = 1;

        for (int i = num + 1; i > 0; i--) {

            for (int j = 0; j < temp; j++)
                System.out.print(" ");
            temp++;

            for (int k = 0; k < (i * 2) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
