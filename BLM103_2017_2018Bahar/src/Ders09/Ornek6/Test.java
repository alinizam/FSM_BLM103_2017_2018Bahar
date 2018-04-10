/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek6;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Araba a=new Araba();
        //Çe?itli i?lemler
        FileWriter f=new FileWriter("c:\\dosyalar\\Merhaba.txt");
        f.write('A');
        f.close();
        
    }
}
