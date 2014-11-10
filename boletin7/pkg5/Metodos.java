/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class Metodos {

    double num1, num2, num3;

    public Metodos() {

    }

    public double getNum1() {
        String numero = JOptionPane.showInputDialog("Introduce el numero 1: ");
        double num = Double.valueOf(numero);
        return num;
    }

    public double getNum2() {
        String numero = JOptionPane.showInputDialog("Introduce el numero 2: ");
        double num = Double.valueOf(numero);
        return num;
    }

    public double getNum3() {
        String numero = JOptionPane.showInputDialog("Introduce el numero 3: ");
        double num = Double.valueOf(numero);
        return num;
    }

    public void compararNum(double num1, double num2, double num3) {

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es el: " + num1);
        }else
            if (num2 > num1 && num2 > num3) {
                        JOptionPane.showMessageDialog(null, "El numero mayor es el: " + num2);
                    } else if (num3 > num1 && num3 > num2) {
                        JOptionPane.showMessageDialog(null, "El numero mayor es el: " + num3);
                    } else {
                        
                    }
        }

    }

