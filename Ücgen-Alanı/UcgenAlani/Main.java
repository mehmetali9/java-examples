package UcgenAlani;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double kenar1,kenar2,kenar3;

        System.out.println("1.Kenarı Giriniz : ");
        kenar1 = scan.nextInt();
        System.out.println("2.Kenarı Giriniz : ");
        kenar2 = scan.nextInt();
        System.out.println("3.Kenarı Giriniz : ");
        kenar3 = scan.nextInt();

        double u = (kenar1+kenar2+kenar3) / 2;
        double cevre = 2 * u;
        double alan = u * (u-kenar1)*(u-kenar2)*(u-kenar3);

        System.out.println(" Üçgenin çevresi : " + cevre );
        System.out.println(" Üçgenin Alanı : " + alan);


    }
}
