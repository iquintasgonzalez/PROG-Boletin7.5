/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg5;

/**
 *
 * @author Omar
 */
public class Boletin75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2,num3;
    
       Metodos numero = new Metodos();
       num1 = numero.getNum1();
       num2 = numero.getNum2();
       num3 = numero.getNum3();
       numero.compararNum(num1,num2,num3);
       
    
}
}
