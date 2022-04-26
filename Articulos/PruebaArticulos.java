/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulos;

import PatronFactory.ArticulosF;
import PatronFactory.Factory;
import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class PruebaArticulos 
{  
    public static void main(String[] args)    
    {
        int eleccion =0;
        Scanner teclado = new Scanner(System.in);
        
        //Se crea el Menu 
        System.out.println("LISTA DE ARTÍCULOS ELECTRÓNICOS");
        System.out.println(Computadora.COMPUTADORA_MAC + ") Computadora MAC");
        System.out.println(Computadora.COMPUTADORA_LENOVO + ") Computadora Lenovo");
        System.out.println(Computadora.COMPUTADORA_ASUS + ") Computadora Asus");
        System.out.println(Smartphone.SMARTPHONE_IPHONE + ") iPhone 13");
        System.out.println(Smartphone.SMARTPHONE_SAMSUNG + ") SAMSUNG A20");
        System.out.println(Smartphone.SMARTPHONE_PIXEL + ") Google Pixel 6");
        System.out.println(Tablet.TABLET_IPAD + ") iPad PRO");
        System.out.println(Tablet.TABLET_LENOVO + ") Tableta Lenovo P11");
            
        try {
                
                
            System.out.print("ELIGE UNO... ");
            eleccion = teclado.nextInt(); 
            
        } catch (Exception e) {
            System.out.println("¡ERROR! Vuelva a intentarlo :P ");
        }  
        //Articulo producto = ArtFactory.crearArticulo(seleccion);
        //System.out.println(producto.toString());
        
        Factory articulo = ArticulosF.createArticulo(eleccion);
        System.out.println(articulo.toString ());
        
                
    }

    
}
