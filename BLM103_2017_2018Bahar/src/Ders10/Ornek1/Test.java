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
public class Test {
    public static void main(String[] args) {
        Araba.firma="Mercedes";
        Araba a=new Araba();
        a.firmayiYazdir();
          
        a.firmaAta("Ferrari");
        //Araba.firmaAta("Ferrari");
        System.out.println(Araba.firma);
        System.out.println(a.firma);
    } 
}
