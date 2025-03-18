import java.util.Scanner;

class Karyawan {
    String id, nama, shift;
    int jamKerja, absen;
    double gajiTotal;

    public Karyawan(String idKaryawan, String namaKaryawan, String shiftKerja, int jamKerjaKaryawan, int absenKaryawan) {
        id = idKaryawan;
        nama = namaKaryawan;
        shift = shiftKerja;
        jamKerja = jamKerjaKaryawan;
        absen = absenKaryawan;
        gajiTotal = hitungGaji();
    }

    private double hitungGaji() {
        double tarifPerJam;
        switch (shift.toLowerCase()) {
            case "pagi":
                tarifPerJam = 30000;
                break;
            case "siang":
                tarifPerJam = 35000;
                break;
            case "malam":
                tarifPerJam = 40000;
                break;
            default:
                System.out.println("Shift tidak valid");
                return 0;
        }

        double gaji = jamKerja * tarifPerJam;

        if (jamKerja > 40) {
            int jamLembur = jamKerja - 40;
            gaji += jamLembur * (tarifPerJam * 1.5);
        } else if (jamKerja < 30) {
            gaji -= gaji * 0.1;
        }

        gaji -= absen * 100000;
        return gaji;
    }

    public void tampilkanGaji() {
        System.out.printf("%-10s %-20s %-10s %-10d %-10d Rp%,.2f%n", id, nama, shift, jamKerja, absen, gajiTotal);
    }
}

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine();

        Karyawan[] karyawanList = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nData karyawan ke-" + (i + 1));
            System.out.print("ID Karyawan: ");
            String id = scanner.nextLine();
            System.out.print("Nama Karyawan: ");
            String nama = scanner.nextLine();
            System.out.print("Shift (pagi/siang/malam): ");
            String shift = scanner.nextLine();
            System.out.print("Total jam kerja dalam seminggu: ");
            int jamKerja = scanner.nextInt();
            System.out.print("Jumlah hari absen: ");
            int absen = scanner.nextInt();
            scanner.nextLine();

            if (jamKerja < 0 || jamKerja > 168 || absen < 0 || absen > 7) {
                System.out.println("Data yang dimasukkan tidak valid");
                i--;
                continue;
            }

            karyawanList[i] = new Karyawan(id, nama, shift, jamKerja, absen);
        }

        System.out.println("\nLaporan Gaji Karyawan");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %s%n", "ID", "Nama", "Shift", "Jam Kerja", "Absen", "Gaji Total");
        System.out.println("--------------------------------------------------------------------------------------");
        for (Karyawan karyawan : karyawanList) {
            karyawan.tampilkanGaji();
        }
        scanner.close();
    }
}
