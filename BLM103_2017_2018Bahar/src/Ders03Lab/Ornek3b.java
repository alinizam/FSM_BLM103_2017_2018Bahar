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
public class Ornek3b {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 2;
        int enBuyukSayi;
        if (a > b) {
            enBuyukSayi = a;
        }else{
            enBuyukSayi = b;
        }
        if(c > enBuyukSayi){
            enBuyukSayi = c;
        }
        System.out.println("En Büyük Sayi = "+enBuyukSayi);
    }
}
