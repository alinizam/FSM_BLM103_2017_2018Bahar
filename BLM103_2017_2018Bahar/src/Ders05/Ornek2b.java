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
public class Ornek2b {

    public static void main(String[] args) {
        int n1 = 36, n2 = 21;
        int bolen1 = 1, bolen2 = 1;
        for (int i = 1; i <= n1 / 2 || i <= n2 / 2 ; i++) {
            if (n1 % i == 0 || n2 % i==0) {
                bolen1 = i;
            }
        }
        System.out.println("En büyük bölen = " + ((bolen1 > bolen2) ? bolen1 : bolen2));
    }
}
