/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author anizam
 */
public class Ornek2b {
    public static void main(String[] args) {
        int sayi = 12;
        String ikilikSayi = "";
        while(sayi>0){
            int kalan = sayi % 2 ;
            sayi = sayi/2;
            ikilikSayi =  kalan + ikilikSayi ;
        }
        System.out.println(ikilikSayi);
    }
}
