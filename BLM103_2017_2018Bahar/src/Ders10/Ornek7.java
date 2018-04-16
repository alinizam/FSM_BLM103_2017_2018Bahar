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
public class Ornek7 {
    public static void main(String[] args) {
        int maaslar[]={1000,2000,3000};
        System.out.println(topla(maaslar));
        
        System.out.println(topla(maaslar));
    }
    static int topla(int[] sayilar){
        int toplam=0;
        for (int t : sayilar) {
            toplam+=t;
        }
        return toplam;
    }
    
    static int[] toplaDiziDon(int[] sayilar){
        int toplam[]={0};
        for (int t : sayilar) {
            toplam[0]+=t;
        }
        return toplam;
    }
}
