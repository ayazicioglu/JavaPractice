package day06.bireysel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodDepo {
    public static void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");
        int secim= scan.nextInt();
        if (secim==1){
            System.out.println("============= İŞLEMLER =============\n" +
                    "\t\t 1-EKLEME\t\t\t \n" +
                    "\t\t 2-ARAMA\n" +
                    "\t\t 3-LİSTELEME\n" +
                    "\t\t 4-SİLME\n" +
                    "\t\t Q-ÇIKIŞ\n" +
                    "\t\t\n" +
                    "\tSEÇİMİNİZ:\n");
            int islem=scan.nextInt();
            switch (islem){
                case 1:ogrenciEkleme();
                case 2:ogrenciArama();
                case 3:ogrenciSilme();
                case 4:
            }
        }
        if (secim==2){
            System.out.println("============= İŞLEMLER =============\n" +
                    "\t\t 1-EKLEME\t\t\t \n" +
                    "\t\t 2-ARAMA\n" +
                    "\t\t 3-LİSTELEME\n" +
                    "\t\t 4-SİLME\n" +
                    "\t\t Q-ÇIKIŞ\n" +
                    "\t\t\n" +
                    "\tSEÇİMİNİZ:\n");
            int islem=scan.nextInt();
            switch (islem){
                case 1:
                case 2:
                case 3:
                case 4:
            }
            
        }
        if (secim==3) {
            System.out.println("HOŞÇAKALIN");
            System.exit(0);
        }

    }

    private static void ogrenciSilme() {
    }

    private static void ogrenciArama() {
    }

    private static void ogrenciEkleme() {
        Scanner scan=new Scanner(System.in);
        List<String> ogrenciList=new ArrayList<>();
        Ogrenci ogrenci1=new Ogrenci();
        System.out.println("Öğrenci ismini giriniz");
        ogrenci1.isim=scan.nextLine();
        System.out.println("Öğrenci soyismini giriniz");
        ogrenci1.soyisim=scan.nextLine();
        System.out.println("Öğrenci kimlik numarası giriniz");
        ogrenci1.kimlikNo=scan.nextLine();
        System.out.println("Öğrenci sınıfını giriniz");
        ogrenci1.sinif=scan.nextInt();
        System.out.println("Öğrenci yaşını giriniz");
        ogrenci1.yas= scan.nextInt();
        System.out.println("Öğrenci numarası giriniz");
        ogrenci1.numara=scan.nextLine();
        
        
        
    }
}
