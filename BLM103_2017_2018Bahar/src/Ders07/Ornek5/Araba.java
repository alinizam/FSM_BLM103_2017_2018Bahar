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
public class Araba {
    int anlikHiz, sonHiz;
    String model;
    void setHiz(int anlikHiz){
        this.anlikHiz=anlikHiz;
    }
    
    void setAtris(int artis){
        this.anlikHiz=anlikHiz+artis;
        artis=0;
    }
    int getHiz(){
        return anlikHiz;
    }
}
