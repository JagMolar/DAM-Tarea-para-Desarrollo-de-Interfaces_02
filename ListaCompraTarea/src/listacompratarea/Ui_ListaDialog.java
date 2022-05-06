/********************************************************************************
 ** Form generated from reading ui file 'listaDialog.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package listacompratarea;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ListaDialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QGridLayout gridLayoutDialog;
    public QWidget dialogwidget;
    public QGridLayout gridLayoutListDialog;
//    public QListView listadolListView;
    public QListWidget listadoWidget;
    public QDialogButtonBox buttonBox;

    public Ui_ListaDialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(478, 391).expandedTo(Dialog.minimumSizeHint()));
        QFont font = new QFont();
        font.setFamily("Century Gothic");
        Dialog.setFont(font);
        Dialog.setWindowIcon(new QIcon(new QPixmap("classpath:listacompratarea/img/icono-carro.png")));
        gridLayoutDialog = new QGridLayout(Dialog);
        gridLayoutDialog.setObjectName("gridLayoutDialog");
        dialogwidget = new QWidget(Dialog);
        dialogwidget.setObjectName("dialogwidget");
        gridLayoutListDialog = new QGridLayout(dialogwidget);
        gridLayoutListDialog.setObjectName("gridLayoutListDialog");
//        listadolListView = new QListView(dialogwidget);
//        listadolListView.setObjectName("listadolListView");
        listadoWidget = new QListWidget(dialogwidget);
        listadoWidget.setObjectName("listadoWidget");
        QFont font1 = new QFont();
        font1.setFamily("Century Gothic");
        listadoWidget.setFont(font1);

        gridLayoutListDialog.addWidget(listadoWidget, 0, 0, 1, 1);
//        gridLayoutListDialog.addWidget(listadolListView, 0, 0, 1, 1);


        gridLayoutDialog.addWidget(dialogwidget, 0, 0, 1, 1);

        buttonBox = new QDialogButtonBox(Dialog);
        buttonBox.setObjectName("buttonBox");
        buttonBox.setOrientation(com.trolltech.qt.core.Qt.Orientation.Horizontal);
        buttonBox.setStandardButtons(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.createQFlags(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Cancel,com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Ok));

        gridLayoutDialog.addWidget(buttonBox, 1, 0, 1, 1);

        retranslateUi(Dialog);
        buttonBox.accepted.connect(Dialog, "accept()");
        buttonBox.rejected.connect(Dialog, "reject()");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "LISTA DE LA COMPRA", null));
    } // retranslateUi

}