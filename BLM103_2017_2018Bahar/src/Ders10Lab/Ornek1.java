/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

public class Ornek1 {
    public static void main(String[] args) {
        int []dizi={3,6,5,8,9,87,76};
        int aranan=5;
        boolean sign=false;
        for (int i = 0; i < dizi.length; i++) {
            if(aranan==dizi[i])
            {
                sign=true;
                break;
            }
        }
        if(sign)
            System.out.println("say? bulunmustur");
        else
            System.out.println("say? bulunamam?st?r");
    }
  
}
