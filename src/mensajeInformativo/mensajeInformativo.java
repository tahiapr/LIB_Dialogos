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
     * Este dialogo mostrará un mensaje, de cualquier tipo, que el usuario
     * tendrá que aceptar
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @param titulo es el titulo del mensaje
     */
    public static void mensajeInformativo (String diag, String titulo) {
        JOptionPane.showMessageDialog(null, diag, titulo, JOptionPane.WARNING_MESSAGE);
    }
   

}
