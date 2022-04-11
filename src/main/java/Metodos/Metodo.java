/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author USER
 */
public class Metodo {
    
    public void Escribir(String Archivo) {
         
            File f;
            FileWriter w;
            BufferedWriter bw;
            PrintWriter wr;
            
            
            try{
                f= new File(Archivo);
                w= new FileWriter(f);
                bw = new BufferedWriter(w);
                wr = new PrintWriter(bw);
                
                
            } catch(Exception e){
                
                System.out.println("ha sucedido un error "+e);
                
            }
            
    }
    
}
