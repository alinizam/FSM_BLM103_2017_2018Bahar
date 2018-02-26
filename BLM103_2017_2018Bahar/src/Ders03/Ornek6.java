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
public class Ornek6 {
    public static void main(String[] args) {
        int maas;   
        char personelTuru;  //'M' veya 'I'
        
        //Maa?? 3000'den fazla ve memursa %10
        //Maa?? 3000'den fazla ve i?çiyse %5 zam miktar?n? bulunuz.
        maas=4000;
        personelTuru='M';
        
        double zam=(maas>3000 && personelTuru=='M')? maas*(0.10):0;
        zam=(maas>3000 && personelTuru=='I')? maas*(0.05):zam;
        
        System.out.println("Zam miktar? = "+zam);
    }
}
