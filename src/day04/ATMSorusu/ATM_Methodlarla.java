package day04.ATMSorusu;

import java.util.Scanner;

public class ATM_Methodlarla {

    static Scanner scan=new Scanner(System.in);
    static double bakiye=1000;
    static int kayitliSifre=6543;
    static String kayitliKartNo="987654321";

    static String iban;
    static double eft;
    static int yenisifre;
    static int yatirilacak;
    static int sifre;
    static int secim;

    static String strKartNo;

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
        System.out.println("*********SöğüşBANK'a HOŞGELDİNİZ**********");

        do {
            girisKontrol();
        }
        while (!(strKartNo.equals(kayitliKartNo) && sifre==kayitliSifre));


        do { menuSirala();
            islemYap();
        } while (secim!=6);

    }
    public static void girisKontrol() {
        System.out.println("Lütfen kart numaranızı giriniz: ");
        strKartNo = scan.nextLine();
        strKartNo = strKartNo.replaceAll(" ", "");
        System.out.println("Lütfen şifrenizi giriniz:");
        sifre = scan.nextInt();
        scan.nextLine();
    }
    public static void bakiyeSorgula(){
        System.out.println("Mevcut bakiyeniz: "+bakiye+" TL'dir");}

    public static void paraYatir(){
    System.out.println("Yatirmak istediğiniz tutari giriniz: ");
    yatirilacak= scan.nextInt();
    bakiye+=yatirilacak;
    System.out.println("Hesabınıza "+yatirilacak+" TL yatırdınız, mevcut bakiye: "+bakiye+" TL.");}

    public static void paraCek(){
        System.out.println("Çekmek istediğiniz tutari giriniz:");
        double tutar=scan.nextDouble();
        if (tutar<bakiye){
            bakiye=bakiye-tutar;
            System.out.println(tutar+" TL çekildi, kalan bakiye: "+bakiye);
        }else System.out.println("Bakiye yetersiz");}

    public static void paraGonder(){
        scan.nextLine();
        System.out.println("Göndermek istediğiniz IBAN no giriniz:");
        iban=scan.nextLine().toUpperCase().replace("\\s","");
        if ((iban.startsWith("TR") && (iban.length()==26))){
            System.out.println("Göndermek istediğiniz tutari giriniz:");
            eft=scan.nextDouble();
            if (eft<bakiye){
                bakiye=bakiye-eft;
                System.out.println(iban+" nolu IBAN'a "+eft+" TL gönderdiniz, kalan bakiye "+bakiye);}
            else System.out.println("Bakiye yetersiz");
        }
        else{
            System.out.println("Yanlış bir IBAN girdiniz");
            paraGonder();
        }
    }



    public static void sifreDegistir(){
        System.out.println("Lütfen mevcut şifrenizi giriniz:");
        sifre=scan.nextInt();
        if (sifre==kayitliSifre){
            System.out.println("Yeni şifrenizi giriniz: ");
            yenisifre=scan.nextInt();
            sifre=yenisifre;
            scan.nextLine();//dummy kukla iki scan objesi kullanma durumunda sorunu aşmak için kullanılır
            System.out.println("Şifreniz kaydedildi");
            girisKontrol();
        }
        else {
            System.out.println("Yanlış şifre girdiniz.");
            sifreDegistir();
        }

    }

    public static void cikisYap(){
        System.out.println("Hoşçakalın");}

    public static void menuSirala(){
        System.out.println("MENÜ\n1-Bakiye Sorgula\n2-Para Yatırma\n3-Para Çekme\n" +
                "4-Para Gönderme\n5-Şifre Değiştirme\n6-Çıkış");
        System.out.println("Lütfen bir seçim yapınız: ");
        secim=scan.nextInt();}

    public static void islemYap(){
        if (secim==1){
            bakiyeSorgula();
        }
        else if (secim==2) {
            paraYatir();
        }
        else if (secim==3) {
            paraCek();
        }
        else if (secim==4) {
            paraGonder();
        }
        else if (secim==5) {
            sifreDegistir();
        }
        else if (secim==6) {
            cikisYap();
        }
        else System.out.println("Geçersiz seçim yapıldı");}
}

