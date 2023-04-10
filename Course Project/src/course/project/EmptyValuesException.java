/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.project;

import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class EmptyValuesException extends Exception {
    public EmptyValuesException() {
        JOptionPane.showMessageDialog(null, "Make sure that all the fields are selected!");
    }
}
