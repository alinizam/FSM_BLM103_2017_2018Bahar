/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek14 {

    public static void main(String[] args) {
        int sayi = 10;
        boolean asalMi = true;
        for (int i = 2; i < sayi / 2; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        System.out.println("Asal m?? " + asalMi);
    }
}
