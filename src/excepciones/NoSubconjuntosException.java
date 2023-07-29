/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Z4ND3R
 */
public class NoSubconjuntosException extends RuntimeException {

    public NoSubconjuntosException() {
        super("Debe de añadir y llenar almenos dos subconjuntos");
    }

}
