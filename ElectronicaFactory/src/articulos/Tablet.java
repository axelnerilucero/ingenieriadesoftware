/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

import electronicafactory.Electronica;

/**
 *
 * @author neril
 */
public class Tablet implements Electronica{
    private boolean android;
    private String marca;
    private String ram;
    private String pantalla;

    public Tablet() {
    }

    public Tablet(boolean android, String marca, String ram, String pantalla) {
        this.android = android;
        this.marca = marca;
        this.ram = ram;
        this.pantalla = pantalla;
    }

    public boolean isAndroid() {
        return android;
    }

    public void setAndroid(boolean android) {
        this.android = android;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "android = " + android + ", marca = " + marca + ", ram = " + ram + ", pantalla = " + pantalla + '}';
    }
    
}
