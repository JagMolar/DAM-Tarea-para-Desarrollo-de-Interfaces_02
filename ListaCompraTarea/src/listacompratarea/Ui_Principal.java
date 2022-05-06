/********************************************************************************
 ** Form generated from reading ui file 'vistaPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package listacompratarea;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Principal implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QGridLayout gridLayout_2;
    public QWidget generalwidget;
    public QGridLayout gridLayout;
    public QWidget tablewidget;
    public QGridLayout gridLayout_3;
    public QTableWidget tableAnadirWidget;
    public QWidget widgetSeleccion;
    public QGridLayout gridLayout_4;
    public QPushButton printButton;
    public QPushButton borrarAllButton;
    public QPushButton borrarSelButton;
    public QPushButton anadirButton;
    public QLabel listatxtLbl;
    public QMenuBar menubar;
    public QStatusBar statusbar;

    public Ui_Principal() { super(); }

    public void setupUi(QMainWindow Principal)
    {
        Principal.setObjectName("Principal");
        Principal.resize(new QSize(714, 361).expandedTo(Principal.minimumSizeHint()));
        QFont font = new QFont();
        font.setFamily("Century Gothic");
        font.setBold(false);
        font.setWeight(50);
        Principal.setFont(font);
        Principal.setWindowIcon(new QIcon(new QPixmap("classpath:listacompratarea/img/icono-carro.png")));
        centralwidget = new QWidget(Principal);
        centralwidget.setObjectName("centralwidget");
        gridLayout_2 = new QGridLayout(centralwidget);
        gridLayout_2.setObjectName("gridLayout_2");
        generalwidget = new QWidget(centralwidget);
        generalwidget.setObjectName("generalwidget");
        generalwidget.setEnabled(true);
        gridLayout = new QGridLayout(generalwidget);
        gridLayout.setObjectName("gridLayout");
        tablewidget = new QWidget(generalwidget);
        tablewidget.setObjectName("tablewidget");
        gridLayout_3 = new QGridLayout(tablewidget);
        gridLayout_3.setObjectName("gridLayout_3");
        tableAnadirWidget = new QTableWidget(tablewidget);
        tableAnadirWidget.setObjectName("tableAnadirWidget");
        QFont font1 = new QFont();
        font1.setFamily("Century Gothic");
        tableAnadirWidget.setFont(font1);
        tableAnadirWidget.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        tableAnadirWidget.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Sunken);
        tableAnadirWidget.setLineWidth(2);
        tableAnadirWidget.setColumnCount(5);

        gridLayout_3.addWidget(tableAnadirWidget, 0, 0, 1, 1);


        gridLayout.addWidget(tablewidget, 1, 0, 1, 1);

        widgetSeleccion = new QWidget(generalwidget);
        widgetSeleccion.setObjectName("widgetSeleccion");
        gridLayout_4 = new QGridLayout(widgetSeleccion);
        gridLayout_4.setObjectName("gridLayout_4");
        printButton = new QPushButton(widgetSeleccion);
        printButton.setObjectName("printButton");
        QFont font2 = new QFont();
        font2.setFamily("Century Gothic");
        font2.setPointSize(10);
        font2.setBold(true);
        font2.setWeight(75);
        printButton.setFont(font2);

        gridLayout_4.addWidget(printButton, 4, 0, 1, 1);

        borrarAllButton = new QPushButton(widgetSeleccion);
        borrarAllButton.setObjectName("borrarAllButton");
        QFont font3 = new QFont();
        font3.setFamily("Century Gothic");
        font3.setPointSize(10);
        font3.setBold(true);
        font3.setWeight(75);
        borrarAllButton.setFont(font3);

        gridLayout_4.addWidget(borrarAllButton, 3, 0, 1, 1);

        borrarSelButton = new QPushButton(widgetSeleccion);
        borrarSelButton.setObjectName("borrarSelButton");
        QFont font4 = new QFont();
        font4.setFamily("Century Gothic");
        font4.setPointSize(10);
        font4.setBold(true);
        font4.setWeight(75);
        borrarSelButton.setFont(font4);

        gridLayout_4.addWidget(borrarSelButton, 2, 0, 1, 1);

        anadirButton = new QPushButton(widgetSeleccion);
        anadirButton.setObjectName("anadirButton");
        QFont font5 = new QFont();
        font5.setFamily("Century Gothic");
        font5.setPointSize(10);
        font5.setBold(true);
        font5.setWeight(75);
        anadirButton.setFont(font5);
        anadirButton.setIcon(new QIcon(new QPixmap("classpath:listacompratarea/img/logo-carro.png")));

        gridLayout_4.addWidget(anadirButton, 1, 0, 1, 1);


        gridLayout.addWidget(widgetSeleccion, 1, 1, 1, 1);

        listatxtLbl = new QLabel(generalwidget);
        listatxtLbl.setObjectName("listatxtLbl");
        QFont font6 = new QFont();
        font6.setFamily("Century Gothic");
        font6.setPointSize(10);
        font6.setBold(true);
        font6.setWeight(75);
        listatxtLbl.setFont(font6);
        listatxtLbl.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        gridLayout.addWidget(listatxtLbl, 0, 0, 1, 2);


        gridLayout_2.addWidget(generalwidget, 0, 0, 1, 1);

        Principal.setCentralWidget(centralwidget);
        menubar = new QMenuBar(Principal);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 714, 23));
        Principal.setMenuBar(menubar);
        statusbar = new QStatusBar(Principal);
        statusbar.setObjectName("statusbar");
        Principal.setStatusBar(statusbar);
        retranslateUi(Principal);
        borrarAllButton.clicked.connect(tableAnadirWidget, "clear()");

        Principal.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow Principal)
    {
        Principal.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Principal", null));
        tableAnadirWidget.clear();
        tableAnadirWidget.setColumnCount(5);

        QTableWidgetItem __colItem = new QTableWidgetItem();
        __colItem.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "X", null));
        tableAnadirWidget.setHorizontalHeaderItem(0, __colItem);

        QTableWidgetItem __colItem1 = new QTableWidgetItem();
        __colItem1.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Cantidad", null));
        tableAnadirWidget.setHorizontalHeaderItem(1, __colItem1);

        QTableWidgetItem __colItem2 = new QTableWidgetItem();
        __colItem2.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Nombre", null));
        tableAnadirWidget.setHorizontalHeaderItem(2, __colItem2);

        QTableWidgetItem __colItem3 = new QTableWidgetItem();
        __colItem3.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Secci\u00f3n", null));
        tableAnadirWidget.setHorizontalHeaderItem(3, __colItem3);

        QTableWidgetItem __colItem4 = new QTableWidgetItem();
        __colItem4.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Urgente", null));
        tableAnadirWidget.setHorizontalHeaderItem(4, __colItem4);
        tableAnadirWidget.setRowCount(0);
        tableAnadirWidget.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p>Tabla Lista de Compra</p></body></html>", null));
        printButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p><span style=\" font-weight:400;\">Imprimir</span></p></body></html>", null));
        printButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Imprimir", null));
        borrarAllButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p><span style=\" font-weight:400;\">Borrar Todo</span></p></body></html>", null));
        borrarAllButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Borrar Todo", null));
        borrarSelButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p><span style=\" font-weight:400;\">Borrar Selecci\u00f3n</span></p></body></html>", null));
        borrarSelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Borrar Selecci\u00f3n", null));
        anadirButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p><span style=\" font-weight:400;\">A\u00f1adir producto</span></p></body></html>", null));
        anadirButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "A\u00f1adir", null));
        listatxtLbl.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<html><head/><body><p><span style=\" font-weight:400;\">Panel Principal Lista Compra</span></p></body></html>", null));
        listatxtLbl.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "LISTA DE LA COMPRA", null));
    } // retranslateUi

}

