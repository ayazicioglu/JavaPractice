package day06.cozum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements IIslemler{
    static ArrayList<Ogrenci> ogrenciList=new ArrayList<>();
    Scanner scan=new Scanner(System.in);

    static int numara=1000;
    void ogrenciMenu(){
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\t\t\t \n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\t\t\n" +
                "\tSEÇİMİNİZ:\n");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }
            }
        }catch (InputMismatchException e){
            String secim=scan.nextLine();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("YANLIŞ GİRİŞ YAPTINIZ");
                ogrenciMenu();
            }
        }
    }

    @Override
    public void ekleme() {
        System.out.print("ÖĞRENCİNİN ADINI GİRİNİZ");
        scan.nextLine();
        String ad=scan.nextLine();
        System.out.print("ÖĞRENCİNİN SOYADINI GİRİNİZ");
        String soyad=scan.nextLine();
        System.out.print("TC NO SUNU GİRİNİZ");
        String tcNo=scan.next();
        System.out.print("ÖĞRENCİNİN YAŞINI GİRİNİZ");
        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRENCİNİN SINIFINI GİRİNİZ");
        String sinif=scan.nextLine();
        Ogrenci ogrenci=new Ogrenci(ad,soyad,tcNo,yas,++numara,sinif);
        ogrenciList.add(ogrenci);
        ogrenciMenu();

    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KİŞİNİN TC NO SUNU GİRİNİZ");
        String tcNo=scan.next();
        int kontrol=0;
        for (Ogrenci each:ogrenciList
        ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=1;
                ogrenciMenu();
            }
        }
        if (kontrol==0){
            System.out.println("TC NO KİŞİ BULUNMAMAKTADIR");
            ogrenciMenu();
        }


    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList
        ) {
            System.out.println(each);
        }
        ogrenciMenu();

    }

    @Override
    public void silme() {
        System.out.println("SİLİNECEK KİŞİNİN TC NOSUNU GİRİNİZ");
        String tcNO=scan.next();
        boolean kontrol=false;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNO)){
                System.out.println("SİLİNEN KİŞİ "+ogrenciList.get(i));
                ogrenciList.remove(i);
                kontrol=true;
                listeleme();
                ogrenciMenu();
            }
        }
        if (kontrol){
            System.out.println("SİLİNECEK KİŞİ BULUNAMADI");
            ogrenciMenu();
        }

    }

}

