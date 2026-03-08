/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_method3;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Method3 {

    // method ini digunakan untuk menghitung faktorial dari nilai n
    static void hitungFaktorial(int n){

        int hasil = 1; 

        for(int i = n; i >= 1; i--){
            hasil = hasil * i; 

            if(i > 1){
                System.out.print(i + "*");
            }else{
                System.out.print(i);
            }
        }

        System.out.println("=" + hasil);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n : ");
        n = input.nextInt();

        hitungFaktorial(n);
    }
}