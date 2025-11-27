import java.util.Scanner;

public class SayiOku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı gir: ");
        int sayi = input.nextInt();

        System.out.println("Girdiğin sayı: " + sayi);
    }
}
