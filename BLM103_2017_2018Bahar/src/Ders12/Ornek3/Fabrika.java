/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Fabrika {
    ArrayList<Personel> calisanlar=new ArrayList();
    int getToplamMaas(){
        int toplamMaas=0;
        for (Personel personel : calisanlar) {
            toplamMaas+=personel.maas;
        }
        return toplamMaas;
    }
    
    void yeniElemanAl(Personel p){
        calisanlar.add(p);
    }
}
