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
public class Ornek5 {
    public static void main(String[] args) {
        double sayi = 167.55;
        int ikinciSayi = (int)(sayi*100);
        double kusurat = sayi-(int)sayi;
        System.out.println(kusurat);
        boolean bolunuyorMu = (ikinciSayi%2)==0;
        System.out.println(bolunuyorMu);
    }
}
