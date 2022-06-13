package SinifGecme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;

        System.out.println("Matematik Notunuz : ");
        mat= input.nextInt();
        int ders1 =(mat > 100 || mat < 0) ? 0 : mat;  // not 100den büyük veya 0dan küçük ise

        System.out.println("Türkçe Notunuz : ");
        turkce=input.nextInt();
        int ders2 =(turkce > 100 || turkce < 0) ? 0 : turkce;

        System.out.println("Fizik Notunuz : ");
        fizik=input.nextInt();
        int ders3 =(fizik > 100 || fizik < 0) ? 0 : fizik;

        System.out.println("Kimya Notunuz : ");
        kimya=input.nextInt();
        int ders4 =(kimya > 100 || kimya < 0) ? 0 : kimya;

        System.out.println("Müzik Notunuz : ");
        muzik=input.nextInt();
        int ders5 =(muzik > 100 || muzik < 0) ? 0 : muzik;

        int toplam = (ders1+ders2+ders3+ders4+ders5);

        double averange = toplam / 5.00 ;

        if(averange >=55 && averange<=100){

            System.out.println("Tebrikler Sınıfı geçtiniz ortalamanız : "+ averange);

        } else if (averange >=0 && averange < 55) {
            System.out.println("Sınıfta kaldınız... Ortalamanız " + averange);
        }
    }
}
