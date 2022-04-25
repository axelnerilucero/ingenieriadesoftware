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
public class Computadora implements Electronica{
    private String marca;
    private boolean laptop; 
    private String procesador;
    private String ram;
    private boolean ssd;
    private String capacidad;

    public Computadora() {
    }

    public Computadora(String marca, boolean laptop, String procesador, String ram, boolean ssd, String capacidad) {
        this.marca = marca;
        this.laptop = laptop;
        this.procesador = procesador;
        this.ram = ram;
        this.ssd = ssd;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca = " + marca + ", laptop = " + laptop + ", procesador = " + procesador + ", ram = " + ram + ", ssd = " + ssd + ", capacidad = " + capacidad + '}';
    }
       
}
