package day04;

import java.util.Scanner;

public class ATM_SwitchCaseLe {

    static Scanner scan=new Scanner(System.in);
    static double bakiye=1000;
    static int kayitliSifre=6543;
    static int kayitliKartNo=987654321;
    public static void main(String[] args) {
        /*
        ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme
         ve cikis islemleri olacaktır.
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve
        toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
         */
        int kartNo;
        int sifre;
        do {
            System.out.println("Lütfen kart numaranızı giriniz: ");
            kartNo= scan.nextInt();
            System.out.println("Lütfen şifrenizi giriniz:");
            sifre= scan.nextInt();
        }

        while (!(kartNo==(kayitliKartNo) && sifre==kayitliSifre));


            System.out.println("MENÜ\n1-Bakiye Sorgula\n2-Para Yatırma\n3-Para Çekme\n" +
                "4-Para Gönderme\n5-Şifre Değiştirme\n6-Çıkış");
        System.out.println("Lütfen bir seçim yapınız: ");
        int secim=scan.nextInt();
        String IBAN;
        double eft;
        int yenisifre;
        int yatirilacak;

           switch (secim){
               case 1:
                   System.out.println("Mevcut bakiyeniz: "+bakiye+" TL'dir");
                   break;
               case 2:
                   System.out.println("Yatirmak istediğiniz tutari giriniz: ");
                   yatirilacak= scan.nextInt();
                   bakiye+=yatirilacak;
                   System.out.println("Hesabınıza "+yatirilacak+" TL yatırdınız, mevcut bakiye: "+bakiye+" TL.");
                   break;
               case 3:
                   System.out.println("Çekmek istediğiniz tutari giriniz:");
                   double tutar=scan.nextDouble();
                   if (tutar<bakiye){
                       bakiye=bakiye-tutar;
                       System.out.println(tutar+" TL çekildi, kalan bakiye: "+bakiye);
                   }else System.out.println("Bakiye yetersiz");
                   break;
               case 4:
                   System.out.println("Göndermek istediğiniz IBAN no giriniz:");
                   IBAN=scan.nextLine();
                   if ((IBAN.startsWith("TR") && (IBAN.length()==26))){
                       System.out.println("Göndermek istediğiniz tutari giriniz:");
                       eft=scan.nextDouble();
                       if (eft<bakiye){
                           bakiye=bakiye-eft;
                           System.out.println(IBAN+" nolu IBAN'a "+eft+" TL gönderdiniz, kalan bakiye "+bakiye);}
                       else System.out.println("Bakiye yetersiz");
                   }
                   else  System.out.println("Yanlış bir IBAN girdiniz");
                   break;

               case 5:
                   System.out.println("Lütfen mevcut şifrenizi giriniz:");
                   sifre=scan.nextInt();
                   if (sifre==kayitliSifre){
                       System.out.println("Yeni şifrenizi giriniz: ");
                       yenisifre=scan.nextInt();
                       sifre=yenisifre;
                       System.out.println("Şifreniz kaydedildi");
                   }else System.out.println("Yanlış şifre girdiniz.");
                   break;
               case 6:
                   System.out.println("Hoşçakalın");
                   break;
               default:
                   System.out.println("Geçersiz seçim yapıldı");
           }

        }
    }

