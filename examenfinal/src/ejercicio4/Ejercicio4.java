/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio4 {
    
       public static void probarVehiculos() {
            System.out.println("");
          System.out.println("Ejercicio 4");
          System.out.println("");
           System.out.println("Define una clase abstracta llamada Vehiculo con métodos abstractos acelerar() y frenar().\nLuego, crea las clases Coche y Bicicleta que extiendan Vehiculo y \nproporcionen una implementación para los métodos abstractos.\n");
        // Implementa la lógica del ejercicio 4 aquí
    }

public abstract class Vehiculo{
        public abstract void acelerar();
        public abstract void frenar();
}
public class Coche extends Vehiculo{
    
@ Override
public void acelerar(){
    System.out.println("El coche está acelerando");
}
@Override
public void frenar(){
System.out.println("El coche está frenando");
}
}
public class Bicicleta extends Vehiculo{
@ Override
public void acelerar(){
    System.out.println("la bicicleta está acelerando");
}
@Override
public void frenar(){
System.out.println("El bicicleta está frenando");
}  
  
}

  
  public void main(String[] args){
      
    Coche Coche = new Coche(); 
    Coche.acelerar();
    Coche.frenar();
    
    Bicicleta Bicicleta = new Bicicleta();
    Bicicleta.acelerar();
    Bicicleta.frenar();
} 



}//final
 