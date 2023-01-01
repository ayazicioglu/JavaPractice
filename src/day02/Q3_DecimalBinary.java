package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3_DecimalBinary {
    //Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
//Örnek: 12 = 1 1 0 0

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen binary ifadeye çevrilecek decimal değer  giriniz ");
        int decSayi=scan.nextInt();
        System.out.println(binaryeCevir(decSayi));
    }

    private static ArrayList<Integer> binaryeCevir(int decSayi) {
        ArrayList<Integer> binary=new ArrayList<>();
        while (decSayi>=1){
            binary.add(decSayi%2);
            decSayi/=2;
        }
        Collections.reverse(binary);// [0, 1, 1]  olarak çıkar. bu metodla terse döndürür [1, 1, 0] olur
        return binary;
    }
}
