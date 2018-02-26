/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek3 {

    public static void main(String[] args) {
       
        System.out.println((3 > 2 ? 5 : 6));
        //iki say?dan büyük olan? bulunuz.
        int a = 10, b = 5;
        int buyukSayi;

        buyukSayi = (a > b) ? a : b;
        System.out.println("Büyük sayi = " + buyukSayi);
        
        //Büyük say?y? tutan de?i?kenini ad?n? bulunuz
        char degiskenAdi;
        
        degiskenAdi=(a>b)?'a':'b';
        System.out.println(degiskenAdi);
        

    }
}
