/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.FrontEnd.MainFrame.MenuBar.FileMenu.FileMenuItem.CustomFileMenuItem;

import MainApp.BackEnd.Utils.ImageUtils;
import MainApp.FrontEnd.MainFrame.Editor.CodeEditor;
import MainApp.resource.Constant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author NghiaDTSE05330
 */
public class CustomOpenFileItem extends JMenuItem implements ActionListener {

    public CustomOpenFileItem() {
        super(Constant.filemenu_openFile);
        this.setIcon(ImageUtils.getScaledIco(Constant.filemenu_icOpenFile, 20, 20));
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CodeEditor.getInstance().openFile();
    }

}
