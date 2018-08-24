package ar.com.ventas;

import ar.com.ventas.vista.Menu;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clase principal que inicia la aplicación
 *
 * @author Martín Manganiello
 */
public class Principal {

    /**
     * Método encargado de iniciar la aplicación
     *
     * @param args lista de parámetros del método main
     */
    public static void main(String[] args) {
        lookAndFeel();
        /*
        Menu menu = new Menu();
        menu.setVisible(true);
        Estas dos lineas son equivalentes a la linea 29*/
        new Menu().setVisible(true);
    }

    /**
     * Establece el aspecto de la interfaz gráfica
     *
     */
    private static void lookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
