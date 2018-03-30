package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Esta clase contiene los campos para almacenar la respuesta del consumo
 * del api consultar transaccion.
 * 
 * @author desarrollo001
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class TranResp implements Serializable {
    
    /**
     * ID de la transaccion.
     */
    private String id;
    
    /**
     * Se obtiene informacion sobre que genero esta respuesta.
     * Ejemplo autorizacion.
     */
    private String product;
    
    /**
     * Fecha en que se genro la transaccion.
     */
    private String date;
    
    /**
     * Detalle de la transaccion.
     */
    private Detail detail;

    /**
     * @return El ID de la transaccion.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id se usa para cambiar el ID de la transaccion.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return retorna informacion acerca de que genero la respuesta.
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product se usa para cambiar informacion de que produjo la respuesta.
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return la fecha de la transaccion.
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date se usa para cambiar el valo de la fecha de la transaccion.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return el detalle de la transaccion.
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * @param detail se usa para cambiar el valor del detalle de la transaccion.
     */
    public void setDetail(Detail detail) {
        this.detail = detail;
    }
    
    
    
    
}
