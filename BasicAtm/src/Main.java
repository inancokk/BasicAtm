public class Main {
    public static void main(String[] args) {
        atm atm = new atm();
        hesap hesap = new hesap("İnanç", "123456",1500);
        atm.çalış(hesap);
        System.out.println("Programdan çıkılıyor");
    }
}