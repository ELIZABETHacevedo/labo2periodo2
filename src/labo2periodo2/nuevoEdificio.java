/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2periodo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mery Acevedo
 */
public class nuevoEdificio extends Edificio implements sistemaAntiIncendio,sistemaElectrico,sistemaSeguridad{
public String tipo;
    
    public nuevoEdificio(Double precio, int mt, int pasillos, int niveles, int habitaciones,String a) {
        super(precio, mt, pasillos, niveles, habitaciones);
        this.tipo=a;
    }
    
    public void menu2(){
        switch (Integer.parseInt(JOptionPane.showInputDialog(this.tipo+"\n"+"ingrese opcion probar \n [1]--sistema de seguridad\n"
                + " [2]--sistema electrico\n [3]--sistema seguridad"))) {
            case 1:
                this.alarmaIntrusion();
                break;
            case 2:
                this.activarSistema();
                break;
            case 3:
                this.activarAlarma();
                break;
            default:
                    
        }
    }
    

    @Override
    void verDatos() {
        JOptionPane.showMessageDialog(null,"precio: "+String.valueOf(this.precio)+"\n mts cuadrados: "+String.valueOf(mt)+
                "\n num pasillos: "+String.valueOf(this.pasillos)+"\n niveles: "+this.niveles+"\n habitaciones: "+this.habitaciones);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void activarAlarma() {
        if (this.tipo.equals("hospitalario")) {
            JOptionPane.showMessageDialog(null,"encendiendo alarmas\n llamando depto bonberos\n "
                    + "activando aspersores");
        }else{
         
            JOptionPane.showMessageDialog(null,"encendiendo alarmas\n llamando depto bonberos");   
        }
    }

    @Override
    public void desactivarAlarma() {
        
            JOptionPane.showMessageDialog(null,"incendio controlado desactivando sistema anti-incendios");
    }

    @Override
    public void activarSistema() {
    
            JOptionPane.showMessageDialog(null,"conectando a la red electrica");
    
    }

    @Override
    public void desactivarSistema() {//

            JOptionPane.showMessageDialog(null,"desconectando red electrica");        
//hange body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alarmaIntrusion() {
        if (!this.tipo.equals("hospitalario")) {
            
            JOptionPane.showMessageDialog(null,"activando alarma del edificio");
        }else{
            
            JOptionPane.showMessageDialog(null,"llamando al depto. de policia");
        }
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarEdificio() {
        
            JOptionPane.showMessageDialog(null,"cerrando edificio");
        

//To change body of generated methods, choose Tools | Templates.
    }
    
}
