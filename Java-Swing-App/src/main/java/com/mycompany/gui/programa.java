package com.mycompany.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author Alumno
 */
public class programa {

    static Font fuente1 = new Font("Cascadia Code", Font.BOLD, 13);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        panell asd = new panell();
        asd.setVisible(true);
        asd.setLocationRelativeTo(null);
        asd.setResizable(false);

        setFontRecursively(asd.getContentPane());
    }

    public static void setFontRecursively(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof Container) {
                setFontRecursively((Container) component);
            }
            component.setFont(fuente1);
        }
    }
}
