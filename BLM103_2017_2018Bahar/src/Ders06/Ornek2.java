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
public class Ornek2 {
    public static void main(String[] args) {
        //Kullan?c?dan 3 sayi al;
        int a=3,b=5,c=9;
        //iki say?y? kar??la?t?r, büyü?ü sakla
        int enBuyuk=(a>b)?a:b;
        //büyükle 3. say?s? kar??la?t?r, büyü?ü sakla
        enBuyuk=(enBuyuk>c)?enBuyuk:c;
        System.out.println("enBuyuk = "+ enBuyuk);
        
    }
}
