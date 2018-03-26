/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

/**
 *
 * @author anizam
 */
public class Araba {
    int hiz,sonHiz=200;
    String marka,model;
    void hizlan(){
       hiz++;
    }
    void cabukHizlan(int artis){
        if (hiz+artis<sonHiz)
            hiz=hiz+artis;
        else
            System.out.println("Son h?z? geçemezsiniz.");  
    }
    void sonHizaKadarHizlan(){
        for (int i = hiz; i < sonHiz; i++) {
            hiz++;
            System.out.println("hiz : "+hiz);
        }
    
    }
    
    int hiziOku(){
        return hiz;
    }
    int neKadarHizlanabilirim(){
        return sonHiz-hiz;
    }
    
}
