import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // if-else
        boolean x = true;
        if (x) {
            System.out.println("Ini adalah blok if");
        } else {
            System.out.println("Ini adalah blok else");
        }

        int a = 10;
        if (a > 5) {
            System.out.println("a lebih besar dari 5");
        } else {
            System.out.println("a lebih kecil dari 5");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int nilai = input.nextInt();

        if (nilai > 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai > 60) {
            System.out.println("Nilai Anda c");
        } else if (nilai > 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
        
        // swich-case
        int day = 1;
        switch(day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;    
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }

        int angka = 5;
        if (angka % 2 == 0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

        // ternary operator
        String hasil = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";
        System.out.println(hasil);

        // for-loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + (i + 1));
        }

        // while-loop
        int i = 0;
        while (i < 5) {
            System.out.println("Perulangan ke-" + (i + 1));
            i++;
        }

        // do-while
        do {
            System.out.println("Perulangan ke-" + (i + 1));
            i++;
        } while (i < 5);

        // foreach
        int numbers[] = {1, 2, 3, 4, 5};
        for (int j : numbers) {
            System.out.println(j);
        }

        // break and continue
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println("Perulangan ke-" + j);
        }

        input.close();

        while (true){
            System.out.println("Pilih menu");
            System.out.println("1. Menu 1");
            System.out.println("2. Menu 2");
            System.out.println("3. Menu 3");
            System.out.println("0. Keluar");

            Scanner input2 = new Scanner(System.in);
            System.out.print("Masukkan pilihan: ");
            int pilihan = input2.nextInt();
            switch(day) {
                case 1:
                    System.out.println("Anda memilih menu 1");
                    break;
                case 2:
                    System.out.println("Anda memilih menu 2");
                    break;
                case 3:
                    System.out.println("Anda keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}