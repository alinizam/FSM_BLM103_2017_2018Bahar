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
public class Ornek5 {
    public static void main(String[] args) {
        int n=1;
        int faktoriyel = 1;
        while(faktoriyel*n<3000 && n<100){
            faktoriyel*=n;
            n++;
        }
        System.out.println("Faktoriyel = "+ faktoriyel);
        System.out.println(n+". ad?m 3000'den önceki son ad?md?r");
    }
}
