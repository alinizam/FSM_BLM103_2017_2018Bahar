/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Saat {
    int saat;
    int dakika;
    int saniye;
    public Saat(int saat,int dakika,int saniye){
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }
    public Saat(){
        
    }
    public void saatArttir(){
        saat++;
        if(saat == 24)
            saat = 0;
    }
    public void dakikaArttir(){
        dakika++;
        if(dakika == 60){
            dakika = 0;
            saatArttir();
        }
    }
    public void saniyeArttir(){
        saniye++;
        if(saniye == 60){
            saniye = 0;
            dakikaArttir();
        }
    }
    public void saatKac(){
        System.out.println("Saat = "+saat+"."+dakika+"."+saniye);
    }
    
}
