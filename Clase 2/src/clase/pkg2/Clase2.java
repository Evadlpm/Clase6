/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author mevad
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int edad = 0;
        String temp = "";
        temp = JOptionPane.showInputDialog("Digite su edad");
        edad = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, edad);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Si puede tomar alcohol , fumar , hacer porno");
            if(edad==18){
                JOptionPane.showMessageDialog(null, "Fijo va ir de fiesta");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Le toca ir a misa todos los domingos");
        }
    if(edad==18)
        JOptionPane.showMessageDialog(null, "Tiene apenas 18");
    JOptionPane.showMessageDialog(null, "Esto siemore se va a imprimir"); //Esto simpre se imprime porque el if no tiene llaves
         */
        
        int dia = 0;
        String temp1 = "";

        temp1 = JOptionPane.showInputDialog("Digite el dia de la semna");
        dia = Integer.parseInt(temp1);

        switch (dia) {
            case 1:
                JOptionPane.showInputDialog("Lunes");
                break;
            case 2:
                JOptionPane.showInputDialog("Martes");
                break;
            case 3:
                JOptionPane.showInputDialog("Miercoles");
                break;
            case 4:
                JOptionPane.showInputDialog("Jueves");
                break;
            case 5:
                JOptionPane.showInputDialog("Viernes");
                JOptionPane.showInputDialog("El cuerpo lo sabe");
                break;
            case 6:
                JOptionPane.showInputDialog("Sabado");
                break;
            case 7:
                JOptionPane.showInputDialog("Domingo");
                break;
            case 8:
            case 9:
            case 10:
                JOptionPane.showInputDialog("Ese dia no es opcion");
            default:
                JOptionPane.showMessageDialog(null, "No aplica");
        }
          
    }

}
