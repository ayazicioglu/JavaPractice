package day03;

import java.util.Scanner;

public class Q1_StringdekiSayisalDegerleriTopla {
    public static void main(String[] args) {
        System.out.println("Cumle giriniz");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine();
        System.out.println(sayisalIfadeleriTopla(cumle));

    }

    private static int sayisalIfadeleriTopla(String cumle) {
        int toplam = 0;
        String cumleArr[] = cumle.split("");
        for (String each : cumleArr) {
            if (Character.isDigit(each.charAt(0))) {
                toplam += Integer.valueOf(each);
            }

        }
        System.out.println("FOR EACH COZUMU: "+toplam);

        System.out.println("*********FORI COZUMU***********");
        for (int i = 0; i < cumleArr.length; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))) {
                toplam += Integer.valueOf(cumleArr[i]);
            }

        }
        return toplam; //yukarıda for each çözümünde de olmalı ama her iki çözüm de olunca oraya south yazdım
    }
}
