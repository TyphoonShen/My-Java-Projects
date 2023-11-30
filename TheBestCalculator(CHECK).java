import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList checker = new ArrayList();
        ArrayList islem = new ArrayList();
        int toplam = 0;

        System.out.println("-Toplama\n-Cikarma\n-Carpma\n-Bolme");
        String secim = scan.nextLine();

        islem.add(secim);

        if (islem.contains("Toplama") || islem.contains("toplama")) {
            while (true) {
                System.out.print("Sayi: ");
                String stringToplamaSayi = scan.nextLine();
                checker.add(stringToplamaSayi);
                if (checker.contains("Exit") || checker.contains("exit")) {
                    System.out.println("Toplam: " + toplam);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
                else {
                    int sayi = Integer.parseInt(stringToplamaSayi);
                    toplam += sayi;
                }
            }
        }

        if (islem.contains("Cikarma") || islem.contains("cikarma")) {
            System.out.print("Sayi: ");
            String cikarmaStringIlkSayi = scan.nextLine();
            checker.add(cikarmaStringIlkSayi);
            if (checker.contains("Exit") || checker.contains("exit")) {
                System.out.println("Sonuc: 0");
                System.out.println("Cikis Yapiliyor...");
                System.exit(0);
            }
            int cikarmaIntIlkSayi = Integer.parseInt(cikarmaStringIlkSayi);
            while (true) {
                System.out.print("Sayi: ");
                String stringCikarmaSayi = scan.nextLine();
                checker.add(stringCikarmaSayi);
                if (checker.contains("Exit") || checker.contains("exit")) {
                    System.out.println("Sonuc: " + cikarmaIntIlkSayi);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
                else {
                    int intCikarmaSayi = Integer.parseInt(stringCikarmaSayi);
                    cikarmaIntIlkSayi -= intCikarmaSayi;
                }

            }
        }

        if (islem.contains("Carpma") || islem.contains("carpma")) {
            System.out.print("Sayi: ");
            String carpmaStringIlkSayi = scan.nextLine();
            checker.add(carpmaStringIlkSayi);
            if (checker.contains("Exit") || checker.contains("exit")) {
                System.out.println("Sonuc: 0");
                System.out.println("Cikis Yapiliyor...");
                System.exit(0);
            }
            int carpmaIntIlkSayi = Integer.parseInt(carpmaStringIlkSayi);                //tamamlandi
            while (true) {
                System.out.print("Sayi: ");
                String stringCarpmaSayi = scan.nextLine();
                checker.add(stringCarpmaSayi);
                if (checker.contains("Exit") || checker.contains("exit")) {
                    System.out.println("Sonuc: " + carpmaIntIlkSayi);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
                else {
                    int intCarpmaSayi = Integer.parseInt(stringCarpmaSayi);
                    carpmaIntIlkSayi *= intCarpmaSayi;
                }
            }
        }

        if (islem.contains("Bolme") || islem.contains("bolme")) {
            System.out.print("Sayi: ");
            String stringBolmeIlkSayi = scan.nextLine();
            int intBolmeIlkSayi = Integer.parseInt(stringBolmeIlkSayi);
            checker.add(stringBolmeIlkSayi);                                             //tamamlandi
            if (checker.contains("Exit") || checker.contains("exit")){
                System.out.println("Sonuc: " + intBolmeIlkSayi);
                System.out.println("Cikis Yapiliyor...");
                System.exit(0);
            }
            
            while (true) {
                System.out.print("Sayi: ");
                String stringBolmeSayi = scan.nextLine();
                checker.add(stringBolmeSayi);
                if (checker.contains("Exit") || checker.contains("exit")) {
                    System.out.println("Sonuc: " + intBolmeIlkSayi);
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
                }
                else {
                    int intBolmeSayi = Integer.parseInt(stringBolmeSayi);
                    intBolmeIlkSayi /= intBolmeSayi;
                }
            }
        }
        
    }
}