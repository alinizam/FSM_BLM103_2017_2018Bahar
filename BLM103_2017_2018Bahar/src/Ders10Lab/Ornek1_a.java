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
public class Ornek1_a {
    public static void main(String[] args) {
         int []dizi={3,6,5,8,9,87,76};
        int aranan=50;
        boolean sign=false;
        sign=sayiAra(dizi,aranan);
        if(sign)
            System.out.println("sayi bulunmustur");
        else
            System.out.println("sayi bulunamamistir");
    }
    static boolean sayiAra(int []dizi, int aranan){
        boolean sign=false;
        for (int i = 0; i < dizi.length; i++) {
            if(aranan==dizi[i])
            {
                sign=true;
                break;
            }
        }
        return sign;
    }
}
