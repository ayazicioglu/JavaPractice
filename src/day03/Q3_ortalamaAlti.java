package day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3_ortalamaAlti {
     /*
    kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında,
    kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
     */
     public static void main(String[] args) {
         System.out.println("Dizi uzunluğunu giriniz: ");
         Scanner scan=new Scanner(System.in);
         int uzunluk= scan.nextInt();

         arrayOlustur(uzunluk);
     }

    private static void arrayOlustur(int uzunluk) {
         int arr[]=new int[uzunluk];
        Random rnd=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rnd.nextInt(100);
            toplam+=arr[i];
        }
        double ort=toplam/arr.length;
        int alt=0,ust=0,esit=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ort) alt++;
            else if (arr[i] > ort) ust++;
            else esit++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(alt+" adet sayi ortalamadan kucuk\n"
                +ust+" adet sayi ortalamadan buyuk\n"+esit+" adet sayi ortalamaya esit");
    }
}
