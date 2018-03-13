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
public class Ornek2 {
    public static void main(String[] args) {
        int sayi = 12;
        int ikilikSayi = 0;      
        int basamakSayisi = 1;
        while(sayi>0){
            int kalan = sayi % 2;
            ikilikSayi += kalan*basamakSayisi;
            sayi = sayi/2;
            basamakSayisi = basamakSayisi*10;
        }
        System.out.println(ikilikSayi);
    }
}
