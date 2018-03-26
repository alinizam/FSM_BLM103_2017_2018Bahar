/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; (i < n/2 && j <= i) || (i >= n/2 && j < (n - i)); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
