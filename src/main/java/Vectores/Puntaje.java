package vectores;

import java.util.Scanner;


/**
 *
 * @author Andres Lopez
 */
public class Puntaje {
    
    private Scanner teclado = new Scanner(System.in);
    int [] Vector = new int [2];
    int pre = 0;
    
    public void Respuesta()
    {
        Vector[1] = Vector[1]+500;
        System.out.print("Respues correcta! Ganas $500, tu premio actual es:"+"$"+Vector[1]+"Dolares");
        
    }
    
    public void Premio(){

        System.out.print(Vector[1]);
        
    }
    
 
    
  
}