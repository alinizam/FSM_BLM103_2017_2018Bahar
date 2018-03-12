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
public class Ornek1 {
    public static void main(String[] args) {
        int sayac=1;
        for (int i = 0; i < 6; i++) {
            for (int j = sayac; j >= sayac/2; j-=2) {
                System.out.print(j+" ");
            }
            sayac=sayac*2;
            System.out.println("");
        }
    }
}
