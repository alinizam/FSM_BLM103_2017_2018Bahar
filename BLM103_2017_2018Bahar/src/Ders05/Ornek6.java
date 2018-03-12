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
public class Ornek6 {

    //Aral?kta 7'ye bölünen say? var ? ?

    public static void main(String[] args) {
        int altSinir = 1, ustSinir = 150;
        for (int i = altSinir; i < ustSinir; i++) {
            if (i % 7 == 0) {
                System.out.println("Aral?kta 7'ye bölünen say? var.");
                break;
            }
        }
    }
}
