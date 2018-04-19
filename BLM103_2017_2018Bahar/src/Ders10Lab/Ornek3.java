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
public class Ornek3 {
    public static void main(String[] args) {
        int [][]dizi={{4,5,7},{6,4,6,8}};
        int aranan=9;
         boolean sign=false;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if(aranan==dizi[i][j]){
                    sign=true; 
                    break;
                }     
            }
        }
        if(sign)
            System.out.println("sayi bulunmustur");
        else 
            System.out.println("sayi bulunamamistir");
    }
}
