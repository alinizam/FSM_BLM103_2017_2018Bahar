/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        //say?n?n mutlak de?erini bulunuz ? 
        int sayi=5;
        //(e?er say? s?f?rdan küçükse) (eksiyle çarp)
        int mutlakDeger;
        mutlakDeger=(sayi<0)?(-1*sayi):sayi;
        System.out.println(mutlakDeger);
        //mutlakDeger=(sayi>=0)?(sayi):(sayi*-1);
        
        
    }
}
