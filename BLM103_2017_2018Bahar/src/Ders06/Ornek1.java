/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        //S?n?rlar için iki tane de?i?ken tan?mla
        int altASCII=60,ustASCII=120;
        int verilenChar='a';
        boolean sonuc=false;
        //Alt s?n?rdan üst s?n?ra kadar dön
        //Döngü ba??:
        for (int i = altASCII; i < ustASCII; i++) {
            //döngü indisi ile bir karakter olu?tur.
            char c=(char)i;
            //VerilenKarakterle olu?turulan karakteri kar??la?t?r.
            if (c==verilenChar){
            //Ayn? ise sonucu true yap ve ç?k
                sonuc=true;
                break;
            }
        //Döngü sonu:
        }
        System.out.println("Arada "+(char)verilenChar+" karakter var mi? = " +sonuc);
    }
    
    //Sadece taslak kod
    //S?n?rlar için iki tane de?i?ken tan?mla
    //Alt s?n?rdan üst s?n?ra kadar dön
    //Döngü ba??: 
        //Ayn? ise sonucu true yap ve ç?k 
    //Döngü sonu:
}
