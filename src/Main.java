import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcı adı ve doğru şifreyi belirle
        String dogruSifre = "gecerliSifre";

        // Kullanıcıdan input almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan şifreyi girmesini iste.
        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        // Şifre kontrolü
        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı. Program sonlandırılıyor.");
        } else {
            System.out.println("Hatalı şifre.");

            // Kullanıcıya şifresini sıfırlamak ister mi sor.
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                // Yeni şifreyi girmesini iste.
                System.out.print("Yeni şifreyi girin: ");
                String yeniSifre = scanner.nextLine();

                // Unuttuğu şifre ile aynı olmamasını kontrol et.
                if (!yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Hata: Yeni şifre, unuttuğunuz şifre ile aynı olamaz. Şifre oluşturulamadı.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi. Program sonlandırılıyor.");
            }
        }
    }
}
