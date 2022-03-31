package KuvvetBulma;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("4'ün katları.");
        for (int i = 1; i <= 100; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in katları");
        for (int i = 1; i <= 100; i *= 5) {
            System.out.println(i);
        }
    }
}
