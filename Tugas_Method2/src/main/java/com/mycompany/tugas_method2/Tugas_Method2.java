/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_method2;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Method2 {

    // method ini digunakan untuk mencari dan menghitung bilangan ganjil dari batas awal hingga akhir
    static void hitungGanjil(int awal, int akhir){

        int jumlah = 0;

        for(int i = awal; i <= akhir; i++){

            if(i % 2 != 0){
                System.out.print(i + " ");
                jumlah++; 
            }
        }

        System.out.println();
        System.out.println("Jumlah bilangan ganjil = " + jumlah);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        int batasAwal; 
        int batasAkhir; 

        System.out.print("Masukkan batas awal : ");
        batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir : ");
        batasAkhir = input.nextInt();

        System.out.print("Bilangan ganjil : ");
        hitungGanjil(batasAwal, batasAkhir);
    }
}