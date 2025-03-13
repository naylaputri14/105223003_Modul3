import java.util.Scanner;

public class DiskonToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja anda: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error!");
            return;
        }
        double totalBelanja = scanner.nextDouble();
        scanner.nextLine();

        if (totalBelanja < 0) {
            System.out.println("Error!");
            return;
        }

        System.out.print("Masukkan tipe member anda (Platinum/Gold/Silver/None): ");
        String memberType = scanner.nextLine().trim();

        switch (memberType.toLowerCase()) {
            case "platinum":
            case "gold":
            case "silver":
            case "none":
                break;
            default:
                System.out.println("Error!");
                return;
        }

        double diskonUtama = 0;
        if (totalBelanja > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.10;
        }

        double hargaSetelahDiskonUtama = totalBelanja - (totalBelanja * diskonUtama);

        double tambahanDiskon = 0;
        switch (memberType.toLowerCase()) {
            case "platinum":
                tambahanDiskon = 0.05;
                break;
            case "gold":
                tambahanDiskon = 0.03;
                break;
            case "silver":
                tambahanDiskon = 0.02;
                break;
            case "none":
                tambahanDiskon = 0;
                break;
        }

        double totalSetelahDiskon = hargaSetelahDiskonUtama - (hargaSetelahDiskonUtama * tambahanDiskon);

        String statusDiskon = (diskonUtama > 0 || tambahanDiskon > 0) ? "Ya" : "Tidak";

        System.out.println("\n===== Rincian Pembelian =====");
        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon Utama: " + (diskonUtama * 100) + "%");
        System.out.println("Harga Setelah Diskon Utama: Rp" + hargaSetelahDiskonUtama);
        System.out.println("Tambahan Diskon Member: " + (tambahanDiskon * 100) + "%");
        System.out.println("Total Akhir Setelah Semua Diskon: Rp" + totalSetelahDiskon);
        System.out.println("Mendapatkan Diskon? " + statusDiskon);

        scanner.close();
    }
}