/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author JoseAnguiano
 */
public class JavaApplication16 implements Suma{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("Desde metodo main "+ a+b);
    }

    @Override
    public void miniSuma(int a, int b) {
        System.out.println("Desde interface " + a+b);

    }
    
}
