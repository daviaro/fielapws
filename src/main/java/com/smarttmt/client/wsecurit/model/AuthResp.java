package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Este POJO se utiliza para obtener la respuesta con el codigo de autorizacion
 * para consumir el resto del API.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class AuthResp implements Serializable {

    /**
     * Este campo se usa para almacenar un serial único de la transacción de
     * confirmación el cual permitirá identificar si el usuario recibió 
     * completamente el mensaje y está de acuerdo con él.
     */
    private String code;

    /**
     * @return el serial unico de transaccion.
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code cambiar el serial unico de la transaccion.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * El metodo toString retorna el contenido de cada uno de los campos de la 
     * clase AuthResp.
     * @return Retorna un cadena con el contenido de los campos.
     */
    @Override
    public String toString() {
        return "AuthResp{" + "code=" + code + '}';
    }

    
}
