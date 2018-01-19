/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeInformativo;

import javax.swing.JOptionPane;

/**
 * Esta clase es para que aparezca un mensaje informativo, ese mensaje
 * tendrá un texto y solamente aparece un mensaje de aceptar
 *
 * @author tperezrodriguez
 */
public class mensajeInformativo {
    
        /**
     * Este dialogo de confirmación mostrará por default las opciones sí, no y
     * cancelar Devolverá un entero con la opción seleccionada como si
     * estuviéramos en un vector 
     * Si selecionamos sí, retornará un 0 
     * Si seleccionamos no, retornará un 1 
     * Si seleccionamos cancel, retornará un 2
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @param titulo es el titulo del mensaje
     */
    public static void mensajeInformativo (String diag, String titulo) {
        JOptionPane.showMessageDialog(null, diag, titulo, JOptionPane.WARNING_MESSAGE);
    }
   

}
