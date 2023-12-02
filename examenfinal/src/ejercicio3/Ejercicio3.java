/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio3 {
       public static void calcularValorInventario() {
          System.out.println("");
          System.out.println("Ejercicio 3");
          System.out.println("");
          System.out.println("Escribe un programa en Java que lea un archivo de texto llamado \"datos.txt\" \nque contiene información sobre productos (nombre, precio y cantidad en stock). \nCalcula el valor total del inventario y guarda el resultado en un nuevo archivo llamado \"inventario.txt\".\n");
        // Implementa la lógica del ejercicio 3 aquí
    }

    import java.io.BufferedReader;
    import java.io.File; 
    import java.io.FileReader;
    import java.io.FileWriter;
      
       public class Inventario {
       
       public static void main (String[] args) throws Exception {

          File archivoDatos = new File("datos.txt");
          file archivoInventario = new File("inventario.txt");
          
          BufferedReader lector = new BufferedReader(new
          FileReader(archivoDatos));
          FileWriter escritor = new FileWriter(archivoInventario);
       }
       
       String linea; 
       int valorTotal = 0; 
      
       while (linea = lector.readLine()){
       
           String[] datos = linea.split(",");
       
           int cantidad = Integer.parseInt(datos[2]);
 
           int precio = Integer.parseInt(datos[1]);
           
           int valorProducto = cantidad * precio;
           valorTotal += valorProducto;
       }
       
           escritor.write("El valor total del inventario es: " + valorTotal);
           
           escritor.close();
           lector.close();
       }
       
       
       
    }//fin inventario
   
}
