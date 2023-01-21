package day06.cozum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
   Scanner scan=new Scanner(System.in);
    void menu(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                    ogrenciMenu.ogrenciMenu();
                }
                case 2:{
                    OgretmenIslemler ogretmenMenu=new OgretmenIslemler();
                    ogretmenMenu.ogretmenMenu();
                }
            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("Sistemden Çıkılıyor");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                menu();
            }
        }
    }
}
