/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Oda {
    ArrayList<ISekil> elemanlar=new ArrayList();
    int getToplamAlan(){
        int toplam=0;
        for (ISekil eleman : elemanlar) {
            toplam+=eleman.getAlan();
        }
        return toplam;
    }
}
