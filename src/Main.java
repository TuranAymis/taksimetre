import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taksimetre kilometre başına 2.20 TL tutmaktadır.
        //Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double kmPrice = 2.20;
        int minPrice = 20;
        int openningPrice = 10;
        double distance;
        double price;

        Scanner scan = new Scanner(System.in);
        System.out.print("KM verisini giriniz: ");
        distance = scan.nextDouble();

        price = openningPrice + (kmPrice * distance);

        if (price < minPrice){
            price = minPrice;
            System.out.print("Taksimetre tutarı: " + price);
        }else {
            System.out.print("Taksimetre tutarı: " + price);
        }

    }
}