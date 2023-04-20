/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cuenta;


public class Cuenta {
    
    private String nombre_cliente;
    private String numero_cuenta;
    private double interes;
    private double saldo;
    
    //constructor

    public Cuenta() {
    }
    //Construcotor con parametros

    public Cuenta(String nombre_cliente, String numero_cuenta,double interes, double saldo) {
        this.nombre_cliente = nombre_cliente;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    
    //setters .......

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // getters ...........

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }
    
    // INGRESO Y EXTRACCION ----------------------
    
    public boolean ingreso (double importe){
        if (importe > 0){
            saldo = importe + saldo; //saldo+=importe
            return true;
        }else{
            return false;
        }
    }
    
    public boolean extraccion (double importe){
        if(importe <= saldo && importe > 0 ){
            saldo -= importe;
            return true;
        }else{
            return false;
        }
    }
    
    //TRANSFERENCIA -------------------------
    public boolean transferencia(Cuenta cuentaDestino , double importe){
        if (extraccion(importe) && cuentaDestino.ingreso(importe)){
            return true;
        }else{
            return false;
        }
    }

}
