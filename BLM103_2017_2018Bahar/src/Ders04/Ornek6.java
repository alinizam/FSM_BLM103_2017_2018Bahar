/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        //10 ile 30 aras?nda 7'ye bölünen say?lar?n toplam?n? bulunuz.
        int altSinir=10,ustSinir=30;
        int i=altSinir;
        int toplam=0;
        while(i<ustSinir){
            if (i%7==0){
                toplam+=i;
            }
            i++;
        }
        System.out.println("Toplam : "+toplam);
    }
}
