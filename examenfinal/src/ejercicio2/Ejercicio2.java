/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio2 {
       public static void gestionarClientes() {
            System.out.println("");
          System.out.println("Ejercicio 2");
          System.out.println("");
           System.out.println("Crea una clase llamada RegistroClientes que permita "
                   + "gestionar dinámicamente un conjunto de objetos Cliente."
                   + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo.\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
                   + "\nDebe calcular la cantidad de bytes total del prcedimiento calcular saldo total.\n");
        // Implementa la lógica del ejercicio 2 aquí
    }
 public class RegistroClientes{
     
 private Cliente[] Cliente;
 private int cantidadCliente;
 private String saldo;
 
    public RegistroClientes(){
     Cliente = new Cliente[10];
     cantidadCliente = 0;
     
}
 public void agregarClientes (String nombre, String Saldo, String idCliente){
 Cliente [cantidadCliente] = new Cliente (nombre, saldo, idCliente);
 cantidadCliente++;
 
 }
 
 public void eliminarCliente(String idCliente) {
     
 
     for (int i = 0; i < cantidadCliente; i++) {
      if (Cliente [i].getIdCliente().equals(idCliente)) {
   
       for (int j = i; j < cantidadCliente - 1; j++) {
        Cliente[j] = Cliente[j + 1];
 }
         cantidadCliente--;
         break;
      }
     }
 }
 
      public int calcularSaldoTotal() {
      
      int saldoTotal = 0;
    
     for (int i = 0; i < cantidadCliente; i++) {
     
       saldoTotal += Cliente[i].getSaldo();
     }
      return saldoTotal;
 }
        public int CalcularSaldoT() {
          
        return CalcularSaldoT().toString().length() * 2;
 }
            public void main(String[] args) {
      
           RegistroClientes registroCliente = new RegistroClientes();
           RegistroClientes.agregarCliente();
           RegistroClientes.agregarCliente();
    
    System.out.println( + registroCliente.calcularSaldoTotal());
    System.out.println("Saldo Total: " + 
    registroCliente.CalcularSaldoT());
 }
 
       
        
        
}//registrofin

 public class Cliente{
 
     private String nombre; //4 bytes
     private String saldo; //4 bytes
     private String idCliente; //4 bytes
     
     public Cliente(String nombre, String Saldo, String idCliente){
         this.nombre=nombre;
         this.saldo=saldo;
         this.idCliente= idCliente;
     
     
     }
    public String getNombre(){
    return nombre;
 }
    public void setNombre(String nombre){
    this.nombre= nombre;
    }
    public String getSaldo(){
    return saldo;
    }
     public void setSaldo(String saldo){
    this.saldo= saldo;
    }
     public String getIdCliente(){
    return idCliente;
    }
     public void setIdCliente(String idCliente){
    this.idCliente= idCliente;
    }
 }//cierra cliente
 
 
 
}
//fin
 

 
