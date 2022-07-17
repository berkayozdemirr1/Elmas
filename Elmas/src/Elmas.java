import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        int n, x, y, z;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Belirleyiniz : ");
        n = inp.nextInt();
        for (x = 1; x <= n; x++) {
            for (y = 1; y <= (n - x); y++) {
                System.out.print(" ");
            }
            for (z = 1; z <= (2 * x - 1); z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (x = 1; x < n; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(" ");
            }
            for (z = 1; z <= (2 * n - (2 * x + 1)); z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}