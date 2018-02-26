/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        int sayi = 315;
        int birlerBasamagi = sayi%10;
        int bolum = birlerBasamagi/5;
        int yuvarlanmisSayi = (sayi-birlerBasamagi)+(bolum*10);
        System.out.println("Yuvarlanm?? Say? = "+yuvarlanmisSayi);
    }
}
