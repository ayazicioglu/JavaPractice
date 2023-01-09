package day05.ogrenciBase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
     */
    Scanner scan=new Scanner(System.in);
    static int numara=1000;
    ArrayList<Ogrenci> ogrList=new ArrayList<>();
    void islemler(){
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ....");


    try{
        int secim= scan.nextInt();
        switch (secim){
            case 1:{
                ekleme();
            }
            case 2:{
                System.out.println("ARANACAK TC NOYU GİRİNİZ: ");
                arama(scan.next());
            }
            case 3:{
                listeleme();
            }
            case 4:{
                silme();
            }
            default:
                System.out.println("HATALI DEĞER GİRDİNİZ");
        }

    }catch (InputMismatchException e){
        String islem=scan.next();
        if (islem.equalsIgnoreCase("q")){
            System.out.println("**********SiSTEMDEN ÇIKILIYOR**********");
            System.exit(0);
        }else {
            System.out.println("HATALI GİRİŞ YAPILDI");
            islemler();
        }
    }

}
    private void silme() {
        System.out.println("SİLİNECEK ÖĞRENCİNİN TC NOSUNU GİRİNİZ");
        String tcNo=scan.next();
        boolean kontrol=true;
        for (int i = 0; i <= ogrList.size(); i++) {
            if (ogrList.get(i).getTcNo().equals(tcNo)){
                ogrList.remove(i);
                kontrol=false;
                listeleme();
                islemler();
            }
        }
        if (kontrol){
            System.out.println("BU TC NO YA AİT ÖĞRENCİ YOKTUR!!!");
           islemler();
        }


    }

    private void listeleme() {
        for (Ogrenci each:ogrList) {
            System.out.println(each);
            System.out.println();
        }
        islemler();
    }

    private void arama(String tcNo) {
        for (Ogrenci each:ogrList) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println("ARANAN ÖĞRENCİ: "+each);
                islemler();
            }
            }
        }
         {
            System.out.println(" BU TC NO YA AİT ÖĞRENCİ YOKTUR");
            islemler();
    }

    private void ekleme() {

        System.out.print("ÖĞRENCİ ADI: ");
        scan.next();
        String ad=scan.nextLine();
        System.out.println("ÖĞRENCİ SOYADI: ");
        String sAd=scan.nextLine();
        System.out.println("ÖĞRENCİ KİMLİK NO: ");
        String tcNo=tcNoKontrol(scan.next());
        System.out.println("ÖĞRENCİ YAŞI: ");
        int yas=scan.nextInt();
        System.out.println("ÖĞRENCİ SINIFI: ");
        String sinif=scan.next();
        Ogrenci ogrenci=new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        ogrList.add(ogrenci);
        listeleme();
        islemler();

    }

    private String tcNoKontrol(String tcNo) {
        String[] tcNoArr= tcNo.split("");
        boolean kontrol=true;
        for (String each:tcNoArr) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol=false;
            }

        }
        if (!kontrol){
            System.out.println("GİRİLEN TC NO HATALI");
            tcNoKontrol(scan.next());
            //menu();
        }
        return tcNo;
    }
}