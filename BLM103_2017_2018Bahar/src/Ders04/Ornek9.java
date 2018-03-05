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
public class Ornek9 {
    public static void main(String[] args) {
        //-1 girene kadar klavyeden al?nan say?lar? toplat?n?z.
        Scanner s=new Scanner(System.in);
        System.out.println("Bir say? giriniz.");
        int sayi=s.nextInt();
        int toplam=0;
        while(sayi!=-1){
            toplam+=sayi;
            System.out.println("Bir say? daha giriniz.");
            sayi=s.nextInt();
        }
        System.out.println("Toplam = "+toplam);
    }
}
