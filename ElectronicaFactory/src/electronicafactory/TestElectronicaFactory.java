/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electronicafactory;

import java.util.Scanner;

/**
 *
 * @author neril
 */
public class TestElectronicaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
       
       // pintamos el menú
        System.out.println("Selecciona el articulo que desees adquirir:");
        System.out.println(Electronica.COMPUTADORA_ASUS + ") Computadora ASUS");
        System.out.println(Electronica.COMPUTADORA_GAMER + ") PC gamer");
        System.out.println(Electronica.COMPUTADORA_MACBOOKPRO + ") MacBook Pro");
        System.out.println(Electronica.SMARTPHONE_GAMER + ") Smartphone gamer");
        System.out.println(Electronica.SMARTPHONE_IPHONE + ") Iphone 11");
        System.out.println(Electronica.SMARTPHONE_MOTOROLA + ") Smartphone moto");
        System.out.println(Electronica.TABLET_HUAWEI + ") Huawei MatePad");
        System.out.println(Electronica.TABLET_IPAD + ") IPAD");
        System.out.println(Electronica.TABLET_LENOVO + ") IDEAPAD");
        
        try {
            System.out.println("Elige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste numero chabo");
        }
        
        Electronica articulo = ElectronicaFactory.createElectronico(eleccion);
        System.out.println(articulo.toString());
    }
    
}
