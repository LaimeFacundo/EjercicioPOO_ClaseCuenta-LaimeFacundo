/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author yofac
 * 
 * 
 * 
 * Actividad
 * 1 Crear 2 objetos de la clase Cuenta c1 y c2
 * 2 Realizar un ingreso en c1 y c2. Mostrar el resultado
 * 3 Realizar egresos en c1 y c2. Mostrar resultados
 * 4 Transferir Saldo de c1 a c2. Mostrar resultados
 * 
 * 
 * 
 */
public class CuentaApp {
    
    public static void main(String[] args) {
        //2)
        Cuenta c1 = new Cuenta("Pepe","123412",7.0,1000);
        Cuenta c2 = new Cuenta();
        
        c2.setNombre_cliente("Juan");
        
        //2)
        c1.ingreso(2000);
        c2.ingreso(5000);
        
        System.out.println("2 -");
        System.out.print("Saldo de c1: ");
        System.out.println (c1.getSaldo());
        System.out.print("Saldo de c2: ");
        System.out.println (c2.getSaldo());
        
        //3)
        
        c1.extraccion(1000);
        System.out.println("3 -");
        System.out.println("Saldo c1: ");
        System.out.println (c1.getSaldo());
        
        c2.extraccion(1000);
        System.out.println("Saldo c2: ");
        System.out.println (c2.getSaldo());
        
        
        //4)
        c1.transferencia(c2 , 500);
        System.out.println("4 -");
        System.out.print("Saldo c2: ");
        System.out.println (c2.getSaldo());
        
        System.out.print("Saldo c1: ");
        System.out.println (c1.getSaldo());
        
        
        
        
        
        
        
        
    }
    
    
}
