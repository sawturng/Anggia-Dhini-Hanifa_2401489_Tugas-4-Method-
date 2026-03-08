/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_method1;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Method1 {

    // method ini digunakan untuk menghitung jumlah deret dari 1 sampai n
    static void hitungDeret(int n){
        int jumlah = 0; 

        // perulangan dari angka 1 sampai n
        for(int i = 1; i <= n; i++){
            jumlah = jumlah + i; 

            if(i < n){
                System.out.print(i + "+");
            }else{
                System.out.print(i);
            }
        }

        System.out.println("=" + jumlah);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        int n; 

        System.out.print("Masukkan nilai N : ");
        n = input.nextInt();

        hitungDeret(n);
    }
}