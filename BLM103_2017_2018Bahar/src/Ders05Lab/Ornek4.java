/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        //System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 6; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < 6; j++) {
                if (i == 0) {
                    System.out.print(j+" ");
                } else {
                    System.out.print(i * j + " ");
                }

            }
            System.out.println("");
        }
    }
}
