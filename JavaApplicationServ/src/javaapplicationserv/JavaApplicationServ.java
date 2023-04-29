/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationserv;

/**
 *
 * @author yaz y almita
 */
public class JavaApplicationServ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioCuentaBancaria {
     Scanner leer = new Scanner(System.in);
    public CuentaBancaria nuevacuenta(){
        CuentaBancaria ncuenta = new CuentaBancaria();
        return ncuenta;
    }
    public void crearCuenta(CuentaBancaria ncuenta){
        System.out.println("Ingrese DNI");
       ncuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese Numero De Cuenta ");
        ncuenta.setNumeroCuenta(leer.nextInt());
        
    }
    public double Ingresar(CuentaBancaria ncuenta){
       double saldo;
        System.out.println("Ingrese monto a depositar ");
        saldo = ncuenta.getSaldoAtual()+ leer.nextDouble();
        ncuenta.setSaldoAtual(saldo);
        System.out.println("La Operacion se realizo con exito ");
        System.out.println("su saldo es " + saldo);
        return saldo;
    }
    public double Retirar(CuentaBancaria ncuenta){
        double saldo=0,retirar;
        String salir = "n" ;
        do {
        System.out.println("Ingrese monto a Retirar ");
        retirar = leer.nextDouble();
        if (retirar<ncuenta.getSaldoAtual()) {
       
            saldo = ncuenta.getSaldoAtual() - retirar;
        System.out.println("La Operacion se realizo con exito ");
        System.out.println("su saldo es " + saldo);
        }else {
            System.out.println("saldo insuficiente ");
        }
            System.out.println("¿Desea retirar dinero (S/N)?");
            salir = leer.next();
         } while (salir.equalsIgnoreCase("s"));
        ncuenta.setSaldoAtual(saldo);
        return saldo;
    }
    public void extraccionRapida(CuentaBancaria ncuenta){
        double retirar,saldo=0; 
        retirar = ncuenta.getSaldoAtual()*0.20;
        saldo = ncuenta.getSaldoAtual()- retirar ;
        ncuenta.setSaldoAtual(saldo);
        System.out.println("operacion Exitosa");
        
    }
    public void consultarSaldo(CuentaBancaria ncuenta) {
        System.out.println("Su saldo es "+ ncuenta.getSaldoAtual());
    }
    public void consultarDatos(CuentaBancaria ncuenta) {
        System.out.println("             DNI = "+ ncuenta.getDniCliente());
        System.out.println("Numero De Cuenta = " + ncuenta.getNumeroCuenta());
        
    }
   public void Menu(CuentaBancaria ncuenta) {
       ServicioCuentaBancaria nservicio = new ServicioCuentaBancaria();
       String salir = "n";
       do {
           
          
       
       
       System.out.println("Menu");
       System.out.println("Opcio 1 = Ingresar Dinero");
        System.out.println("Opcio 2 = Retirar Dinero");
         System.out.println("Opcio 3 = Extracion Rapida");
          System.out.println("Opcio 4 = Consultar Saldo");
           System.out.println("Opcio 5 = Consultar Datos");
            System.out.println("Opcio 6 = Salir");
         int op= leer.nextInt();
         
           switch (op) {
               case 1:
                  nservicio.Ingresar(ncuenta);
                   break;
                   case 2:
                   nservicio.Retirar(ncuenta);
                   break;
                   case 3:
                   nservicio.extraccionRapida(ncuenta);
                   break;
                   case 4:
                   nservicio.consultarSaldo(ncuenta);
                   break;
                   case 5:
                   nservicio.consultarDatos(ncuenta);
                   break;
                   case 6:
                       System.out.println("Desea Salir? (S/N)");
                       salir = leer.next();
                   break;
   
               default:
                   System.out.println("Opcion incorrecta");
                   break;
           }
            } while (salir.equalsIgnoreCase("n"));
   }

    public ServicioCuentaBancaria() {
        
    }
    
}
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double SaldoAtual = 1000;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double SaldoAtual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoAtual = SaldoAtual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(double SaldoAtual) {
        this.SaldoAtual = SaldoAtual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", SaldoAtual=" + SaldoAtual + '}';
    }
    
}   
    }
    

