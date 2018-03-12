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
public class Ornek10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5) continue;
            for (int j = 0; j < 10; j++) {
                System.out.print(i+"");
            }
            System.out.println("");
        }
    }
}
