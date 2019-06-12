/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Estudiante
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lectura
         String ruta = "archivo23.txt";
        try{
           
            FileReader archivo = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = "";
            while(linea!=null){//para leer todo el texto
                linea= lectura.readLine();
                System.out.println(linea);
            }
            
        }catch(FileNotFoundException ex1){
            System.out.println("Archivo"+ruta+"no encontrado");
        }
        catch(IOException e){
            System.out.println("Error de lectura");
        }
        //escritura
        try {
            String ruta1 = "archivo.txt";
            FileWriter archivo = new FileWriter(ruta, false);//crear archivos (f)

            BufferedWriter escritura = new BufferedWriter(archivo);//escritura
            escritura.append("Hola Mundo ");
            escritura.newLine();//salto de linea
            escritura.append("Chao Mundo");

            escritura.close();//finalizar escritura
            archivo.close();//finalizar archivo
        } catch (IOException ex) {
            System.out.println("Error de escritura");
        }
    }

}
