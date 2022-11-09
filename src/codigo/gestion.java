/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;
import java.io.*;
/**
 *
 * @author myand
 */
public class gestion {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public gestion(){
        
    }
    
    public String AbrirAtexto(File archivo){
        String contenido="";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read())!=-1) {                
                char caracter = (char)ascci;
                contenido = contenido + caracter;
            }
        } catch (Exception e) {
        }
        
        return contenido;
    }
    
    public String GuardarTexto(File archivo,String contenido){
        String respuesta=null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta="Archivo guardado con exito";
            
        } catch (Exception e) {
        }
        return respuesta;
    }
  
}
