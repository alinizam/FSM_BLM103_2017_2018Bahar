/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

/**
 *
 * @author FSMBLM1
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        System.out.println(p.getMaas());
        
        p=new Memur();
        System.out.println(p.getMaas());
        
        p=new Isci();
       
        int mesai=((Isci)p).getMesai();
        System.out.println(mesai);
        
       
    }
}
