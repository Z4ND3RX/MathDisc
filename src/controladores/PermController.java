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
public class PermController {

    int particip;
    int winners;
    List<Integer> ciclistas;

    public PermController(int particip, int winners) {
        this.particip = particip;
        this.winners = winners;
        initCic();
    }

    private void initCic() {
        List<Integer> ciclistasList = new ArrayList<>();
        for (int i = 1; i <= particip; i++) {
            ciclistasList.add(i);
        }
        this.ciclistas = ciclistasList;
    }

    public List<List<Integer>> combinar() {
        List<List<Integer>> combinations = new ArrayList<>();

        permutaHelper(this.ciclistas, this.winners, new ArrayList<>(), combinations);

        return combinations;
    }

    private static void permutaHelper(List<Integer> ciclistas, int numPosiciones, List<Integer> currentCombination,
            List<List<Integer>> combinations) {
        if (currentCombination.size() == numPosiciones) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = 0; i < ciclistas.size(); i++) {
            int current = ciclistas.get(i);

            List<Integer> remaining = new ArrayList<>(ciclistas);
            remaining.remove(i);

            currentCombination.add(current);

            permutaHelper(remaining, numPosiciones, currentCombination, combinations);

            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public void print(List<List<Integer>> combinaciones) {
        //int contador = 0;
        // Añade más elementos si lo deseas.
        StringBuilder stringBuilder = new StringBuilder();

        // Contador para llevar la cuenta de los conjuntos de elementos procesados.
        int conjuntosProcesados = 0;

        // Recorre la lista de listas de enteros.
        for (List<Integer> lista : combinaciones) {
            // Agrega la enumeración del conjunto.
            stringBuilder.append(", Conjunto ").append(conjuntosProcesados + 1).append(": ");

            // Agrega los elementos de la lista actual al StringBuilder.
            stringBuilder.append(lista).append("  ");

            // Incrementa el contador de conjuntos procesados.
            conjuntosProcesados++;

            // Agrega un salto de línea después de cada 3 conjuntos (listas) de elementos.
            if (conjuntosProcesados % 8 == 0) {
                stringBuilder.append("\n");
            }
        }
        
        JTextArea textArea = new JTextArea(stringBuilder.toString());
        
        // Agregar el JTextArea al JScrollPane.
        JScrollPane scrollPane = new JScrollPane(textArea);

        int fixedHeight = 400;
        scrollPane.setPreferredSize(
                new java.awt.Dimension(scrollPane.getPreferredSize().width, fixedHeight));
        // Mostrar el JOptionPane con el JScrollPane.
        JOptionPane.showMessageDialog(
            null,
            scrollPane,
            "Permutaciones",
            JOptionPane.INFORMATION_MESSAGE
        );

    }

}
