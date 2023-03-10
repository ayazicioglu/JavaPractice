package day05.ogrenciBase;

public class Ogrenci {
    /*
    -AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF
     */

    private String ad;
    private String soyAd;
    private String tcNo;
    private int yas;
    private int numara;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyAd, String tcNo, int yas, int numara, String sinif) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tcNo = tcNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{"+" ÖĞRENCİNİN ADI: " + ad +"\n"+
                "ÖĞRENCİNİN SOYADI: " + soyAd + "\n" +
                "ÖĞRENCİNİN TC NUMARASI: " + tcNo + "\n" +
                "ÖĞRENCİNİN YAŞI: " + yas +"\n" +
                "ÖĞRENCİNİN NUMARASI: " + numara +"\n" +
                "ÖĞRENCİNİN SINIFI: " + sinif + "\n" +
                '}';
    }
}
