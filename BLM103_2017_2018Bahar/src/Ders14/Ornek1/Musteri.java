/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Musteri {
    int musteriId;
    ArrayList<Siparis> siparisler=new ArrayList();
    int getSiparisTutar(){
        int toplam=0;
        for (Siparis siparis : siparisler) {
            toplam+=siparis.tutar;
        }
        return toplam;
    }
    
    int getOzelSiparisTutar(){
        int toplam=0;
        for (Siparis siparis : siparisler) {
           if (siparis instanceof OzelSiparis){
                   toplam+=siparis.tutar;
           }
        }
        return toplam;
    }
    
    boolean tumuOdendiMi(){
        boolean odemeVar=true;
        for (Siparis siparis : siparisler) {
            int odemeToplam=0;
            for (Odeme odeme : siparis.odemeler) {
                odemeToplam+=odeme.tutar;
            }
            if (odemeToplam<siparis.tutar){
                odemeVar=false;
                break;
            }
        }
        return odemeVar;
    }
    
}
