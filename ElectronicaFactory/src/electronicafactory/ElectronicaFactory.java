/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electronicafactory;

import articulos.Computadora;
import articulos.Smartphone;
import articulos.Tablet;

/**
 *
 * @author neril
 */
public class ElectronicaFactory {
    //acoplar las clases
    public static Electronica createElectronico(int tipo){
        switch (tipo) {
            case Electronica.COMPUTADORA_GAMER:
                return new Computadora("ASUS", false, "i7-11389H", "16 GB", true, "2 TB");

            case Electronica.COMPUTADORA_ASUS:
                return new Computadora("ASUS", true, "i7-1165G7", "8 GB", true, "1 TB");
                
            case Electronica.COMPUTADORA_MACBOOKPRO:
                return new Computadora("Apple", true, "i9-12342U", "12 GB", true, "256 GB");

            case Electronica.SMARTPHONE_IPHONE:
                return new Smartphone(false, "apple", "8 GB", "512 GB");
                    
            case Electronica.SMARTPHONE_GAMER:
                return new Smartphone(true, "Red Magic", "8 GB", "256 GB");
            
            case Electronica.SMARTPHONE_MOTOROLA:
                return new Smartphone(true, "Motorola", "2 GB", "26 GB");
             
            case Electronica.TABLET_IPAD:
                return new Tablet(false, "Apple", "8 GB", "8 pulgadas");
                
            case Electronica.TABLET_HUAWEI:
                return new Tablet(true, "Huawei", "4 GB", "10 pulgadas");
            
            case Electronica.TABLET_LENOVO:
                return new Tablet(true, "Lenovo", "4 GB", "9 pulgadas");
            
            default:
                throw new AssertionError();
        }
    }
}
   
