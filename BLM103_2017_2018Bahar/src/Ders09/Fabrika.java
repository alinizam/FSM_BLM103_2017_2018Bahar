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
public class Fabrika {
   String patron;
   //Nesne �reten-d�nd�ren metot �rne?i
   Araba arabaUret(){
     /*Araba araba=new Araba();
       return araba;*/
       return new Araba();
   } 
   //Nesne �reten ve �zellik atayan metot �rne?i
   Araba ozelArabaUret(String model,int sonHiz, String renk ){
       Araba ozel=new Araba();
       ozel.model=model;
       ozel.sonHiz=sonHiz;
       ozel.renk=renk;
       return ozel;
   } 
   //nesne de?i?tiren d�nd�ren metot
   Araba boya(Araba boyanacakAraba, String renk){
       boyanacakAraba.renk=renk;
       return boyanacakAraba;
   }
   //nesne de?i?tiren metot
   void boyaYap(Araba boyanacakAraba, String renk){
       boyanacakAraba.renk=renk;
   }
   
   void arabaninRaporunuCikar(Araba araba){
       System.out.println("Modeli: " +araba.model+" Rengi: "+araba.renk + " H?z: " +araba.sonHiz);
   }
   
   boolean ayniMi(Araba araba1, Araba araba2){
       return (araba1.model==araba2.model 
               && araba1.sonHiz==araba2.sonHiz
               && araba1.renk==araba2.renk);
   }
   
}
