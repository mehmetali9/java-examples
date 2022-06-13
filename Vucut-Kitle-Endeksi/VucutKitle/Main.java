package VucutKitle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy,indeks,kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo/(boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
