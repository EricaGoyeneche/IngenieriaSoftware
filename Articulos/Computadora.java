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
public class Computadora implements Factory {
    private String marca;
    private String procesador;  
    private String SO;
    private int ram;
     

    public Computadora() { 
    }

    public Computadora(String marca, String procesador, String SO, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.SO = SO;
        this.ram = ram;
        
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

   
    
    //ToString
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador 
                + ", SO=" + SO + ", ram=" + ram + '}';
    }
           
}
