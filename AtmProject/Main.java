package AtmProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            String userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            String password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba. Kodluyoruz Bankası'na Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış yap ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            price = scanner.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye yetersiz.");
                            else
                                balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + --right);
                if (right == 0)
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");


            }
        }
    }
}
