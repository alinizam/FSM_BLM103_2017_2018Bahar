/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        System.out.println(topla());
        System.out.println(topla(1));
        System.out.println(topla(1,3,9,8,3));
        System.out.println(topla(new int[]{1,3,6}));
    }
    
    static int topla(int... sayilar){
        int toplam=0;
        for (int t : sayilar) {
            toplam+=t;
        }
        return toplam;
    }
    
    static int carp(String s,double d,int ... sayilar){
        int toplam=0;
        for (int t : sayilar) {
            toplam+=t;
        }
        return toplam;
    }
}
