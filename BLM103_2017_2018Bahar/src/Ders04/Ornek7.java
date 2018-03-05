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
public class Ornek7 {

    public static void main(String[] args) {
        int altSinir = 25, ustSinir = 36;
        int sayi = 75;
        boolean varMi = false;
        int i = altSinir;
        while (i <= ustSinir) {
            if (i % sayi == 0) {
                varMi = true;
            } else {
                varMi = false;
            }
            i++;
        }
        System.out.println("VErilen aral?kta " + sayi + "'e bölünen sayi var = " + varMi);
    }

}
