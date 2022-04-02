package AsalSayi;

public class Main {
    public static void main(String[] args) {
        int asal = 0, sayac = 0, a = 0;

        for (int i = 2; i < 100; i++) {
            for (int k = 2; k < 100; k++)
                if (i % k == 0) {
                    sayac++;
                }
            if (sayac < 2) {
                System.out.print(i + " ");
            }
            sayac = 0;
        }
    }
}
