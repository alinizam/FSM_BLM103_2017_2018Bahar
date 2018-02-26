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
public class Ornek7 {

    public static void main(String[] args) {
        int a = 12, b = 6;   //12  1100, 6  110
        int sonuc = a & b;
        
        //1100
        //0110
        //0100
        System.out.println("Bitwise AND sonuç= " + sonuc);
        
        sonuc=a | b;
        System.out.println("Bitwise OR sonuç= " + sonuc);
    }
}
