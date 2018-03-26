/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek5;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba();
        a.setHiz(10);
        System.out.println(a.anlikHiz);
        
        int artis=50;
        a.setAtris(artis);
        System.out.println(artis);
        
        Araba a1=new Araba();
        a1.model="3";
        
        Fabrika f=new Fabrika();
        f.modeliMSerisiYap(a1);
        System.out.println(a1.model);
        
        int i=a.getHiz();
        
    }
}
