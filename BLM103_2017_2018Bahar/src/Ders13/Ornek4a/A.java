/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek4a;

/**
 *
 * @author FSMBLM1
 */
public class A {
   public int a;
   private int gizli;
   protected int korunmus;
   private int kapsul;
   void birsey(){
       A a=new A();
       a.gizli=5; 
   }

    public int getKapsul() {
        return kapsul;
    }

    public void setKapsul(int kapsul) {
        this.kapsul = kapsul;
    }
}
