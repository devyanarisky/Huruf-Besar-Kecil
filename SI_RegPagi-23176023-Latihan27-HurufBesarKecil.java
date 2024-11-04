/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_27;

/**
 *
 * @author USER
 * NAMA: Devyana Risky Putri Andini
 * MATA KULIAH: PBO1
 * NIM: 23176023
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * 
 */
import java.util.Scanner;

public class Latihan_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        System.out.println("BUILD SUCCESSFUL (total time: 2 minutes)");
    }
}
