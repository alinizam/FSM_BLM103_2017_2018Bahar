/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
         int []dizi={3,6,5,8,5,9,8,7,9,5,5};
            int aranan=5;
            int dizi2[]=sayiAra(dizi,aranan);
              for (int i = 0; i < dizi2.length; i++) {
                System.out.print(" "+dizi[i]); 
        }
              System.out.println("");
              System.out.println("");
            for (int i = 0; i < dizi2.length; i++) {
                System.out.print(" "+dizi2[i]);
            
        }
    }
     static int [] sayiAra(int []dizi, int aranan){
        int []dizi2=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
           if(dizi[i]==aranan)
               dizi2[i]=1;
           else 
               dizi2[i]=0;
        }
        return dizi2;
    }
}
