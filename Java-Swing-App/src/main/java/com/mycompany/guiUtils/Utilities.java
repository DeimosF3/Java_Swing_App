/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiUtils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author Alumno
 */
public class Utilities {

    static Font fuente1 = new Font("Cascadia Code", Font.BOLD, 13);

    public void setFontRecursively(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof Container) {
                setFontRecursively((Container) component);
            }
            component.setFont(fuente1);
        }
    }
}
