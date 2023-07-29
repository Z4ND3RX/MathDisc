/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Z4ND3R
 */
public class ControladorTFA {

    public static void factorizacionPrima(int numero) {
        if (numero <= 1) {
            JOptionPane.showMessageDialog(null, "No es aplicable el Teorema Fundamental de la Aritmética.");
            return;
        }

        int numeroOriginal = numero;
        StringBuilder resultado = new StringBuilder();
        Map<Integer, Integer> factoresPrimos = new HashMap<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.put(i, factoresPrimos.getOrDefault(i, 0) + 1);
                numero /= i;
            }
        }

        resultado.append(numeroOriginal).append(" = ");

        for (int factor : factoresPrimos.keySet()) {
            int exponente = factoresPrimos.get(factor);
            resultado.append(factor);

            if (exponente > 1) {
                resultado.append("^").append(exponente);
            }

            resultado.append(" * ");
        }

        resultado.setLength(resultado.length() - 3); // Eliminamos el último " * "
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

}
