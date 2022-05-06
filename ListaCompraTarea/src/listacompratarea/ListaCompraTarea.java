/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompratarea;

import com.trolltech.qt.gui.QApplication;



/**
 *
 * @author juang <juangmuelas@gmail.com>
 * @since 10/12/2021
 * @version 1
 */
public class ListaCompraTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QApplication.initialize(args);
//        QWidget w = new QWidget();

        /**
         * VISTA DOS ENUNCIADO
         */
        ListaCompra principal = new ListaCompra();
        principal.show();
        QApplication.execStatic();
        QApplication.shutdown();
    }
    
}
