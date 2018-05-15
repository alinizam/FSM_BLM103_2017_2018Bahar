/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek8;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Fatura f1=new Fatura();
        f1.tutar=1500;
        ArrayList<Malzeme> mallar=new ArrayList<>();
        mallar.add(new Malzeme("Kalem",10));
        f1.setMalzeme(mallar);
        IFatura musteriIslem =f1;
        String musteriler[]={"Ahmet","Mehmet"};
        musteriIslem.yaz (musteriler);       
    
        IHareket malzemeIslem=f1;
        malzemeIslem.add(new Malzeme());
        

    }
}
