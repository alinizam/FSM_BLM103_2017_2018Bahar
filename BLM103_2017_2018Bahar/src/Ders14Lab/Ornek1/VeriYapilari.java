/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class VeriYapilari extends OgrenciDers{
    int notlar[] = new int[3];

    public VeriYapilari(int[] notlar) {
        super(notlar);
    }
    public int getNotOrtalama() {
        int toplam = 0;
        for (int o : notlar) {
            toplam += o;
        }
        return (toplam) / (notlar.length);
    }
   
    public String getHarfNot(NotSistemi sistem) {
       String harfNot="";
       if (sistem.yuzluk==true && getNotOrtalama()>90){
           harfNot="AA";
       }else{
           harfNot="XX";
       }
       return harfNot;    
    }
    
}
