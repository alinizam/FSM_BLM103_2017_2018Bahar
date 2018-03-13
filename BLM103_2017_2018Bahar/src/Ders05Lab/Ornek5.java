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
public class Ornek5 {
    public static void main(String[] args) {
        int sayac = 1 ;
        int toplam = 0 ;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i%2 == 0){
                    System.out.print(sayac + " ");
                    toplam += sayac;
                    sayac++;
                }else{
                    System.out.print(toplam + " ");
                }
            }
            if (i % 2 == 1)
                toplam = 0;
            System.out.println("");
        }
        
        
    }
}
