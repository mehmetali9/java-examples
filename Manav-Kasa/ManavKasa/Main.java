package ManavKasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutUcret= 2.14, elmaUcret=3.67, domatesUcret=1.11, muzUcret=0.95, patlıcanUcret=5.00,toplam;

        System.out.println("Kaç Kilo Armut ? : ");
        double armut = input.nextDouble();
        System.out.println("Kaç kilo Elma ? : ");
        double elma = input.nextDouble();
        System.out.println("Kaç kilo Domates ? : ");
        double domates = input.nextDouble();
        System.out.println("Kaç kilo Muz ? : ");
        double muz = input.nextDouble();
        System.out.println("kaç kilo patlıcan ? : ");
        double patlıcan= input.nextDouble();

        toplam=(armutUcret*armut)+(elmaUcret*elma)+(domatesUcret*domates)+(muzUcret*muz)+(patlıcanUcret*patlıcan);

        System.out.println("Toplam tutar : " + toplam);

    }
}
