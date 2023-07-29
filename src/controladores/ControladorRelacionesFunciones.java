/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import vistas.VistaRelacionesFunciones;

/**
 *
 * @author Z4ND3R
 */
public class ControladorRelacionesFunciones {

    public enum FunctionType {
        NOT_A_FUNCTION,
        FUNCTION,
        INJECTIVE,
        BIJECTIVE,
        SURJECTIVE
    }
    
    public static boolean hasDuplicateFirstData(List<Map.Entry<String, String>> relation) {
        Set<String> firstElements = new HashSet<>();
        Set<String> secondElements = new HashSet<>();

        for (Map.Entry<String, String> entry : relation) {
            String firstElement = entry.getKey();
            String secondElement = entry.getValue();

            if (firstElements.contains(firstElement) || secondElements.contains(secondElement)) {
                return true; // Se encontró un elemento duplicado
            }

            firstElements.add(firstElement);
            secondElements.add(secondElement);
        }

        return false; // No se encontraron elementos duplicados
    }
    
    public static boolean onlyFirstElementsRepeated(List<Map.Entry<String, String>> relation) {
        Set<String> firstElements = new HashSet<>();

        for (Map.Entry<String, String> entry : relation) {
            String firstElement = entry.getKey();

            if (firstElements.contains(firstElement)) {
                return true; // Se encontró un primer dato repetido
            } else {
                firstElements.add(firstElement);
            }
        }

        return false; // Todos los primeros datos son únicos
    }
    
    
    public static StringBuilder mostrarRelaciones(Set<String> conjuntoA, Set<String> conjuntoB) {
        List<List<String>> productoCartesiano = new ArrayList<>();

        for (String elementoA : conjuntoA) {
            for (String elementoB : conjuntoB) {
                List<String> parOrdenado = new ArrayList<>();
                parOrdenado.add(elementoA);
                parOrdenado.add(elementoB);
                productoCartesiano.add(parOrdenado);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("El producto cartesiano de A x B está conformado por las siguientes parejas o pares ordenados:\n");
        sb.append("A x B = {");
        for (int i = 0; i < productoCartesiano.size(); i++) {
            List<String> parOrdenado = productoCartesiano.get(i);
            sb.append("(").append(parOrdenado.get(0)).append(", ").append(parOrdenado.get(1)).append(")");
            if (i < productoCartesiano.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}\n");

        // Generar todas las relaciones
        int numRelaciones = (int) Math.pow(2, productoCartesiano.size());
        int numRelacion = 1;
        for (int i = 0; i < numRelaciones; i++) {
            Set<String> elementosA = new HashSet<>();
            boolean repetido = false;
            for (int j = 0; j < productoCartesiano.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    List<String> parOrdenado = productoCartesiano.get(j);
                    if (!elementosA.add(parOrdenado.get(0))) {
                        repetido = true;
                        break;
                    }
                }
            }
            if (!repetido && elementosA.size() == conjuntoA.size()) {
                sb.append("R").append(numRelacion).append(" = {");
                for (int j = 0; j < productoCartesiano.size(); j++) {
                    if ((i & (1 << j)) != 0) {
                        List<String> parOrdenado = productoCartesiano.get(j);
                        sb.append("(").append(parOrdenado.get(0)).append(", ").append(parOrdenado.get(1)).append(")");
                        if (j < productoCartesiano.size() - 1) {
                            sb.append(", ");
                        }
                    }
                }
                sb.append("}\n");
                numRelacion++;
            }
        }

        return sb;
    }
    


    public static void checkFunctionType(Set<String> domain, Set<String> codomain, List<Map.Entry<String, String>> relation) {
        Set<String> mappedDomainElements = new HashSet<>();
        Set<String> mappedCodomainElements = new HashSet<>();

        for (Map.Entry<String, String> entry : relation) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Check if the domain and codomain elements are valid
            if (!domain.contains(key) || !codomain.contains(value)) {
                JOptionPane.showMessageDialog(null,"La relación no es una función.");
                return;
            }

            // Add the element to the mapped domain and codomain sets
            mappedDomainElements.add(key);
            mappedCodomainElements.add(value);
        }

        if (mappedDomainElements.size() != domain.size()) {
            JOptionPane.showMessageDialog(null,"La relación no es una función.");
            return;
        }
        Boolean noFunction = onlyFirstElementsRepeated(relation);
        if(noFunction){
            JOptionPane.showMessageDialog(null,"La relación no es una función.");
            return;
        }
        
        Boolean surjective = hasDuplicateFirstData(relation);
        
        if(surjective){
            JOptionPane.showMessageDialog(null,"La función es sobreyectiva (sobre).");
            return;
        }
        
        // Check if the function is surjective
        if (mappedCodomainElements.size() == codomain.size()) {
            //return FunctionType.SURJECTIVE;
        }

        // Check if the function is bijective
        if (mappedDomainElements.size() == domain.size() && mappedCodomainElements.size() == codomain.size()) {
            JOptionPane.showMessageDialog(null,"La función es biyectiva (uno a uno y sobre).");
            return;
        }

        

        // Check if the function is injective
        JOptionPane.showMessageDialog(null,"La función es inyectiva (uno a uno).");
        return;
    }

}
