/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek10 {

    public static void main(String[] args) {
        int sayi = 1;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print(sayi +" ");
                    sayi += 2;
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
