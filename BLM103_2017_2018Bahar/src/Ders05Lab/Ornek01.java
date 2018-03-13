/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author anizam
 */
public class Ornek01 {
    public static void main(String[] args) {
        int sayi =14225;
        int rakam = 5;
        boolean varMi = false;
        
        while(sayi>0){
            int basamak = sayi % 10;
            sayi= sayi / 10 ;
            if(basamak == rakam)
                varMi = true ;
        }
        System.out.println(rakam+" var mi = "+varMi);
    }
}
