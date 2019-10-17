package if1.pkg10118006.latihan35.objectoriented.programtunjangan;

import java.util.Scanner;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class IF110118006Latihan35ObjectOrientedProgramTunjangan {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);
    }
    
}
