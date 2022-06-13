package NotOrtalamasıHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Değişkenleri oluşturdum

        int mat,turkce,fen,sosyal;

        //Scanner sınıfı tanımladım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri aldım
        System.out.print("Matematik notunuzu giriniz : ");

        mat = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");

        turkce = input.nextInt();

        System.out.print("Fen notunuzu giriniz : ");

        fen = input.nextInt();

        System.out.print("Sosyal Bilgiler notunuzu giriniz : ");

        sosyal= input.nextInt();

        int sonuc = (mat + turkce + fen + sosyal );

        double ort = sonuc/ 4.0;

        System.out.print("Ortalamanız : " + ort );

        if (ort >= 50.0) {
            System.out.print("Geçtiniz");
        }
        else {
            System.out.print("Kaldınız");
        }

    }
}
