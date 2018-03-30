package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Clase se implementa para obtener la respuesta del API una vez se envie el
 * proceso de firma electronica.
 *

 *
 */
public class SignElre implements Serializable {

    /**
     * code contiene el codigo de la transaccion.
     */
    private String code;
    
    /**
     * Mensaje de la respuesta de la transaccion.
     */
    private String message;

    /**
     * Metodo con el que se obtiene el valor del campo code.
     * @return el valor del campo code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Metodo que se usa para cambiar el valor del codigo.
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Metodo para obtener el mensaje de respuesta del API de firma electronica.
     * @return el mensaje de respuesta del API.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Metodo que se usa para cambiar el mensaje.
     * @param message se usa para cambiar el valor del campo message de la clase. 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Metodo para visualizar el valor de todos los metodos de la clase.
     * @return retonar una cadena con todos los valores de los campos.
     */
    @Override
    public String toString() {
        return "SignElre{" + "code=" + code + ", message=" + message + '}';
    }

}
