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
public class Smartphone implements Electronica{
    private boolean android;
    private String marca;
    private String ram;
    private String capacidad;

    public Smartphone() {
    }

    public Smartphone(boolean android, String marca, String ram, String capacidad) {
        this.android = android;
        this.marca = marca;
        this.ram = ram;
        this.capacidad = capacidad;
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

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "android = " + android + ", marca = " + marca + ", ram = " + ram + ", capacidad = " + capacidad + '}';
    }
    
    
}
