import java.util.Scanner;

public class LatihaUAS {

    static Scanner input = new Scanner(System.in);
    static String[] namaMhs = new String[3];
    static int[] nilaiMhs = new int[3];
    static boolean dataSudahAda = false;

    public static void inputData() {
        System.out.println(" Input Data Mahasiswa ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMhs[i] = input.next();
            System.out.print("Masukkan Nilai Akhir: ");
            nilaiMhs[i] = input.nextInt();
        }
        dataSudahAda = true;
        System.out.println("Data berhasil disimpan!");
    }

    public static void tampilkanData() {
        System.out.println("Lihat Data Mahasiswa ");
        if (!dataSudahAda) {
            System.out.println("data kosong");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + namaMhs[i] + ", Nilai: " + nilaiMhs[i]);
            }
        }
    }

    public static void hitungKelulusan() {
        System.out.println(" Laporan Kelulusan");
        if (!dataSudahAda) {
            System.out.println("Data kosong, Masukkan data dulu di menu 1.");
        } else {
            int lulus = 0;
            int tidakLulus = 0;
            for (int i = 0; i < 3; i++) {
                String status = (nilaiMhs[i] >= 60) ? "LULUS" : "TIDAK LULUS";
                System.out.println(namaMhs[i] + " = " + status);
                if (nilaiMhs[i] >= 60) {
                    lulus++; 
                }else {
                    tidakLulus++;
                }
            }
            System.out.println("Total Lulus       : " + lulus);
            System.out.println("Total Tidak Lulus : " + tidakLulus);
        }
    }

    public static void main(String[] args) {
        String ulang = "ya";
        int pilihan = 0;

        while (ulang.equalsIgnoreCase("ya")) {
            System.out.println("   MENU UTAMA MAHASISWA");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hitung Kelulusan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    hitungKelulusan();
                    break;
                case 4:
                    System.out.println("Program selesai. Bye!");
                    ulang = "tidak"; 
                    continue; 
                default:
                    System.out.println(" Pilihan menu tidak valid!");
            }

            System.out.print("Apakah ingin mengulang program? (ya/tidak): ");
            ulang = input.next();
        }

        System.out.println("Terimakasih telah menggunakan program ini.");
    }
}