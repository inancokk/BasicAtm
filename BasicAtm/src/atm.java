import java.util.Scanner;

public class atm {
    public void çalış(hesap hesap) {
        login login = new login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz");
        System.out.println("*************************************");
        System.out.println("Kullanıcı girişi :");
        System.out.println("*************************************");
        int girishakkı = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı");
                break;
            } else {
                System.out.println("Giriş başarısız");
                girishakkı -= 1;
                System.out.println("Kalan giriş hakkı " + girishakkı);
            }
            if (girishakkı == 0) {
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }
        System.out.println("**************************************");
        String islemler = "1. Bakiye görüntüle\n"
                + "2. Para yatırma\n"
                + "3. Para çekme\n"
                + "Çıkış için q'ya basın";
        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");
        while (true) {
            System.out.println("İşlemi seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")){
                System.out.println(hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.parayatır(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraçek(tutar);
                
            }
            else {
                System.out.println("Geçersiz işlem!!!");
            }
        }
    }
}
