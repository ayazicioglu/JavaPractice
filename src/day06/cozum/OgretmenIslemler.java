package day06.cozum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{
        Scanner scan=new Scanner(System.in);
       static int sicilNo=1000;
      static ArrayList<Ogretmen> ogretmenList=new ArrayList<>();
    void ogretmenMenu(){
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
                ogretmenMenu();
            }
        }
    }

    @Override
    public void ekleme() {
        System.out.print("ÖĞRETMENİN ADINI GİRİNİZ");
        scan.nextLine();
        String ad=scan.nextLine();
        System.out.print("ÖĞRETMENİN SOYADINI GİRİNİZ");
        String soyad=scan.nextLine();
        System.out.print("TC NO SUNU GİRİNİZ");
        String tcNo=scan.next();
        System.out.print("ÖĞRETMENİN YAŞINI GİRİNİZ");
        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRETMENİN BÖLÜMÜNÜ GİRİNİZ");
        String bolum=scan.nextLine();
        Ogretmen ogretmen=new Ogretmen(ad,soyad,tcNo,yas,bolum,++sicilNo);
        ogretmenList.add(ogretmen);
        ogretmenMenu();

    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KİŞİNİN TC NO SUNU GİRİNİZ");
        String tcNo=scan.next();
        int kontrol=0;
        for (Ogretmen each:ogretmenList
             ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=1;
                ogretmenMenu();
            }
        }
        if (kontrol==0){
            System.out.println("TC NO KİŞİ BULUNMAMAKTADIR");
        }
        ogretmenMenu();
    }

    @Override
    public void listeleme() {
        for (Ogretmen each:ogretmenList
             ) {
            System.out.println(each);
        }
        ogretmenMenu();

    }

    @Override
    public void silme() {
        System.out.println("SİLİNECEK KİŞİNİN TC NOSUNU GİRİNİZ");
        String tcNO=scan.next();
        boolean kontrol=false;
        for (int i = 0; i < ogretmenList.size(); i++) {
            if (ogretmenList.get(i).getTcNo().equals(tcNO)){
                System.out.println("SİLİNEN KİŞİ "+ogretmenList.get(i));
                ogretmenList.remove(i);
                kontrol=true;
                listeleme();
                ogretmenMenu();
            }
        }
        if (kontrol){
            System.out.println("SİLİNECEK KİŞİ BULUNAMADI");
            ogretmenMenu();
        }



    }
}
