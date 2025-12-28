
import java.util.Scanner;

public class LatihanUAS{

    public double hitungGajiKotor(int x, double y){
        return x * y;
    }

    public double potonganGajiKotor(double gajiKotor){
        return gajiKotor*0.88;
    }
    
    public double hitungGajiBersih(double a, double b, double c, double d){
        return a - b - c + d;
    }

    public void tampilkanData(double hitungGajiKotor, double potonganGajiKotor, double hitungGajiBersih){
        System.out.println("pendapatan kotor: " + hitungGajiKotor);
        System.out.println("gaji kotor setelah dipotong: " + potonganGajiKotor);
        System.out.println("biaya potongan: " + (hitungGajiKotor-potonganGajiKotor));
        System.out.println("gaji bersih: " + hitungGajiBersih);
    }


    public static void main(String[] args) {
        Scanner scen = new Scanner(System.in);
        int jumlahProject;
        double tarifProject,bonusRevisi,biayaLanggananAPK,biayaInternet;
        LatihanUAS Obj = new LatihanUAS();

        System.out.print("masukkan jumlah project: ");
        jumlahProject = scen.nextInt();
        System.out.print("masukkan tarif project: ");
        tarifProject = scen.nextDouble();
        System.out.print("masukkan biaya langganan apk: ");
        biayaLanggananAPK = scen.nextDouble();
        System.out.print("masukkan bonus revisi: ");
        bonusRevisi = scen.nextDouble();
        System.out.print("masukkan biaya internet: ");
        biayaInternet = scen.nextDouble();
        
        double gajiKotor = Obj.hitungGajiKotor(jumlahProject, tarifProject);
        double potonganGajiKotor = Obj.potonganGajiKotor(gajiKotor);
        double gajiBersih = Obj.hitungGajiBersih(potonganGajiKotor, biayaLanggananAPK, biayaInternet, bonusRevisi);

        Obj.tampilkanData(gajiKotor, potonganGajiKotor, gajiBersih);
        scen.close();
    }
}