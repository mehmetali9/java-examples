package FaktoriyelBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //formül n! / (r! * (n-r)!)
        System.out.println("Faktöriyel n sayısı : ");
        int n = scan.nextInt();

        System.out.println("Faktöriyel r sayısı");
        int r = scan.nextInt();

        int total = 1;
        int total1 = 1;
        int total2 = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int k = 1; k <= r; k++) {
            total1 = total1 * k;
        }
        for (int j = 1; j <= (n - r); j++) {
            total2 = total2 * j;
        }

        int formül = total / (total1 * total2);

        System.out.println("C(" + (n) + "," + (r) + ")" + ":" + formül);

    }
}
