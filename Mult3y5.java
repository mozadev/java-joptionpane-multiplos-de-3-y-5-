/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mult3y5;

/**
 *
 * @author Jose
 */
import javax.swing.JOptionPane;
public class Mult3y5 {

    public static void main(String[] args) {
        int num, i, mult3, mult5, mult3y5;
        String mult3cad="";
        String mult5cad="";
        String mult3y5cad="";
      
        
        mult3 = 0;
        mult5 = 0;
        mult3y5 = 0;

        String cadena = " ";

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] x = new int[num];

        for (i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));

        }

        for (i = 0; i < x.length; i++) {

            if (x[i] % 3 == 0) {
                mult3++;
                mult3cad=mult3cad+x[i]+" ";
            }
            if (x[i] % 5 == 0) {
                mult5++;
                 mult5cad=mult5cad+x[i]+" ";
            }
            if (x[i] % 3 == 0 && x[i] % 5 == 0) {
                mult3y5++;
                 mult3y5cad=mult3y5cad+x[i]+" ";
            }

        }
        JOptionPane.showMessageDialog(null, "los cantidad de multiplos de 3 y son: " + mult3+" y los numeros son: "+mult3cad);
        JOptionPane.showMessageDialog(null, "los multiplos de 5  son: " + mult5+" y los numeros son: "+mult5cad);
        JOptionPane.showMessageDialog(null, "los multiplos de 3 y 5 son: " + mult3y5+" y los numeros son: "+mult3y5cad);

    }

}
