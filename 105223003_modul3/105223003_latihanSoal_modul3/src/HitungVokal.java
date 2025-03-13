import java.util.Scanner;

public class HitungVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine().toLowerCase(); 
        scanner.close();

        int jumlahVokal = 0;

        for (char huruf : kalimat.toCharArray()) {
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah huruf vokal: " + jumlahVokal);
                System.out.println("Jumlah vokal genap");
                break;
            case 1:
                System.out.println("Jumlah huruf vokal: " + jumlahVokal);
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        System.out.print("Kalimat terbalik: ");
        char[] arrKarakter = kalimat.toCharArray();
        for (int i = arrKarakter.length - 1; i >= 0; i--) {
            System.out.print(arrKarakter[i]);
        }
        System.out.println();
    }
}
