package KDVhesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double fiyat,kdvOrani, kdvFiyat,kdvliFiyat;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ücret tutarınızı giriniz : ");
        fiyat = scanner.nextInt();

        kdvOrani = (fiyat <= 1000) ? 0.18 : 0.08 ;
        //
        kdvFiyat = fiyat * kdvOrani ;
        kdvliFiyat = fiyat + kdvFiyat;
        //
        System.out.println("KDV'siz Tutar : " + fiyat );
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvFiyat);
        System.out.println("KDV'li Tutar : " + kdvliFiyat);




    }




}
