/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompratarea;

import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QTableWidgetItem;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author juang <juangmuelas@gmail.com>
 * @since 23/11/2021
 * @version 1
 */
public class ListaCompra extends QMainWindow {
   
    //OBJETO Ui PARA VISTA ENUNCIADO    
    private Ui_Principal ui;
 
    private List<String> items;
    int row;
    int filas = 1;   

    QTableWidgetItem seleccionarItem, cantidadItem, nombreItem, seccionItem, urgenteItem;
    String listado="";
    List<List<String>> list = new ArrayList<List<String>>();


    public ListaCompra() {
        ui= new Ui_Principal();
        ui.setupUi(this);
        ui.anadirButton.clicked.connect(this,"anadir()");
        ui.borrarSelButton.clicked.connect(this,"borrar()");
        ui.borrarAllButton.clicked.connect(this,"borrarTodo()");
        ui.printButton.clicked.connect(this,"imprimir()");
    }
    
    
    void anadir(){       
        //opción 2 enunciado. Añadir dialog
        System.out.println("Vista Añadir datos");
        Ui_AgregarDialog anadir = new Ui_AgregarDialog();
        QDialog dialog = new QDialog();
        
        anadir.setupUi(dialog);
        dialog.show();  
        try {
            if(dialog.exec() == QDialog.DialogCode.Accepted.value()){
                System.out.println("Añadiendo datos");
                String seleccionar="";
                String cantidad="";
                String  nombre="";
                String seccion="";
                String urgente="";
     

                seleccionar = "Seleccionar"; 
                cantidad = Integer.toString(anadir.getCantidad());
                nombre = anadir.getNombre();
                seccion = anadir.getSeccion();                
                urgente = anadir.getUrgente();
                System.out.println("cantidad" + cantidad);


                //Iniciamos el conteo de filas para añadir   
                row = ui.tableAnadirWidget.rowCount();
                ui.tableAnadirWidget.insertRow(row);
      
                //la primera columna mostrará un checkbox
                seleccionarItem = new QTableWidgetItem(seleccionar);
                Qt.ItemFlags flags = seleccionarItem.flags();
                flags.clear(Qt.ItemFlag.ItemIsEditable);
                seleccionarItem.setFlags(flags);
                seleccionarItem.setCheckState(Qt.CheckState.Unchecked);

                //creamos los items con las variables obtenidas
                cantidadItem = new QTableWidgetItem(cantidad);
                nombreItem = new QTableWidgetItem(nombre);
                seccionItem = new QTableWidgetItem(seccion);
                urgenteItem = new QTableWidgetItem(urgente);

                //Añadimos los items
                ui.tableAnadirWidget.setItem(row, 0, seleccionarItem);
                ui.tableAnadirWidget.setItem(row, 1, cantidadItem);
                ui.tableAnadirWidget.setItem(row, 2, nombreItem);
                ui.tableAnadirWidget.setItem(row, 3, seccionItem);
                ui.tableAnadirWidget.setItem(row, 4, urgenteItem); 

                items = new ArrayList<String>();
                items.add(cantidad);
                items.add(nombre);
                items.add(seccion);
                items.add(urgente);

                listado = items.get(0)+" * ".concat(items.get(1))+" * ".concat(items.get(2))+" * ".concat(items.get(3));
                System.out.println(listado);
                //Vamos a añadir las "columnas"
                for(int i = 0; i < items.size(); i++){
                    list.add(new ArrayList<String>());
                }

                //Agregamos los datos que se recojan en la tabla
                list.get(0).add(items.get(0));
                list.get(1).add(items.get(1));
                list.get(2).add(items.get(2));
                list.get(3).add(items.get(3));

                //Mostramos datos ejecución por consola       
                System.out.println("AÑADIR==> seleccionar: "+ seleccionar + " Cantidad: "
                    + cantidad + " Nombre: "+ nombre + " Seccion: "+seccion
                    + " urgente: "+ urgente);
                System.out.println("lista: "+list);
                //        ui.nombreLineEdit.clear();
//        ui.urgenteCheckBox.setCheckState(Qt.CheckState.Unchecked);
            }
            
        } catch (NullPointerException e) {
            System.out.println("Null Pointer: "+ e.getMessage());
        }

    } //fin anadir()
    

    
    void borrar(){
        System.out.println("Borrar");
        //Para comprobar en consola
        String select="";
        //Item a seleccionar
        QTableWidgetItem itemSel;
        try {
            //Recorremos la tabla
            for(int i = 0; i <= ui.tableAnadirWidget.rowCount(); i++){
                //El item será el que esté la fila "i" columna 0
                itemSel = ui.tableAnadirWidget.item(i,0);

                //Si está checkeado
                if(itemSel.checkState() == Qt.CheckState.Checked ){
                    //Recojo el nombre para la consola
                    select= items.get(1);
                    //borrar la fila
                    ui.tableAnadirWidget.removeRow(i);
                    for(int j=0; j < list.size(); j++){
                        if( j ==  i){
                            list.get(i).remove(list.get(i).set(i,items.get(j)));
                        j--;
                        }    
                    } //fin for lista
                //Vuelve a recorrer por si hay más checked
                i--;
                }   
            }//fin for tabla          
        } catch (NullPointerException e){
            //Capturando la excepción
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            System.out.println("Índice fuera de los límites!");
        }
    }//fin borrar()
    
    void borrarTodo(){
        System.out.println("Borrar todo");
        ui.tableAnadirWidget.setRowCount(0);
        list.clear();
                
    }
    
    void imprimir(){
        System.out.println("Vista imprimir");
        Ui_ListaDialog imprimir = new Ui_ListaDialog();
        QDialog dialog = new QDialog();
        
        imprimir.setupUi(dialog);
        dialog.show();
        imprimir.listadoWidget.addItem("LISTA DE LA COMPRA");
        System.out.println(list.size());
        
        for(int i = 0; i <= list.get(0).size()-1 ; i++){
            String lista = ""+list.get(0).get(i)+"\t "+list.get(1).get(i)+"\t "+list.get(2).get(i)+"\t "+list.get(3).get(i);
            System.out.println(list);
            imprimir.listadoWidget.addItem(lista);
//            i++;
        }       
    }//fin imprimir()
}//Fin clase ListaCompra
