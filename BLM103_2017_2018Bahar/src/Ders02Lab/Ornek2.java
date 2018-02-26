/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        double a = 5.10;
        double b = 6.32;
        double kusuratA= a - (int)a;
        double kusuratB= b - (int)b;
        boolean buyukMu=(kusuratA>kusuratB);
        System.out.println("?lk Say?n?n Küsürat? Büyükmü = "+buyukMu);
    }
}
