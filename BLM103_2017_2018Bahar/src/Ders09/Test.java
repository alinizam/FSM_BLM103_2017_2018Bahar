/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika();
        fabrika.patron="Ahmet AK";
        Araba a=fabrika.arabaUret();
        System.out.println(a.model);
        
        /*Araba a1=new Araba();
        a1.model="3";
        a1.renk="Turkuaz";
        a1.sonHiz=240;*/
        
        Araba a1=fabrika.ozelArabaUret("7", 400, "Turkuaz");
        Araba a2=fabrika.ozelArabaUret("7", 400, "Turkuaz");
        
        System.out.println(a1.renk);
        a1=fabrika.boya(a1, "K?rm?z?");
        System.out.println(a1.renk);
    
        
        System.out.println(a2.renk);
        fabrika.boyaYap(a2, "K?rm?z?");
        System.out.println(a2.renk);
        
        fabrika.arabaninRaporunuCikar(a2);
        
        System.out.println(fabrika.ayniMi(a1, a2));
        
        Araba a3= fabrika.ozelArabaUret("7", 400, "Turkuaz");
        Araba a4= fabrika.ozelArabaUret("7", 400, "Turkuaz");
        a3.ayniMi(a1);
        System.out.println( a3.ayniMi(a1));
        System.out.println( a3.ayniMi(a4)); 
    }
}
