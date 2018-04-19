/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class Ornek3_b {
    public static void main(String[] args) {
        int [][]dizi={{4,5,7},{6,4,6,8},{6,0,9}};
        int aranan=9;
        boolean sign=sayiBul( dizi, aranan);
        if(sign)
            System.out.println("sayi bulunmustur");
        else 
            System.out.println("sayi bulunamamistir");
    }
   static boolean sayiBul(int [][]dizi,int aranan){
        boolean sign=false;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if(aranan==dizi[i][j]){
                    sign=true; 
                    break;
                }     
            }
        }
        return sign;
   }
}
