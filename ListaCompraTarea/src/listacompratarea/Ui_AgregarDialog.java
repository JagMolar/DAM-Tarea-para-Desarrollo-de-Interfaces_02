/********************************************************************************
 ** Form generated from reading ui file 'AgregarDialog.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package listacompratarea;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_AgregarDialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QGridLayout gridLayout_2;
    public QPushButton cancelarButton;
    public QGroupBox ListaGroupBox;
    public QGridLayout gridLayout;
    public QLabel cantidadLabel;
    public QLabel seccionLabel;
    public QLabel nombreLabel;
    public QSpinBox cantidadSpinBox;
    public QCheckBox urgenteCheckBox;
    public QComboBox SeccionComboBox;
    public QLineEdit nombreLineEdit;
    public QLabel urgenteLabel;
    public QPushButton agregarButton;

    public Ui_AgregarDialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(365, 211).expandedTo(Dialog.minimumSizeHint()));
        QFont font = new QFont();
        font.setFamily("Century Gothic");
        Dialog.setFont(font);
        Dialog.setWindowIcon(new QIcon(new QPixmap("classpath:listacompratarea/img/icono-carro.png")));
        gridLayout_2 = new QGridLayout(Dialog);
        gridLayout_2.setObjectName("gridLayout_2");
        cancelarButton = new QPushButton(Dialog);
        cancelarButton.setObjectName("cancelarButton");

        gridLayout_2.addWidget(cancelarButton, 1, 1, 1, 1);

        ListaGroupBox = new QGroupBox(Dialog);
        ListaGroupBox.setObjectName("ListaGroupBox");
        gridLayout = new QGridLayout(ListaGroupBox);
        gridLayout.setObjectName("gridLayout");
        cantidadLabel = new QLabel(ListaGroupBox);
        cantidadLabel.setObjectName("cantidadLabel");

        gridLayout.addWidget(cantidadLabel, 0, 0, 1, 1);

        seccionLabel = new QLabel(ListaGroupBox);
        seccionLabel.setObjectName("seccionLabel");

        gridLayout.addWidget(seccionLabel, 2, 0, 1, 1);

        nombreLabel = new QLabel(ListaGroupBox);
        nombreLabel.setObjectName("nombreLabel");

        gridLayout.addWidget(nombreLabel, 1, 0, 1, 1);

        cantidadSpinBox = new QSpinBox(ListaGroupBox);
        cantidadSpinBox.setObjectName("cantidadSpinBox");
        QFont font1 = new QFont();
        font1.setBold(false);
        font1.setWeight(50);
        cantidadSpinBox.setFont(font1);

        gridLayout.addWidget(cantidadSpinBox, 0, 1, 1, 1);

        urgenteCheckBox = new QCheckBox(ListaGroupBox);
        urgenteCheckBox.setObjectName("urgenteCheckBox");
        QFont font2 = new QFont();
        font2.setBold(false);
        font2.setWeight(50);
        urgenteCheckBox.setFont(font2);

        gridLayout.addWidget(urgenteCheckBox, 3, 1, 1, 1);

        SeccionComboBox = new QComboBox(ListaGroupBox);
        SeccionComboBox.setObjectName("SeccionComboBox");
        QFont font3 = new QFont();
        font3.setBold(false);
        font3.setWeight(50);
        SeccionComboBox.setFont(font3);

        gridLayout.addWidget(SeccionComboBox, 2, 1, 1, 1);

        nombreLineEdit = new QLineEdit(ListaGroupBox);
        nombreLineEdit.setObjectName("nombreLineEdit");

        gridLayout.addWidget(nombreLineEdit, 1, 1, 1, 1);

        urgenteLabel = new QLabel(ListaGroupBox);
        urgenteLabel.setObjectName("urgenteLabel");

        gridLayout.addWidget(urgenteLabel, 3, 0, 1, 1);


        gridLayout_2.addWidget(ListaGroupBox, 0, 0, 1, 2);

        agregarButton = new QPushButton(Dialog);
        agregarButton.setObjectName("agregarButton");
        QFont font4 = new QFont();
        font4.setFamily("Century Gothic");
        agregarButton.setFont(font4);

        gridLayout_2.addWidget(agregarButton, 1, 0, 1, 1);

        cantidadLabel.setBuddy(cantidadSpinBox);
        seccionLabel.setBuddy(SeccionComboBox);
        nombreLabel.setBuddy(nombreLineEdit);
        QWidget.setTabOrder(cantidadSpinBox, nombreLineEdit);
        QWidget.setTabOrder(nombreLineEdit, SeccionComboBox);
        QWidget.setTabOrder(SeccionComboBox, urgenteCheckBox);
        QWidget.setTabOrder(urgenteCheckBox, agregarButton);
        QWidget.setTabOrder(agregarButton, cancelarButton);
        retranslateUi(Dialog);
        agregarButton.clicked.connect(Dialog, "accept()");
        cancelarButton.clicked.connect(Dialog, "reject()");

        Dialog.connectSlotsByName();
    } // setupUi
    
    public int getCantidad(){
        return cantidadSpinBox.value();
    }
    
    public String getNombre(){
        return nombreLineEdit.text();
    }
    public String getSeccion(){
        return SeccionComboBox.currentText();
    }
    public String getUrgente(){
        String check="";
        if(urgenteCheckBox.isChecked())
            check = "Urgente";
        return check;
    }
    

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "A\u00f1adir Productos", null));
        cancelarButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pulsar para cancelar", null));
        cancelarButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cancelar", null));
        ListaGroupBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">A\u00f1adir a la lista</span></p></body></html>", null));
        ListaGroupBox.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "A\u00f1adir a la Lista", null));
        cantidadLabel.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">Cantidad</span></p></body></html>", null));
        cantidadLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cantidad", null));
        seccionLabel.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">Seccion</span></p></body></html>", null));
        seccionLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Secci\u00f3n", null));
        nombreLabel.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">nombre</span></p></body></html>", null));
        nombreLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre", null));
        cantidadSpinBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">Indicar cantidad</span></p></body></html>", null));
        urgenteCheckBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Marcar si es urgente</p></body></html>", null));
        urgenteCheckBox.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "(Marcar si es Urgente)", null));
        SeccionComboBox.clear();
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Panader\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pescader\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fruter\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Carnicer\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Charcuter\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Conservas", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Perfumer\u00eda", null));
        SeccionComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "General", null));
        SeccionComboBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Indicar secci\u00f3n donde est\u00e1 el producto</p></body></html>", null));
        nombreLineEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">Indicar nombre producto</span></p></body></html>", null));
        urgenteLabel.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:400;\">urgente</span></p></body></html>", null));
        urgenteLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Urgente", null));
        agregarButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pulsar para a\u00f1adir", null));
        agregarButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
    } // retranslateUi

}

