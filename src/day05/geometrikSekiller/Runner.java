package day05.geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-KARE\n" +
                "\t\t 2-DİKDÖRTGEN\n" +
                "\t\t 3-DAİRE\n" +
                "\n" +
                "SEÇİMİNİZ....");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                Kare kare1=new Kare();
                kare1.alan();
                kare1.cevre();
            }
            case 2:{
                Dikdortgen dikdortgen1=new Dikdortgen();
                dikdortgen1.alan();
                dikdortgen1.cevre();
            }
            case 3:{
                Daire daire1=new Daire();
                daire1.alan();
                daire1.cevre();
            }
        }
    }
}
