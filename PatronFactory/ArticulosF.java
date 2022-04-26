/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import Articulos.Computadora;
import Articulos.Smartphone;
import Articulos.Tablet;

/**
 *
 * @author Erica
 */
public class ArticulosF {
    public static Factory createArticulo (int tipo)
    {
        switch (tipo) 
        {
         
            case Factory.COMPUTADORA_MAC:
                return new Computadora ("MacOS", "M1", "iOS",12);
                
            case Factory.COMPUTADORA_LENOVO:
                return new Computadora ("lENOVO", "Ryzen 6", "Windows",12);
            
            case Factory.COMPUTADORA_ASUS:
                return new Computadora ("ASUS", "Vivobook", "Windows",12);
                
            case Factory.SMARTPHONE_SAMSUNG:
                return new Smartphone("Octa Core 1.6", 32, 156);
                
            case Factory.SMARTPHONE_PIXEL:
                return new Smartphone("Tensor octa-core ", 64, 120); 
                
            case Factory.SMARTPHONE_IPHONE:
                return new Smartphone("A15 Bionic ", 4, 128);  
                
            case Factory.TABLET_IPAD:
                return new Tablet("iPad PRO", (float) 512,(float) 12.9);
                
            case Factory.TABLET_LENOVO:
                return new Tablet("Lenovo P11", (float) 128.0, (float) 11.2);    
                                                      
            default:
                throw new AssertionError();
        }
        
    }
        
}

