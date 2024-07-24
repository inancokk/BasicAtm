import java.util.Scanner;

public class hesap {
    private String kullanıcıadı;
    private String parola;
    private int bakiye;

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public hesap(String kullanıcıadı, String parola, int bakiye) {
        this.kullanıcıadı = kullanıcıadı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void parayatır(int tutar) {
        Scanner scanner = new Scanner(System.in);
        bakiye = bakiye + tutar;
        System.out.println("Yeni bakiyeniz " + bakiye);

    }

    public void paraçek(int tutar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çekilecek miktarı girin : ");
        if (bakiye - tutar < 0) {
            System.out.println("Paran mı var aç köpek");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
    }
}

