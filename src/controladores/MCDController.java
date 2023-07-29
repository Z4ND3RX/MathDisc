/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Santiago
 */
public class MCDController {
    
    private static StringBuilder mensaje = new StringBuilder();

    public static int encontrarMCD(List<Integer> numeros) {

        int mcd = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            mcd = encontrarMCD(mcd, numeros.get(i));
        }
        mensaje.append("\nPor tanto, el MCD de los " + numeros.size() + " números es: " + mcd);
        mostrarMensaje(mensaje);
        return mcd;
    }

    public static int encontrarMCD(int num1, int num2) {
        // Asegurarse de que num1 sea el número más grande
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int originalNum1 = num1;
        int originalNum2 = num2;
        
        mensaje.append("\nOperaciones para encontrar el MCD de " + originalNum1 + " y " + originalNum2 + ":\n");

        while (num2 != 0) {
            int cociente = num1 / num2;
            int residuo = num1 - cociente * num2;

            mensaje.append(num1 + " = " + num2 + " * " + cociente + " + " + residuo + "\n");

            num1 = num2;
            num2 = residuo;
        }

        mensaje.append("El MCD de " + originalNum1 + " y " + originalNum2 + " es: " + num1);
        return num1;
    }
    
    public static void mostrarMensaje(StringBuilder mensaje) {
        JTextArea textArea = new JTextArea(mensaje.toString());

        // Agregar el JTextArea al JScrollPane.
        JScrollPane scrollPane = new JScrollPane(textArea);

        int fixedHeight = 300;
        scrollPane.setPreferredSize(
                new java.awt.Dimension(scrollPane.getPreferredSize().width, fixedHeight));
        // Mostrar el JOptionPane con el JScrollPane.
        JOptionPane.showMessageDialog(
                null,
                scrollPane,
                "Disposiciones líneales",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
