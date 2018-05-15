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
public class OgrenciDers implements IDers{
    int notlar[]=new int[3];

    public OgrenciDers(int notlar[]) {
        this.notlar=notlar;
    }
    
    
    
    public String getHarfNot() {
        return "";
    }

    
   public int getNotOrtalama() {
        int toplam = 0;
        for (int o : notlar) {
            toplam += o;
        }
        return (toplam) / (notlar.length);
    }

    @Override
    public int getNotOrtalama(NotSistemi sistem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
