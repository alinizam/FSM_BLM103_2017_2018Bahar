/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek1;

/**
 *
 * @author anizam
 */
public class Araba {
    static String firma;
    final static String ulke="T.C.";
    static{
        firma="Araba Üreticisi";
    }
    int sonHiz;
    static void firmaAta(String firma){
        Araba.firma=firma;
    }
    static void firmayiYazdir(){
        System.out.println(Araba.firma);
    }
    
}
