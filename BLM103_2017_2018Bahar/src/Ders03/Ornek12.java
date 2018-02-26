/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek12 {

    public static void main(String[] args) {
        int a = 2, b = 18, c = 6;
        boolean maasKucukMu=(a < (b + c));
        boolean zamGerekliMi=(a < (b / c));
        int zamMiktar=(a + b) / (c + a);
        int y = (maasKucukMu && zamGerekliMi)  ? zamMiktar : 0;
        System.out.println(y);
    }
}
