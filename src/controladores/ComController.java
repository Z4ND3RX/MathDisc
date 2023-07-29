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
 * @author Z4ND3R
 */
public class ComController {

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

    public static void obtenerCombinaciones(List<Character> conjunto, int longitudCombinacion) {
        List<String> combinaciones = new ArrayList<>();
        generarCombinaciones("", conjunto, longitudCombinacion, combinaciones);
        StringBuilder mensaje = new StringBuilder();
        mensaje.append(combinaciones);
        mostrarMensaje(mensaje);
    }

    private static void generarCombinaciones(String combinacionActual, List<Character> conjunto,
                                             int longitudCombinacion, List<String> combinaciones) {
        if (combinacionActual.length() == longitudCombinacion) {
            combinaciones.add(combinacionActual);
            return;
        }

        for (int i = 0; i < conjunto.size(); i++) {
            char elemento = conjunto.get(i);
            List<Character> nuevoConjunto = new ArrayList<>(conjunto);
            nuevoConjunto.remove(i);
            generarCombinaciones(combinacionActual + elemento, nuevoConjunto, longitudCombinacion, combinaciones);
        }
    }

}
