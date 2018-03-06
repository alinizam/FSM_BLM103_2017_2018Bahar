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
public class Ornek2 {
    public static void main(String[] args) {
        int n=0;
        int f=1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println(n+" faktöriyel = "+f);
    }
}
