Ad Soyad: Sıla Ağgül
Öğrenci no: 250541020


import java.util.Scanner;

public class NotDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Notunu gir (0-100): ");
        double not = input.nextDouble();

        if (not >= 50) {
            System.out.println("Geçtin.");
        } else {
            System.out.println("Kaldın.");
        }
    }
}
