/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01_Lab;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        int x=748,birler,onlar,yuzler,tersSayi;
        
        birler=(x%10);
        onlar=(x/10)%10;
        yuzler=(x/100);
        
        tersSayi=(birler*100)+(onlar*10)+yuzler;
        System.out.println(tersSayi);
    }
}
