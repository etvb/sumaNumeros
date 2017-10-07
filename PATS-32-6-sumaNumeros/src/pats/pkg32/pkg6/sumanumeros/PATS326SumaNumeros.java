/*
 * Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
 * los números introducidos.
 */
package pats.pkg32.pkg6.sumanumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS326SumaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero, suma =0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        
        while (numero != 0) {            
            suma += numero;     
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));  
        }
        
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        
    }
    
}
