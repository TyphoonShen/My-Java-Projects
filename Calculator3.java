import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Toplama ve Cikarmada cikmak icin 0'i\nCarpma ve Bolmede cikmak icin 1'i");
    
        System.out.println("Islemler:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int secim = scan.nextInt();
        int sum = 0;
        if (secim == 1) {
            while (true) {
                System.out.print("Number: ");
                int number = scan.nextInt();
                sum += number;
                if (number == 0) {
                    System.out.println("Sonuc " + sum);
                    System.out.print("Cikis Yapiliyor...");
                    System.exit(0);
                }
            }
        }
        else if (secim == 2) {
            while (true) {
                System.out.print("Number: ");
                int number = scan.nextInt();
                sum -= number;
                if (number == 0) {
                    System.out.println("Sonuc: " + sum);
                    System.out.print("Cikis Yapiliyor...");
                    System.exit(0);
                }
            }
        }
        else if (secim == 3) {
            sum = 1;
            while (true) {
                System.out.print("Number: ");
                int number = scan.nextInt();
                sum *= number;
                if (number == 1) {
                    System.out.println("Sonuc: " + sum);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
            }
        }
        else if (secim == 4) {
            System.out.print("1. Sayi: ");
            double n1 = scan.nextDouble();
            System.out.print("2. Sayi: ");
            double n2 = scan.nextDouble();
            double sum1 = n1 / n2;
            while (true) {
                System.out.print("Number: ");
                double number = scan.nextDouble();
                sum /= number;
                if (number == 1) {
                    System.out.println("Sonuc: " + sum1);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("Yanlis Numara Tusladiniz...");
        }
    
    }
    
    
}