/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Santiago
 */
public class DispLinController {

    int startX;
    int startY;
    int endX;
    int endY;

    public DispLinController(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public List<String> calcularDisposicionesLineales() {
        List<String> disposiciones = new ArrayList<>();
        disposicionesLinealesRecursivas(startX, startY, endX, endY, "", disposiciones);
        return disposiciones;
    }

    private static void disposicionesLinealesRecursivas(int x, int y, int puntoFinalX, int puntoFinalY, String disposicionActual,
            List<String> disposiciones) {
        if (x == puntoFinalX && y == puntoFinalY) {
            disposiciones.add(disposicionActual + "(" + x + ", " + y + ")");
            return;
        }

        if (x < puntoFinalX) {
            disposicionesLinealesRecursivas(x + 1, y, puntoFinalX, puntoFinalY, disposicionActual + "" + "(" + x + ", " + y + ")",
                    disposiciones);
        }

        if (y < puntoFinalY) {
            disposicionesLinealesRecursivas(x, y + 1, puntoFinalX, puntoFinalY, disposicionActual + "" + "(" + x + ", " + y + ")",
                    disposiciones);
        }
    }

    public void print(List<String> disposiciones) {
        
        StringBuilder stringBuilder = new StringBuilder();

        // Contador para llevar la cuenta de los conjuntos de elementos procesados.
        int conjuntosProcesados = 0;

        // Recorre la lista de listas de enteros.
        for (String cadena : disposiciones) {
            stringBuilder.append("Disposición ").append(conjuntosProcesados + 1).append(": ");
            stringBuilder.append(cadena).append("  ");

            conjuntosProcesados++;

            if (conjuntosProcesados % 1 == 0) {
                stringBuilder.append("\n");
            }
        }
        
        JTextArea textArea = new JTextArea(stringBuilder.toString());
        
        // Agregar el JTextArea al JScrollPane.
        JScrollPane scrollPane = new JScrollPane(textArea);

        int fixedHeight = 200;
        scrollPane.setPreferredSize(
                new java.awt.Dimension(scrollPane.getPreferredSize().width, fixedHeight));
        // Mostrar el JOptionPane con el JScrollPane.
        JOptionPane.showMessageDialog(
            null,
            scrollPane,
            "Disposiciones líneales",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        ////
        int cont = 1;
        for (String disposicion : disposiciones) {
            System.out.println("DISPOSICIÓN: " + cont++ + disposicion);
        }
    }

}
