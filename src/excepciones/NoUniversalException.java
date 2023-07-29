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
public class NoUniversalException extends RuntimeException {

    public NoUniversalException() {
        super("Por favor digite el conjunto universal");
    }

}
