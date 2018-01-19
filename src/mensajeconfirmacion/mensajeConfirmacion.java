/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeconfirmacion;

import javax.swing.JOptionPane;

/**
 * Esta clase es para que aparezca un mensaje de confirmación, ese mensaje
 * tendrá un texto y debajo dos botones donde el usuario podrá escoger entre dos
 * o tres opciones
 *
 * @author tperezrodriguez
 */
public class mensajeConfirmacion {

    /**
     * Este dialogo de confirmación mostrará por default las opciones sí, no y
     * cancelar Devolverá un entero con la opción seleccionada como si
     * estuviéramos en un vector 
     * Si selecionamos sí, retornará un 0 
     * Si seleccionamos no, retornará un 1 
     * Si seleccionamos cancel, retornará un 2
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @return es la respuesta del usuario
     */
    public static int confirmarDialogo(String diag) {
        return JOptionPane.showConfirmDialog(null, diag);
    }

    /**
     * En este método agregamos el título de la ventana Cambiamos también el
     * tipo de selección, tendrá las opciones sí, no y cancelar
     * Los posibles valores son YES_NO_OPTION o YES_NO_CANCEL_OPTION
     *
     * @param diag es la variable en la que se guarda el mensaje que escribe el usuario
     * @param titulo es la variable en la que el usuario escoge un título para su mensaje
     * @return es la respuesta del usuario
     */
    public static int confirmarDialogoSiNoCancel(String diag, String titulo) {
        return JOptionPane.showConfirmDialog(null, diag, titulo, JOptionPane.YES_NO_OPTION);
    }

    /**
     * En este método agregamos un mensaje de error Cambiamos también el tipo de
     * selección, tendrá las opciones sí, no y error. Los posibles valores son
     * YES_NO_OPTION o ERROR_MESSAGE
     *
     * @param diag es la variable en la que se guarda el mensaje que escribe el usuario
     * @param titulo es la variable en la que el usuario escoge un título para su mensaje
     * @return es la respuesta del usuario
     */
    public static int  confirmarDialogoError(String diag, String titulo) {
        return JOptionPane.showConfirmDialog(null, diag, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    }

}
