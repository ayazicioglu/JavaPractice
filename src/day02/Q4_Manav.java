package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4_Manav {
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim :Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
     * istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
     * kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     */
    static ArrayList<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Limon","Elma","Tere"));
    static ArrayList<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,7,5,10,3));
    static double toplam;
    public static void main(String[] args) {
        ArrayList<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Limon","Elma","Tere"));
        ArrayList<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,7,5,10,3));

        System.out.println("**********PAZARTESİ PAZARI**************");
        menu();

    }

    public static void menu() {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+".ürün: " +urunList.get(i)+" fiyatı: "+fiyatList.get(i));
        }
        System.out.println("Seçmek istediginiz ürünün kodunu giriniz: ");
        int secilenUrun= scan.nextInt();
        System.out.println("Miktar giriniz: ");
        double miiktar= scan.nextInt();
        toplam+=miiktar*fiyatList.get(secilenUrun);
        System.out.println("Alışverişe devam etmek istiyor musunuz? E/H");
        char secim=scan.next().charAt(0);
        if (secim=='e'||secim=='E'){
            menu();
        }else System.out.println("ödemeniz gereken tutar: "+toplam);
    }
}
