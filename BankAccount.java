import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    
    //giris yapmak icin bir fonksiyon acalim
 
    static void idchecker() {
        Scanner scan = new Scanner(System.in);

        int id = 93;
        int sifre = 8931;
        int girishakki = 3;

        System.out.print("Lutfen ID'nizi Giriniz: ");
        int idcheck = scan.nextInt();

        System.out.print("Lutfen Sifrenizi Giriniz: ");
        int sifrecheck = scan.nextInt();

        while (girishakki > 0) {
            if (id == idcheck) {
                if (sifre == sifrecheck) {
                    System.out.println("Basariyla Giris Yapiliyor");
                    break;
                }
                else if (sifre != sifrecheck) {
                    System.out.println("Sifreniz Hatali...");
                    girishakki--;
                    if (girishakki == 0) {
                        System.out.println("Giris Hakkiniz Bitmistir Programdan Cikiliyor...");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Lutfen ID'nizi Giriniz:");
                        idcheck = scan.nextInt();
                        System.out.println("Lutfen Sifrenizi Giriniz:");
                        sifrecheck = scan.nextInt();
                    }
                }
            }
            else if (id != idcheck && sifre != sifrecheck) {
                System.out.println("Girdiginiz ID ve Sifre Hatalidir");
                girishakki--;
                if (girishakki == 0) {
                    System.exit(0);
                }
                else {
                    System.out.println("Lutfen ID'nizi Giriniz:");
                    idcheck = scan.nextInt();
                    System.out.println("Lutfen Sifrenizi Giriniz:");
                    sifrecheck = scan.nextInt();
                }
            }
            else if (id != idcheck) {
                girishakki--;
                if (girishakki == 0) {
                    System.out.println("Giris Hakkiniz Bitmistir Programdan Cikiliyor...");
                    System.exit(0);
                }
                else {
                    System.out.println("Girdiginiz ID Yanlistir...");
                    System.out.println("Lutfen ID'nizi Giriniz:");
                    idcheck = scan.nextInt();
                    System.out.println("Lutfen Sifrenizi Giriniz:");
                    sifrecheck = scan.nextInt();
                }
            }
            
        }



    }






    //islemler icin bir fonksiyon acalim
   
    public static void islemler() {
        
        
        int bakiye = 5000;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yapmak Istediginiz Islemin Numarasini Seciniz..");
        System.out.println("1-Bakiye Goruntuleme\n2-Para Yatirma\n3-Para Cekme\n4-Cikis");
        int islem = scan.nextInt();

        if (islem == 1) {
            System.out.println("Bakiyeniz: " + bakiye);
            
        }
        else if (islem == 2) {
            System.out.println("Mevcut Bakiyeniz:" + bakiye + "\nYatirmak Istediginiz Para Miktarini Giriniz:");
            int yatirilanpara = scan.nextInt();
            bakiye += yatirilanpara;
            System.out.println("Bakiyeniz = " + bakiye);
            
        }
        else if (islem == 3) {
            System.out.println("Mevcut Bakiyeniz:" + bakiye + "Lutfen Cekmek Istediginiz Para Miktarini Giriniz");
            int cekilenpara = scan.nextInt();
            if (cekilenpara > bakiye) {
                System.out.println("Yetersiz Bakiye");
                System.out.println("Cekmek istediginiz Miktar Bakiyenizden Daha Dusuk Olamaz");
                islemler();
            }
            else {
                bakiye -= cekilenpara;
                System.out.println("Bakiyeniz = " + bakiye);
                
            }
        }
        else if (islem == 4) {
            System.out.println("Cikilyor..");
            System.out.println("Lutfen Kartinizi Almayi Unutmayiniz.");
            System.exit(0);
        }
    }


    //cikis yapmak icin bir fonksiyon acalim


    static void cikis() {
        ArrayList cikis = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cikis Yapmak Istiyor Musunuz?\nEvet - Hayir");
        String cikissorusu = scan.nextLine();
        cikis.add(cikissorusu);
        if (cikis.contains("Evet") == true || cikis.contains("evet") == true) {
            System.out.println("Cikis Yapiliyor...");
            System.exit(0);
        }
        else {
            islemler();
        }


    }
    
    


    public static void main(String[] args) {
        idchecker();
        islemler();
        cikis();
    }

}