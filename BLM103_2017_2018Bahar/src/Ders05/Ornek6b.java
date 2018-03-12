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
public class Ornek6b {
    public static void main(String[] args) {
        int altSinir = 1, ustSinir = 150;
        int i=altSinir;
        boolean varMi=true;
        while (i >= altSinir && i < ustSinir && varMi  ) {
            if (i % 7 == 0) {
                System.out.println("Aral?kta 7'ye bölünen say? var.");
                varMi=false;
            }
            i++;
        }
    
    }
}
