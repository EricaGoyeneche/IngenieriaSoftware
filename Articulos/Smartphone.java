/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulos;

import PatronFactory.Factory;
/**
 *
 * @author Erica
 */
public class Smartphone implements Factory {
    private String procesador;
    private int ram;  
    private int almacenamiento;
    

    public Smartphone() {
    }

    public Smartphone(String procesador, int ram, int almacenamiento) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

   

    @Override
    public String toString() {
        return "Smartphone"
                + "{" + "procesador=" + procesador 
                + ", ram=" + ram + ", almacenamiento=" + almacenamiento 
                + '}';
    }
    
   
         
    
    
}
