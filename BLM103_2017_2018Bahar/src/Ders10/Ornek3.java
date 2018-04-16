/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        int maaslar[]={1000,500,600,400,500};
        for (int i = 0; i < maaslar.length; i++) {
            System.out.println(maaslar[i]);
        }
        System.out.println("------------------------");
        for(int maas:maaslar){
           System.out.println(maas);
        }
        
    }
}
