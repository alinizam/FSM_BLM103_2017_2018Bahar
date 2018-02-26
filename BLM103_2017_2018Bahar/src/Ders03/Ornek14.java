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
public class Ornek14 {
    public static void main(String[] args) {
        //Mutlak de?eri bulan program? yaz?n?z.
        int a = -5;
        boolean sifirdanKucukMu=(a<0);
        if (sifirdanKucukMu) {
            a = a * (-1);
            System.out.println("if'in içi çal??t?.");
        }
        System.out.println(a);
    }
}
