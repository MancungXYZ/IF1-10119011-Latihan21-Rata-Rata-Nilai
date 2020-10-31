/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan21.rata2nilai;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan21Rata2Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int JumlahMahasiswa;
        double RataNilai;
        double NilaiMahasiswa = 0;
        double JumlahNilai = 0;
        int i = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa : ");
        JumlahMahasiswa = (int) sc.nextInt();
        
        while (i <= JumlahMahasiswa) {
            System.out.print("Nilai mahasiswa ke-" + i + " : ");
            i++;
            
            NilaiMahasiswa = sc.nextDouble();
            JumlahNilai = JumlahNilai + NilaiMahasiswa;
        }
        RataNilai = JumlahNilai / JumlahMahasiswa;
        System.out.println("Maka, Rata-rata nilainya adalah : " + RataNilai);
        
        
        
        
    }
    
}
