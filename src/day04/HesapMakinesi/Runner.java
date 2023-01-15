package day04.HesapMakinesi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();

        System.out.println("Yapılacak islemi giriniz(+, -, *, / )");
        char islem=scan.next().charAt(0);
        Islemler islemler=new Islemler();
        switch (islem){
            case '+':{
                System.out.println("Toplam: " +islemler.toplama(sayi1, sayi2));
                break;
            }
            case '-':{
                System.out.println("Fark: " +islemler.cikarma(sayi1, sayi2));
                break;
            }
            case '*':{
                System.out.println("Çarpım: " +islemler.carpma(sayi1, sayi2));
                break;
            }
            case '/':{
                System.out.println("Bölüm: " +islemler.bolme(sayi1, sayi2));
                break;
            }
            default:
                System.out.println("yanlış giriş yaptınız");
        }
    }
}
