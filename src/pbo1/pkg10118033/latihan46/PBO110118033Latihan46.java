
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan umur.
 *  
 */

package pbo1.pkg10118033.latihan46;

import java.util.Scanner;

public class PBO110118033Latihan46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir anda : ");
        Age age1 = new Age(sc.nextInt());
        age1.setYearBirth(2019);
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+age1.getYearNow());
        System.out.println("Hari ini tahun   : "+age1.getYearBirth());
        System.out.println("Umur kamu sampai hari ini adalah "+age1.hitungUmur()+" tahun");
        System.out.print("Tandanya kamu : ");
        System.out.print(age1.tandanyaKamu(age1.hitungUmur()));
    }
}