package com.mycompany.gui;

import com.mycompany.guiUtils.Utilities;

/**
 *
 * @author Alumno
 */
public class programa {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        panell asd = new panell();
        asd.setVisible(true);
        asd.setLocationRelativeTo(null);
        asd.setResizable(false);
        asd.setTitle("Centro de Fauna");
        
        Utilities u = new Utilities();

        u.setFontRecursively(asd.getContentPane());
    }

  
}
