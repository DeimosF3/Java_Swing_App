/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java.swing.app;

import com.mycompany.gui.panell;
import com.mycompany.guiUtils.Utilities;

/**
 *
 * @author Alumno
 */
public class JavaSwingApp {

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
