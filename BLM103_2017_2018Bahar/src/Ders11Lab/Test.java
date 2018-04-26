/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Ogrenci o=new Ogrenci();
        OgrenciNot fizikNot=new OgrenciNot();
        
        //FizikNot.notlar=new int[]{1,3,5};
        int not[]={65,80,95};
        fizikNot.notlar=not;
        
        o.ogrenciNotlar[0]=fizikNot;
        
        System.out.println("Fizik ortalama : "+fizikNot.getNotOrtalama());
        
        OgrenciNot matematikNot=new OgrenciNot();
        matematikNot.notlar=new int[]{70,70,85};
        o.ogrenciNotlar[1]=matematikNot;
        System.out.println("MAtematik ortalama : "+matematikNot.getNotOrtalama());
        System.out.println("Genel ortalama :"+o.getNotOrtalama());
    }
}
