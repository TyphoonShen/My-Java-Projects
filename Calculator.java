import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz;\n1-Toplama (+)\n2-Cikarma (-)\n3-Carpma (x)\n4-Bolme (/)\n5-Karekok Alma (SquareRoot)\n\n6-Exit");
        int islem = scan.nextInt();

        if (islem == 1) {
            int sonuc = 0;
            while (true) {

                System.out.println("Lutfen Bir Sayi Giriniz\nCikmak Icin 0'i Tuslayiniz\n**************************");
                int sayi = scan.nextInt();

                if (sayi == 0) {
                    System.out.println("***********************");
                    System.out.println("Sonuc: " + sonuc);
                    System.out.println("***********************");
                    System.out.println("Program Sonlandiriliyor");
                    System.exit(0);
                }
                else if (sayi != 0) {
                    sonuc += sayi;
                    
                }
                

            }

        }
        else if (islem == 2) {
            System.out.println("Lutfen Bir Sayi Giriniz\nCikmak Icin 0'i Tuslayiniz\n***************************");
            int sayi1 = scan.nextInt();
            if (sayi1 == 0) {
                System.out.println("Program Sonlandiriliyor...");
                System.exit(0);
            }
            int sonuc1 = sayi1;
            while (true) {
                
                System.out.println("Lutfen Bir Sayi Giriniz\nCikmak Icin 0'i Tuslayiniz\n***************************");
                sayi1 = scan.nextInt();
                
                

                if (sayi1 == 0) {
                    System.out.println("***********************");
                    System.out.println("Sonuc: " + sonuc1);
                    System.out.println("***********************");
                    System.out.println("Program Sonlandiriliyor...");
                    System.exit(0);
                }
                else if (sayi1 != 0) {
                    
                    sonuc1 = sonuc1 - sayi1;
                }
            }
        }
        else if (islem == 3) {
            int sonuc2 = 1;

            while (true) {

                System.out.println("Lutfen Bir Sayi Giriniz\nCikmak Icin 0'i Tuslayiniz\n***************************");
                int sayi2 = scan.nextInt();

                if (sayi2 == 0) {
                    System.out.println("***********************");
                    System.out.println("Sonuc: " + sonuc2);
                    System.out.println("***********************");
                    System.out.println("Program Sonlandiriliyor...");
                    System.exit(0);
                }
                else if (sayi2 != 0) {
                    sonuc2 *= sayi2;

                }

            }
        }
        else if (islem == 4) {
            System.out.println("Lutfen Bir Sayi Giriniz\nCikmak Icin 0'i Tuslayiniz\n**********************");
            int sayi3 = scan.nextInt();
            float sonuc3 = sayi3;
            if (sayi3 == 0) {
                System.out.println("Program Sonlandiriliyor...");
                System.exit(0);
            }
            
            while (true) {

                System.out.println("Lutfen Bir Sayi Giriniz\nCikamk Icin 0'i Tuslayiniz\n********************");
                sayi3 = scan.nextInt();

                if (sayi3 == 0) {
                    System.out.println("***********************");
                    System.out.println("Sonuc: " + sonuc3);
                    System.out.println("***********************");
                    System.out.println("Program Sonlandiriliyor...");
                    System.exit(0);
                }
                else if (sayi3 != 0) {
                    sonuc3 /= sayi3;
                }

            }
        }
        else if (islem == 5) {
            System.out.println("Lutfen Karekokunu Almak Istediginiz Sayiyi Giriniz;");
            int sayi4 = scan.nextInt();
            double sonuc4 = Math.sqrt(sayi4);

            System.out.println("Sonuc: " + sonuc4);
        }

        else if (islem == 6) {
            System.out.println("Program Sonlandiriliyor...");
            System.exit(0);
        }

    }
}