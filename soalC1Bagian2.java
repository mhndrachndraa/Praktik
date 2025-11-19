
import java.util.Scanner;

public class soalC1Bagian2 {

    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        double gajiPokok = 0;
        double tMakan = 0;
        double tTransport = 0;
        double potBulanan = 0;
        double potTahunan = 0;
        double gajiBersihBulanan = 0;
        boolean validInput = false;
        boolean ulang = true;

        while (ulang) {
            System.out.println("==MENU YANG TERSEDIA==");
            System.out.println("1. Gaji Per-Bulan");
            System.out.println("2. Gaji Per-Tahun");
            System.out.println("3. Total Potongan Kesehatan");
            System.out.println("4. Keluar Dari Menu");
            System.out.print("pilih menu (1-4): ");
            int menu = ns.nextInt();

            switch (menu) {

                case 1:
                    System.out.print("Masukan Gaji Pokok = ");
                    gajiPokok = ns.nextDouble();

                    System.out.print("Masukan Tunjangan Makan = ");
                    tMakan = ns.nextDouble();

                    System.out.print("Masukan Tunjangan Transport = ");
                    tTransport = ns.nextDouble();

                    double potongan = gajiPokok * 0.1;
                    gajiBersihBulanan = (gajiPokok + tMakan + tTransport) - potongan;

                    System.out.println("Hasil Gaji Perbulan: ");
                    System.out.println("Gaji Bersih Perbulan = " + gajiBersihBulanan);

                    if (gajiBersihBulanan > 10000000) {
                        System.out.println("Pendapatan Tinggi");
                    } else if (gajiBersihBulanan >= 1000000 && gajiBersihBulanan <= 5000000) {
                        System.out.println("Pendapatan Sedang");
                    } else {
                        System.out.println("Pendapatan Kecil");
                    }

                    validInput = true;
                    break;
                case 2:
                    if (validInput) {
                        System.out.println("DATA GAJI BULANAN BELUM TERSEDIA");
                    } else {
                        double gajiTahun = gajiBersihBulanan * 12;
                        System.out.println("Gaji Pertahun Anda = " + gajiTahun);

                        if (gajiBersihBulanan > 10000000) {
                            System.out.println("Pendapatan Tinggi");
                        } else if (gajiBersihBulanan >= 5000000 && gajiBersihBulanan <= 10000000) {
                            System.out.println("Pendapatan Sedang");
                        } else {
                            System.out.println("Pendapatan Kecil");
                        }
                    }
                    break;
                case 3:
                    if (validInput) {
                        potBulanan = gajiPokok * 0.1;
                        potTahunan = potBulanan * 12;
                        System.out.println("Total Potongan Kesehatan Setahun = " + potTahunan);
                    } else {
                        System.out.println("DATA GAJI BULANAN BELUM TERSEDIA");
                    }
                    break;
                case 4:
                    System.out.println("Anda Keluar Dari Program");
                    ulang = false;
                    continue;

                default:
                    System.out.println("Menu tidak tersedia.");

            }
                    System.out.print("Kembali ke Menu Utama? (Yes/No): ");
            String jawab = ns.next();

            if (jawab.equalsIgnoreCase("Yes")) {
                ulang = true;
            } else {
                ulang = false;
                System.out.println("Program Selesai.");
            }

            System.out.println();

        }
        ns.close();

    }
}
