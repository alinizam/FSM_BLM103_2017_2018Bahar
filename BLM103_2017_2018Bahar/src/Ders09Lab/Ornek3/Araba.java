/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek3;

/**
 *
 * @author anizam
 */
public class Araba {

    String plaka;
    Personel sofor;
    boolean atamaYapilmis = false;

    void soforAta(Personel sofor) {
        //if (sofor==null) 
        if (!atamaYapilmis) {
            this.sofor = sofor;
            atamaYapilmis=true;
        }else{
        
            System.out.println("Sofor var.");
        }
            
    }
    void soforDegistir(Personel yeniSofor){
        if (yeniSofor.adi==this.sofor.adi && yeniSofor.soyadi==this.sofor.soyadi)
            System.out.println("Ayn? ?öför tekrar atanamaz.");
        else
            this.sofor=yeniSofor;
    }
    
}
