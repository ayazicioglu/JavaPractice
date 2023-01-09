package day05.geometrikSekiller;

import java.util.Scanner;

public class Daire implements IIslemler{
    Scanner scan=new Scanner(System.in);
    int yaricap;
    @Override
    public void alan() {
        System.out.println("Dairenin yarıçapını giriniz: ");
        yaricap=scan.nextInt();
        System.out.println("Alan="+(3.1415*yaricap*yaricap));
    }

    @Override
    public void cevre() {
        System.out.println("Çevre= "+(2*3.1415*yaricap));
    }
}
