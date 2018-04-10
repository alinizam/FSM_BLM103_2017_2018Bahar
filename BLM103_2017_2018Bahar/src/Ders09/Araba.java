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
public class Araba {
    String model;
    int sonHiz;
    String renk;
    boolean ayniMi(Araba digerAraba){
        return (this.model==digerAraba.model 
               && this.sonHiz==digerAraba.sonHiz
               && this.renk==digerAraba.renk);
   }
    
}
