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
public class Tablet implements Factory {
    private String modelo;  
    private float almacenamiento;
    private float pulgadas;
  

    public Tablet() {
    }

    public Tablet(String modelo,float almacenamiento, float pulgadas) {
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.pulgadas = pulgadas;
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

   

    @Override
    public String toString() {
        return "Tablet{" + "modelo=" + modelo + ", almacenamiento=" + almacenamiento + ", pulgadas=" + pulgadas + '}';
    }
    
    
}
