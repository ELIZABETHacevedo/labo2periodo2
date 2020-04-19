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
public class Labo2Periodo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a=true;
        while(a){
        switch (Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero \n [1]-edificio deportivo\n [2]--hospitalario \n "
                + "[3]--educativo \n [4]--salir"))) {
            case 1:
                
        nuevoEdificio edificioDeportivo =new nuevoEdificio(250000.00,200,5,1,25,"deportivo");
        edificioDeportivo.verDatos();
        edificioDeportivo.menu2();
                break;
            case 2:
                
        nuevoEdificio edificioHospital =new nuevoEdificio(600000.00,600,5,5,300,"hospitalario");
        edificioHospital.verDatos();
        edificioHospital.menu2();
        break;
            case 3:
                
        nuevoEdificio edificioEducativo =new nuevoEdificio(100000.00,200,3,2,40,"educativo");
        edificioEducativo.verDatos();
        edificioEducativo.menu2();
        break;
            default:
                a= false;
        }
        
        
        
        }
    }
    
}
