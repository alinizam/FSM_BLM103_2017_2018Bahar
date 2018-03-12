/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        //verilen bir aral?kta asal olmayan say? var m?
        int sayi = 15645;
        int altSinir = 1, ustSinir = 150;
        boolean asalMi = true;
        disDongu:
        for (int i = altSinir; i < ustSinir; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break disDongu;
                }
            }
        }

        System.out.println("asal mi = " + asalMi);

    }
}
