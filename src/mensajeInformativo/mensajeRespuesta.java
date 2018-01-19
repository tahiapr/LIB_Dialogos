/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeInformativo;

import javax.swing.JOptionPane;

/**
 * Esta clase es para que aparezca un mensaje y abajo un cuadro de diálogo donde
 * el usuario debe escribir una respuesta
 *
 * @author tperezrodriguez
 */
public class mensajeRespuesta {
        
    /**
     * Este dialogo mostrará un texto y debajo un cuadro de diálogo en el que 
     * el usuario tendrá que escribir su respuesta
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @return es la respuesta del usuario
     */
    public static String mensajeRespuesta (String diag) {
        String resp = JOptionPane.showInputDialog(diag);
        return resp;
    }
    
    /**
     * Este dialogo mostrará un texto y debajo un cuadro de diálogo en el que 
     * el usuario tendrá que escribir su respuesta
     * Además podrá escribir un segundo mensaje dentro del propio cuadro de
     * diálogo
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @param diag2 es la variable donde el usuario mete un segundo mensaje dentro del cuadro de texto
     * @return es la respuesta del usuario
     */
    public static String mensajeRespuestaDoble (String diag, String diag2) {
        String resp = JOptionPane.showInputDialog(diag, diag2);
        return resp;
    }
    
    /**
     * Este dialogo mostrará un texto y debajo un cuadro de diálogo en el que 
     * el usuario tendrá que escribir su respuesta
     * Además podrá escribir un segundo mensaje dentro del propio cuadro de
     * diálogo
     * La diferencia con el primero es que hay un componente padre en el que
     * ubicamos el Input
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @return es la respuesta del usuario
     */
    public static String mensajeRespuestaComponente (String diag) {
        String resp = JOptionPane.showInputDialog(null, diag);
        return resp;
    }
    
        /**
     * Este dialogo mostrará un texto y debajo un cuadro de diálogo en el que 
     * el usuario tendrá que escribir su respuesta
     * También le añadimos un título al mensaje de usuario y colocamos el 
     * icono de error por defecto
     *
     * @param diag es la variable donde el usuario escribe su mensaje
     * @param titulo es la variable donde el usuario escribe un título
     * @return es la respuesta del usuario
     */
    public static String mensajeRespuestaError(String diag, String titulo) {
        String resp = JOptionPane.showInputDialog(null, diag, titulo, JOptionPane.ERROR_MESSAGE);
        return resp;
    }
}
