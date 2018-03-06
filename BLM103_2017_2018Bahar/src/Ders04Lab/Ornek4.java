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
public class Ornek4 {
    public static void main(String[] args) {
        
        int n=0;
        int toplam = 0;
        while(toplam+n<3000 && n<100){
            toplam+=n;
            n++;
        }
        System.out.println("Toplam = "+ toplam);
        System.out.println(n+". ad?mda 3000'i gecmistir.");
    }
}
