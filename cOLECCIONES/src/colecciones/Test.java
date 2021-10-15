/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno mañana
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    List<String> miLista = new ArrayList<>();
    
    miLista.add("Lunes");
    miLista.add("martes");
    miLista.add("miercoles");
    miLista.add("jueves");
    miLista.add("viernes");
    
    for (String elem: miLista){
        System.out.println("elem - " + elem);
        
    }
        imprimir(miLista);
    
       Map miMap = new HashMap();
       miMap.put("valor","Santiago");
       miMap.put("valor2","javier");
       miMap.put("valor3","luis");
    
       String nombre = (String) miMap.get("valor3");
      System.out.println("nombre" + nombre);
    
        imprimir(miMap.keySet());//claves
        imprimir(miMap.values()); //valores
    
    }
    
     public static void imprimir(Collection coleccion) {
         
          coleccion.forEach(elem -> {
           
          System.out.println("elem - " + elem); 
       });
         
     }
    
    
    
}
