/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan21.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 021
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan21ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyaknyaMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        banyaknyaMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyaknyaMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyaknyaMahasiswa;
        
        // Output rata-rata
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : Affa Muntazah");
    }
}