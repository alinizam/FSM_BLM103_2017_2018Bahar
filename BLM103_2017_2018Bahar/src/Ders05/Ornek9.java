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
public class Ornek9 {

    public static void main(String[] args) {
        //verilen bir aral?kta asal olan say? var m?
        int sayi = 15645;
        int altSinir = 8, ustSinir = 150;
       
        for (int i = altSinir; i < ustSinir; i++) {
            boolean asalMi = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false;
                }
            }
            if (asalMi == true) {
                System.out.println("asal say? var : "+i);
                break;
            }

        }

       
    }
}
