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
public class Ornek6 {

    public static void main(String[] args) {
        int n = 100;
        int toplam = 0;
        while (toplam + n < 3000 && n < 200) {
            toplam += n;
            n += 2;
        }
        System.out.println("Toplam = " + toplam);
        System.out.println((n-100) + ". ad?mda 3000'i gecmistir.");
    }
}
