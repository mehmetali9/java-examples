package UcakBileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, age, type;
        double price;

        System.out.println("Mesafeyi KM türünden giriniz :");
        distance = input.nextInt();


        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();


        System.out.print("Yolculuk tipini secin (1-Tek Yön, 2-Gidis-Dönüs): ");
        type = input.nextInt();

        if (distance > 0 && age > 0 && (type == 1 || type == 2)) {
            price = distance * 0.10;

            if (age<12){
                price -= price * 0.5;
            } else if (age > 11 & age < 25){
                price -= price * 0.1;
            } else if (age <65){
                price -= price * 0.3;
            }

            if (type == 2){
                price = (price - (price * 0.2))*2;
            }

            System.out.println(price + "TL ");
        } else {
            System.out.println("Hatalı Veri Girdiniz ! ");
        }


    }
}
