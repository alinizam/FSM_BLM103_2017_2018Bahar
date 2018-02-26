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
public class Ornek19 {

    public static void main(String[] args) {
        int sayi = -5;
        if (sayi > 0 && sayi <= 5 ) {
            System.out.println("Küçük");
        } else if (sayi > 5 && sayi <= 10) {
            System.out.println("Büyük");
        }else if (sayi > 7 && sayi <= 100) {
            System.out.println("Çok Büyük");
        }else{
            System.out.println("Say? hatal?");
        }


    }
}
