package if1.pkg10118006.latihan35.objectoriented.programtunjangan;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class Karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;

    public double HitungTunjangan(String parStatus, double parGajiPokok){
    return tunjangan=(parStatus.equals("Menikah")?0.35*parGajiPokok:0); }

    public double HitungTotalGaji(double parGajiPokok, double parTunjangan){
    return tunjangan = parGajiPokok+parTunjangan;}

    public void HasilHitung(String parStatus, double parGajipokok){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t: Rp "+gajiPokok);
        System.out.println("Tunjangan \t: Rp "+HitungTunjangan(parStatus,parGajipokok));
        System.out.println("Total Gaji \t: Rp "+HitungTotalGaji(parGajipokok,tunjangan));
    }
    
}
