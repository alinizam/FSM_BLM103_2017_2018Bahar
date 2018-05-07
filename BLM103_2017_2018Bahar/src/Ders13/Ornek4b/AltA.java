/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek4b;

import Ders13.Ornek4a.A;

 

/**
 *
 * @author FSMBLM1
 */
public class AltA extends A{
     void getA(){
        A aInstance=new A();
        aInstance.a=5;
        super.korunmus=6;
    }
}
