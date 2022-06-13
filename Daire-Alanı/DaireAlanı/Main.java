package DaireAlanı;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,m;
        double pi = 3.14, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        m= input.nextInt();
        System.out.println("Yarı çapı giriniz : ");
        r= input.nextInt();

        alan=(pi*(r*r)*m)/360;
        System.out.println(alan);

    }
}
