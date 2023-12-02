/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio5 {
        public static void probarConexionRed() {
          System.out.println("");
          System.out.println("Ejercicio 5");
          System.out.println("");
          System.out.println("Crea una interfaz llamada ConexionRed con métodos conectar() y desconectar().\nLuego, implementa esta interfaz en las clases Router y Computadora.\nLa clase Router debe tener un método adicional configurarRed().\n");
        // Implementa la lógica del ejercicio 5 aquí
    }
   
        public interface ConexionRed{
            
         void conectar();
         void desconectar();
         
        }
        public class Router implements ConexionRed{
        
            @Override 
            public void conectar(){
            System.out.println("Se conecto de manera correcta :)");
            }
            @Override
            public void desconectar(){
            System.out.println("Se desconecto el Router :(");
            }
            
            public void ConfigurarRed(){
            System.out.println("Espere,la red se está configurando");
            } 
        }
         public class Computadora implements ConexionRed{
        
            @Override 
            public void conectar(){
            System.out.println("Se conecto la computadora:)");
            }
            @Override
            public void desconectar(){
            System.out.println("Se desconecto la compuatdora :(");
            }
            
        }
       public void main(String[] args){
       
           Router Router= new Router();
           Router.conectar();
           Router.desconectar();
           Router.ConfigurarRed();
           
           Computadora Computadora = new Computadora();
           Computadora.conectar();
           Computadora.desconectar();
           
       }   
   
        
}//Final
