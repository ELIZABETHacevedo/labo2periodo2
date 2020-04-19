/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2periodo2;

/**
 *
 * @author Mery Acevedo
 */
public abstract class Edificio {
    public Double precio;
    public int mt,pasillos,niveles,habitaciones;

    public Edificio(Double precio, int mt, int pasillos, int niveles, int habitaciones) {
        this.precio = precio;
        this.mt = mt;
        this.pasillos = pasillos;
        this.niveles = niveles;
        this.habitaciones = habitaciones;
    }
    
    
    
    abstract void verDatos();
    
}
