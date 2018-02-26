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
public class Ornek6 {
    public static void main(String[] args) {
        int sayi = 0xB;
        
        int kalan1=sayi%2;
        int bolum1=sayi/2;
        int kalan2=bolum1%2;
        int bolum2=bolum1/2;
        int kalan3=bolum2%2;
        int bolum3=bolum2/2;
        
                
        int binarySayi = (bolum3*1000)+(kalan3*100)+(kalan2*10)+(kalan1);
        System.out.println(binarySayi);
        
    }
}
