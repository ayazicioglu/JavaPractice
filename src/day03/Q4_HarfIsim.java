package day03;

public class Q4_HarfIsim {
     /*
     String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ
     */
     public static void main(String[] args) {
         String arr[]={"Kemal","Jonathan","Mark","Jackson","Ali"};
         System.out.println(harfkontrol(arr));
     }

    private static String harfkontrol(String[] arr) {
         String ilkHarfler="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("n")||arr[i].endsWith("k")){
                ilkHarfler+=arr[i].charAt(0);
            }
        }
        return ilkHarfler;
    }
}
