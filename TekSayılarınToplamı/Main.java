package TekSayılarınToplamı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total = 0;

        do {
            System.out.println("Sayı Giriniz : ");
            n = input.nextInt();
            if(n % 2 ==1){
                total +=n;
            }
        }while (n<0);

        System.out.println("Toplam : " + total);
    }
}
