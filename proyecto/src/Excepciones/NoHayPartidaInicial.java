/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Clase para excepciones
 *
 */
public class NoHayPartidaInicial extends Exception {
    /**
     * Envia un mensaje de excepción
     * @param msj mensaje a enviar
     */
    public NoHayPartidaInicial(String msj){
        super(msj);
    }
}
