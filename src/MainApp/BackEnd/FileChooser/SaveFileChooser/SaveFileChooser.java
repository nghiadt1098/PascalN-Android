/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp.BackEnd.FileChooser.SaveFileChooser;

import org.apache.commons.io.FileUtils;
import MainApp.resource.Constant;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author NghiaDTSE05330
 */
public class SaveFileChooser extends JFileChooser {

    public SaveFileChooser() {
        super();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                Constant.sfc_FileFilterDescrition,
                Constant.sfc_fileextension);
        this.setApproveButtonText(Constant.sfc_approvebtntext);
        this.setFileFilter(filter);
        ClassLoader loader = MainApp.MainApplication.class.getClassLoader();
        System.out.println(loader.getResource(""));
        this.setDialogTitle(Constant.sfc_title);
    }

}
