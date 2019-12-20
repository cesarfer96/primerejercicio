/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author César Fernández
 */
public class Computadora {
    
    Scanner sc=new Scanner(System.in);
    
    String marca;
    int modelo;
    String tarjeta_grafica;
    String tarjeta_sonido;
    int memoria_ram;
    int disco_duro;
    
    //setters y getters de marca
    public  void setMarca(String marca){}
    public  String getMarca(){
    return this.marca;
    }
    
    //setters y getters de modelo
    public  void setModelo(int modelo){}
    public  int getModelo(){
    return this.modelo;
    }
    
    //setters y getters de tarjeta_grafica
    public  void setTarjeta_Grafica(String tarjeta_grafica){}
    public  String getTarjeta_Grafica(){
    return this.tarjeta_grafica;
    }
    
    //setters y getters de tarjeta_sonido
    public  void setTarjeta_Sonido(String tarjeta_sonido){}
    public  String getTarjeta_Sonido(){
    return this.tarjeta_sonido;
    }
    
    //setters y getters de memoria_ram
    public  void setMemoria_Ram(int memoria_ram){}
    public  int geMemoria_Ram(){
    return this.memoria_ram;
    }
    
    //setters y getters de disco_duro
    public  void setDisco_Duro(int disco_duro){}
    public  int getDisco_Duro(){
    return this.disco_duro;
    }
    
    public void solicitar(){
        System.out.println("Marca: ");
        this.marca = sc.nextLine();
        
        System.out.println("Tarjeta Grafica: ");
        this.tarjeta_grafica = sc.nextLine();
        
        System.out.println("Tarjeta de Sonido: ");
        this.tarjeta_sonido = sc.nextLine();
        
        System.out.println("Memoria RAM: ");
        this.memoria_ram = sc.nextInt();
        
        System.out.println("Disco Duro: ");
        this.disco_duro = sc.nextInt();
        
        System.out.println("Modelo: ");
        this.modelo = sc.nextInt(); 
    }
    
    public void imprimir (){
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Las caracteristicas ingresadas de la computadora deseada son las siguientes: ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Tarjeta Grafica: "+tarjeta_grafica);
        System.out.println("Tarjeta de Sonido: "+tarjeta_sonido);
        System.out.println("Memoria RAM: "+memoria_ram);
        System.out.println("Disco Duro: "+disco_duro);
        System.out.println("----------------------------------------------------------------------------------------------------------------");  
    }
}
