/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek10 {
     public static void main(String[] args) {
        //-1 girene kadar klavyeden al?nan say?lar? toplat?n?z.
        Scanner s=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do {
            toplam += sayi;
            System.out.println("Lütfen bir say? giriniz.");
            sayi=s.nextInt();
        }while(sayi!=-1);
        System.out.println("Toplam = "+toplam);
    }
}
