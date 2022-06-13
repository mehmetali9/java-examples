package SimpleUserLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "admin",
                password = "admin123",
                userName,
                userPassword,
                newPassword;

        int select;

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        userPassword = input.nextLine();

        if (userName.equals(name) && password.equals(userPassword)) {
            System.out.println("Giriş Yaptınız ! ");
        } else  {
            System.out.println("Bilgileriniz Yanlış ! \nŞirenizi Yenilemek İster Misiniz ?");
            System.out.println("1-Evet\n2-Çıkış");
            System.out.print("Seçiminiz : ");

            select = input.nextInt();

            if (select == 1) {
                System.out.print("Yeni Şifreyi Giriniz : " + (input.nextLine()));
                newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Yeni şifre Oluşturuldu.");
                }


            }else {
                System.out.println("Çıkış Yapılıyor.");
            }

        }


    }
}
