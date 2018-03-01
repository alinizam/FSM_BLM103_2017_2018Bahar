/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        int girilenSayi = 10;
        int bolunmeSayisi = 0;
        if (girilenSayi % 2 == 0) {
            bolunmeSayisi++;
            girilenSayi = girilenSayi/2;
            if(girilenSayi % 2 == 0){
                bolunmeSayisi++;
                girilenSayi = girilenSayi / 2;
                if (girilenSayi%2 == 0) {
                    bolunmeSayisi++;
                }
            }
        }
        System.out.println(bolunmeSayisi+" kere 2 ye bölünür.");
    }
}
