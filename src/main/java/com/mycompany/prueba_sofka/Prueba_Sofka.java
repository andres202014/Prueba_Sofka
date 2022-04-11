
package com.mycompany.prueba_sofka;


import java.util.Scanner;
import vectores.Puntaje;
import Metodos.Metodo;
/**
 *
 * @author Andres Lopez
 */
public class Prueba_Sofka {

    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
   String nombre = "";
   int premio = 0;
    /**************************************************************************/
    /*********************          MENU PRINCIPAL      ***********************/
    /**************************************************************************/
    /**
     * Contrusctor de la clase Proyecto_Sofka
     */
    public Prueba_Sofka() {
        
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                   MENU PRINCIPAL                 |");
        System.out.println("|               PRUEBA TECNICA SOFKA               |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|");
        
    }
    /**
     * Menu Principal
     */
    
    
    Puntaje p = new Puntaje();
    public void menuPrincipal(){
        
        
        System.out.println("|---------------------------------------------------|");
        System.out.println("| 1. Preguntas Cultura General                      |");
        System.out.println("| 2. Preguntas Deporte                              |");
        System.out.println("| 3. Preguntas Historia                             |");
        System.out.println("| 4. Preguntas Arte                                 |");
        System.out.println("| 5. Preguntas entretenimiento                      |");
        System.out.println("| 6. retirarse con el premio                        |");
        System.out.println("| 0. Salir                                          |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("| Digite la opcion deseada: ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: System.out.println("| Has elegido Cultura general ");
                    CulturaGeneral();
                    menuPrincipal();
            case 2: System.out.println("| Has elegido Deportes ");
                    Deportes();
                    menuPrincipal();
            case 3: System.out.println("| Has elegido Historia ");
                    Historia();
                    menuPrincipal();
            case 4: System.out.println("| Has elegido Arte ");
                    Arte();
                    menuPrincipal();
            case 5: System.out.println("| Has elegido Entretenimiento");
                    Entretenimiento();
                    menuPrincipal();
            case 6: System.out.println("| Elegiste retirarte con tu acumuladora actual, Obtienes:");p.Premio();
                    System.exit(0);
            case 0: System.out.println("| Has elegido Salir ");       
                    System.exit(0);
            default:System.out.println("| Opcion incorrecta, intentalo de nuevo: ");
                    menuPrincipal(); 
        }
    }
    
int res1 ;
int res2 ;
int res3 ;
int res4 ;
int res5 ;

public void CulturaGeneral(){

 System.out.println();   
 System.out.println("|-------------------------PREGUNTA #1----------------------|");
 System.out.println("| ¿Cual es el rio mas largo del mundo?                     |");
 System.out.println("| 1. Amazonas                                              |");
 System.out.println("| 2. Nilo                                                  |");
 System.out.println("| 3. Misisipi                                              |");
 System.out.println("| 4. Orinoco                                               |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res1 = teclado.nextInt();
 if(res1==1){
     premio = premio + 500;
     p.Respuesta();    
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #2----------------------|");
 System.out.println("| ¿En que año cayo el muro de Berlin?                    |");
 System.out.println("| 1. 1970                                                  |");
 System.out.println("| 2. 1990                                                  |");
 System.out.println("| 3. 1989                                                  |");
 System.out.println("| 4. 1996                                                  |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res2 = teclado.nextInt();
 
 if(res2==3){
    p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #3----------------------|");
 System.out.println("| ¿Cual es el planeta mas grande del sistema solar?        |");
 System.out.println("| 1. Saturno                                               |");
 System.out.println("| 2. Urano                                                 |");
 System.out.println("| 3. Jupiter                                               |");
 System.out.println("| 4. La tierra                                             |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res3 = teclado.nextInt();
 
 if(res3==3){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #4----------------------|");
 System.out.println("| ¿Cuantos huesos tiene el cuerpo humano?                  |");
 System.out.println("| 1. 230                                                   |");
 System.out.println("| 2. 201                                                   |");
 System.out.println("| 3. 200                                                   |");
 System.out.println("| 4. 206                                                   |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res4 = teclado.nextInt();
 
 if(res4==4){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #5----------------------|");
 System.out.println("| ¿Cuando llego el hombre a la luna?                       |");
 System.out.println("| 1. 1969                                                  |");
 System.out.println("| 2. 1990                                                  |");
 System.out.println("| 3. 1970                                                  |");
 System.out.println("| 4. 1973                                                  |");
 System.out.println("|----------------------------------------------------------|");
 
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res5 = teclado.nextInt();
 
 if(res5==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 
 
 
}
  
public void Deportes(){
 System.out.println();   
 System.out.println("|-------------------------PREGUNTA #1----------------------|");
 System.out.println("| ¿Cuanto dura un partido de futbol?                       |");
 System.out.println("| 1. 75 Minutos                                            |");
 System.out.println("| 2. 90 Minutos                                            |");
 System.out.println("| 3. 120 Minutos                                           |");
 System.out.println("| 4. 80 Minutos                                            |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res1 = teclado.nextInt();
 
 if(res1==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #2----------------------|");
 System.out.println("| ¿Que seleccion de futbol ha ganado mas mundiales?        |");
 System.out.println("| 1. Brasil                                                |");
 System.out.println("| 2. Alemania                                              |");
 System.out.println("| 3. Holanda                                               |");
 System.out.println("| 4. Uruguay                                               |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res2 = teclado.nextInt();
 
 if(res2==1){
    p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #3----------------------|");
 System.out.println("| ¿En que año se jugo el primer mundial de futbol?         |");
 System.out.println("| 1. 1920                                                  |");
 System.out.println("| 2. 1925                                                  |");
 System.out.println("| 3. 1930                                                  |");
 System.out.println("| 4. 1932                                                  |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res3 = teclado.nextInt();
 
 if(res3==3){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #4----------------------|");
 System.out.println("| ¿En que pais se encuentra el estadio la Bombonera?       |");
 System.out.println("| 1. Chile                                                 |");
 System.out.println("| 2. Argentina                                             |");
 System.out.println("| 3. Peru                                                  |");
 System.out.println("| 4. Colombia                                              |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res4 = teclado.nextInt();
 
 if(res4==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #5----------------------|");
 System.out.println("| ¿Quien gano el mundial en 2010?                          |");
 System.out.println("| 1. España                                                |");
 System.out.println("| 2. Brasil                                                |");
 System.out.println("| 3. Alemania                                              |");
 System.out.println("| 4. Colombia                                              |");
 System.out.println("|----------------------------------------------------------|");
 
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res5 = teclado.nextInt();
 
 if(res5==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
}  

public void Historia(){
    
 System.out.println();   
 System.out.println("|-------------------------PREGUNTA #1----------------------|");
 System.out.println("| ¿De qué nacionalidad era Juana de Arco?                  |");
 System.out.println("| 1. Italiana                                              |");
 System.out.println("| 2. Francesa                                              |");
 System.out.println("| 3. Española                                              |");
 System.out.println("| 4. Holandesa                                             |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res1 = teclado.nextInt();
 
 if(res1==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #2----------------------|");
 System.out.println("| ¿Quién dibujo al famoso Hombre de Vitruvio?              |");
 System.out.println("| 1. Miguel Angel                                          |");
 System.out.println("| 2. Leonardo Da Vinci                                     |");
 System.out.println("| 3. Rubens                                                |");
 System.out.println("| 4. Botero                                                |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res2 = teclado.nextInt();
 
 if(res2==2){
    p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #3----------------------|");
 System.out.println("| ¿Qué inició la Segunda Guerra Mundial                    |");
 System.out.println("| 1. El asesinato del archiduque Francisco Fernando        |");
 System.out.println("| 2. Alemania invadió Polonia                              |");
 System.out.println("| 3. Hitler invadió Austria                                |");
 System.out.println("| 4. Ninguna de las anteriores                             |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res3 = teclado.nextInt();
 
 if(res3==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #4----------------------|");
 System.out.println("| ¿Cómo comenzó la Primera Guerra Mundial?                 |");
 System.out.println("| 1. Con asesinato del príncipe belga Leopold              |");
 System.out.println("| 2. Con el asesinato del archiduque Francisco Fernando.   |");
 System.out.println("| 3. Con la batalla de Gallipoli.                          |");
 System.out.println("| 4. El asesinato de la Pola                               |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res4 = teclado.nextInt();
 
 if(res4==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #5----------------------|");
 System.out.println("| ¿Quién fue el primer hombre que pisó la luna?            |");
 System.out.println("| 1. Valentina Tereshckova                                 |");
 System.out.println("| 2. Neil Amstrong                                         |");
 System.out.println("| 3. Buzz Aldrin                                           |");
 System.out.println("| 4. Michael Phelps                                        |");
 System.out.println("|----------------------------------------------------------|");
 
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res5 = teclado.nextInt();
 
 if(res5==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
    
}

public void Arte(){
 System.out.println();   
 System.out.println("|-------------------------PREGUNTA #1----------------------|");
 System.out.println("| ¿Quien es considerado el padre del puntillismo?          |");
 System.out.println("| 1. George Seurat                                         |");
 System.out.println("| 2. Paul Signac                                           |");
 System.out.println("| 3. Charles Angrand                                       |");
 System.out.println("| 4. Leonardo Da Vinci                                     |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res1 = teclado.nextInt();
 
 if(res1==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #2----------------------|");
 System.out.println("| ¿En que civilizacion se originaron los Obeliscos?        |");
 System.out.println("| 1. Sumeria                                               |");
 System.out.println("| 2. Egipcia                                               |");
 System.out.println("| 3. Romana                                                |");
 System.out.println("| 4. Mesopotamica                                          |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res2 = teclado.nextInt();
 
 if(res2==2){
    p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #3----------------------|");
 System.out.println("| ¿Donde se encuentra el museo de Rodin?                   |");
 System.out.println("| 1. Paris                                                 |");
 System.out.println("| 2. Lyon                                                  |");
 System.out.println("| 3. Florencia                                             |");
 System.out.println("| 4. Irak                                                  |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res3 = teclado.nextInt();
 
 if(res3==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #4----------------------|");
 System.out.println("| ¿Cuantas obras tiene  pinturas negras de Goya?           |");
 System.out.println("| 1. 10                                                    |");
 System.out.println("| 2. 11                                                    |");
 System.out.println("| 3. 5                                                     |");
 System.out.println("| 4. 14                                                    |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res4 = teclado.nextInt();
 
 if(res4==4){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #5----------------------|");
 System.out.println("| ¿Que arte practicaba Camille Claudel?                    |");
 System.out.println("| 1. Pintura                                               |");
 System.out.println("| 2. Escultura                                             |");
 System.out.println("| 3. Arquitectura                                          |");
 System.out.println("| 4. Cine                                                  |");
 System.out.println("|----------------------------------------------------------|");
 
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res5 = teclado.nextInt();
 
 if(res5==2){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
}

public void Entretenimiento(){
    System.out.println();   
 System.out.println("|-------------------------PREGUNTA #1----------------------|");
 System.out.println("| ¿En qué año se estrenó la película de Disney Pinocho?    |");
 System.out.println("| 1. 1940                                                  |");
 System.out.println("| 2. 1950                                                  |");
 System.out.println("| 3. 1952                                                  |");
 System.out.println("| 4. 1960                                                  |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res1 = teclado.nextInt();
 
 if(res1==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #2----------------------|");
 System.out.println("| ¿Quién es la mascota de SEGA?                            |");
 System.out.println("| 1. Sonic                                                 |");
 System.out.println("| 2. Mario                                                 |");
 System.out.println("| 3. Pac-man                                               |");
 System.out.println("| 4. Crash                                                 |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res2 = teclado.nextInt();
 
 if(res2==1){
    p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #3----------------------|");
 System.out.println("| ¿Que personaje que interpretaba al pacino en “Scarface”? |");
 System.out.println("| 1. Tonny Montana                                         |");
 System.out.println("| 2. Sonny Montana                                         |");
 System.out.println("| 3. Michael Corleone                                      |");
 System.out.println("| 4. Irak                                                  |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res3 = teclado.nextInt();
 
 if(res3==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #4----------------------|");
 System.out.println("| ¿que película le pertenece la canción Un mundo ideal?    |");
 System.out.println("| 1. Aladdin                                               |");
 System.out.println("| 2. La bella y la bestia                                  |");
 System.out.println("| 3. Mulán                                                 |");
 System.out.println("| 4. Pocahontas                                            |");
 System.out.println("|----------------------------------------------------------|");
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res4 = teclado.nextInt();
 
 if(res4==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
 System.out.println("|-------------------------PREGUNTA #5----------------------|");
 System.out.println("| ¿compañía de videojuegos de “The legend of zelda”?       |");
 System.out.println("| 1. Nintendo                                              |");
 System.out.println("| 2. Sega                                                  |");
 System.out.println("| 3. Sony interactive entertainment                        |");
 System.out.println("| 4. Xbox Game Studios                                     |");
 System.out.println("|----------------------------------------------------------|");
 
 System.out.println("|Digita el numero que corresponda la respuesta             |");
 res5 = teclado.nextInt();
 
 if(res5==1){
     p.Respuesta();
 }else{
     System.out.println("¡Respuesta Equivocada!, Pierdes todo");
     System.exit(0);
 }
 System.out.println();
    }







          
    public static void main(String[] args) {
        Prueba_Sofka proyecto1 = new Prueba_Sofka();
        proyecto1.menuPrincipal();
        Metodo m = new Metodo();
        m.Escribir("Archivo.txt");
    }
    
    
}
