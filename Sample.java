import java.util.Scanner; 

public class Sample {
    
    public static void main(String[] args) {
        
        System.out.println("===== SELAMAT DATANG DI GOJEK (KW) =====");
        System.out.println("Program simulasi sederhana dimulai...");

       
        String driverNama = "Budi Santoso";
        String driverPlat = "L 1234 AB";
        boolean driverIsAvailable = true;

        String penumpangNama = "Andi";
        String penumpangLokasi = "Rumah (Jl. Mawar)";

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- STATUS SAAT INI ---");
        System.out.println("Driver: " + driverNama);
        System.out.println("Status Driver: " + (driverIsAvailable ? "Available (Nganggur)" : "Sibuk"));
        System.out.println("Penumpang: " + penumpangNama + " di " + penumpangLokasi);

       
        System.out.println("\n--- SIMULASI ORDER ---");
        System.out.println(penumpangNama + " ingin memesan GoRide.");
        
       
        System.out.print("Masukkan tujuan (cth: Kantor): ");
        String penumpangTujuan = input.nextLine();

        System.out.println("Mencari driver...");
        
        if (driverIsAvailable) {
           
            System.out.println("DRIVER DITEMUKAN!");
            System.out.println("Driver " + driverNama + " (Plat: " + driverPlat + ") akan menjemput Anda.");
            
            System.out.println(driverNama + " sedang dalam perjalanan ke " + penumpangTujuan + "...");
            
            driverIsAvailable = false; 
    
            System.out.println("...Perjalanan Selesai!");
            System.out.println(penumpangNama + " telah tiba di " + penumpangTujuan + ".");
            
            driverIsAvailable = true;
            
        } else {
            System.out.println("MAAF! Driver " + driverNama + " sedang sibuk.");
            System.out.println("Silakan cari driver lain.");
        }

        System.out.println("\n--- STATUS AKHIR ---");
        System.out.println("Driver: " + driverNama);
        System.out.println("Status Driver: " + (driverIsAvailable ? "Available (Nganggur)" : "Sibuk"));

        System.out.println("\n===== SIMULASI SELESAI =====");
        
        // Tutup scanner
        input.close();
    }
}