/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Z4ND3R
 */
public class ControladorConjuntos {

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

    public void obtenerSubconjuntos(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            Set<Character> conjunto = conjuntos.get(i);
            mensaje.append("Pertenencias del Conjunto ").append(i + 1).append(": ").append(conjunto).append("\n");
            for (int j = 0; j < conjuntos.size(); j++) {
                if (j != i) {
                    Set<Character> otroConjunto = conjuntos.get(j);
                    mensaje.append("¿El conjunto ").append(j + 1).append(" (").append(otroConjunto).append(") es subconjunto del conjunto ")
                            .append(i + 1).append(" (").append(conjunto).append(") ?: ").append(conjunto.containsAll(otroConjunto)).append("\n");
                }
            }
        }
        mostrarMensaje(mensaje);
    }
    
    public void obtenerSubconjuntosPropios(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            Set<Character> conjunto = conjuntos.get(i);
            mensaje.append("Pertenencias del Conjunto ").append(i + 1).append(": ").append(conjunto).append("\n");
            for (int j = 0; j < conjuntos.size(); j++) {
                if (j != i) {
                    Set<Character> otroConjunto = conjuntos.get(j);
                    mensaje.append("¿El conjunto ").append(j + 1).append(" (").append(otroConjunto).append(") es subconjunto propio del conjunto ")
                            .append(i + 1).append(" (").append(conjunto).append(") ?: ").append(!conjunto.equals(otroConjunto) && conjunto.containsAll(otroConjunto)).append("\n");
                }
            }
        }
        mostrarMensaje(mensaje);
    }

    //Método para separar subconjuntos
    public static Set<Set<Character>> obtenerSubconjuntos(Set<Character> conjunto) {
        Set<Set<Character>> subconjuntos = new HashSet<>();
        int n = conjunto.size();
        int numSubconjuntos = 1 << n; // 2^n
        Character[] elementos = conjunto.toArray(new Character[0]);
        for (int i = 0; i < numSubconjuntos; i++) {
            Set<Character> subconjunto = new HashSet<>();
            int mask = 1;
            for (int j = 0; j < n; j++) {
                if ((i & mask) != 0) {
                    subconjunto.add(elementos[j]);
                }
                mask <<= 1;
            }
            subconjuntos.add(subconjunto);
        }
        return subconjuntos;
    }

    //Método para hallar conjuntoPotencia
    public static void conjuntoPotencia(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < conjuntos.size(); i++) {
            Set<Character> conjunto = conjuntos.get(i);

            mensaje.append("\nConjunto ").append(i + 1).append(": ").append(conjunto)
                    .append("\nConjunto Potencia:").append("\n");

            for (Set<Character> subconjunto : obtenerConjuntoPotencia(conjunto)) {
                mensaje.append("  ").append(subconjunto).append("\n");
            }
        }
        mostrarMensaje(mensaje);
    }

    public static Set<Set<Character>> obtenerConjuntoPotencia(Set<Character> conjunto) {
        Set<Set<Character>> conjuntoPotencia = obtenerSubconjuntos(conjunto);
        return conjuntoPotencia;
    }
    
    public static void unionTotal(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            for (int j = i + 1; j < conjuntos.size(); j++) {
                Set<Character> conjuntoA = conjuntos.get(i);
                Set<Character> conjuntoB = conjuntos.get(j);
                mensaje.append("Unión entre Conjunto ").append(i + 1).append(" (").append(conjuntoA).append(") y Conjunto ")
                        .append(j + 1).append(" (").append(conjuntoB).append("):\n").append(union(conjuntoA, conjuntoB)).append("\n");
            }
        }
        mostrarMensaje(mensaje);
    }

    public static Set<Character> union(Set<Character> conjuntoA, Set<Character> conjuntoB) {
        Set<Character> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        return union;
    }
    
    public static void interseccionTotal(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            for (int j = i + 1; j < conjuntos.size(); j++) {
                Set<Character> conjuntoA = conjuntos.get(i);
                Set<Character> conjuntoB = conjuntos.get(j);
                mensaje.append("Intersección entre Conjunto ").append(i + 1).append(" (").append(conjuntoA).append(") y Conjunto ")
                        .append(j + 1).append(" (").append(conjuntoB).append("):\n").append(interseccion(conjuntoA, conjuntoB)).append("\n");
            }
        }
        mostrarMensaje(mensaje);
    }

    public static Set<Character> interseccion(Set<Character> conjuntoA, Set<Character> conjuntoB) {
        Set<Character> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);
        return interseccion;
    }
    
    public static void diferenciaSimetricaTotal(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            for (int j = 0; j < conjuntos.size(); j++) {
                Set<Character> conjuntoA = conjuntos.get(i);
                Set<Character> conjuntoB = conjuntos.get(j);
                mensaje.append("Diferencia simétrica entre Conjunto  ").append(i + 1).append(" (").append(conjuntoA).append(") y Conjunto ")
                        .append(j + 1).append(" (").append(conjuntoB).append("):\n").append(diferenciaSimetrica(conjuntoA, conjuntoB)).append("\n");
            }
        }
        mostrarMensaje(mensaje);
    }

    public static Set<Character> diferenciaSimetrica(Set<Character> conjuntoA, Set<Character> conjuntoB) {
        Set<Character> diferenciaSimetrica = new HashSet<>(conjuntoA);
        diferenciaSimetrica.addAll(conjuntoB);

        Set<Character> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);

        diferenciaSimetrica.removeAll(interseccion);
        return diferenciaSimetrica;
    }

    public static void complementoUniversal(List<Set<Character>> conjuntos, Set<Character> conjuntoUniversal) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            mensaje.append("Complemento del Conjunto ").append(i + 1).append(" ").append(conjuntos.get(i)).append(" respecto al Conjunto Universal: \n")
                    .append(complementoRelativo(conjuntos.get(i), conjuntoUniversal)).append("\n");
        }
        mostrarMensaje(mensaje);
    }

    public static void complementoRelativoTotal(List<Set<Character>> conjuntos) {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < conjuntos.size(); i++) {
            for (int j = 0; j < conjuntos.size(); j++) {
                Set<Character> conjuntoA = conjuntos.get(i);
                Set<Character> conjuntoB = conjuntos.get(j);
                mensaje.append("Complemento relativo del Conjunto ").append(i + 1).append(" (").append(conjuntoA).append(") respecto al Conjunto ")
                        .append(j + 1).append(" (").append(conjuntoB).append("):\n").append(complementoRelativo(conjuntoA, conjuntoB)).append("\n");
            }
        }
        mostrarMensaje(mensaje);
    }

    public static Set<Character> complementoRelativo(Set<Character> conjuntoA, Set<Character> conjuntoB) {
        Set<Character> complementoRelativo = new HashSet<>(conjuntoB);
        complementoRelativo.removeAll(conjuntoA);
        return complementoRelativo;
    }

}
