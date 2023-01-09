package day05.geometrikSekiller;

import java.util.Scanner;

public class Kare implements IIslemler{
    Scanner scan=new Scanner(System.in);
    int kenar=0;
    @Override
    public void alan() {
        System.out.println("Karenin bir kenar uzunluğunu giriniz:");
        kenar= scan.nextInt();
        System.out.println("Alan= "+kenar*kenar);
    }

    @Override
    public void cevre() {
        System.out.println("Çevre= "+(4*kenar));

    }
}
