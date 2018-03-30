package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Cuando se consume el API consultar transaccion este tiene un detalle de la
 * transaccion para esto se construye esta clase.
 *
 * @author desarrollo001
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class Detail implements Serializable {

    /**
     * El campo phone almacena al numero de telefono celular que se usa para el
     * proceso de la firma.
     */
    private String phone;
    /**
     * El campo state se usa para informar el estado de la transaccion en
     * determinado momento del proceso de firma.
     */
    private String state;

    /**
     * El campo creOnUtc se usa para informar la fecha en que se inicio con el
     * proceso de la firma.
     */
    private String creOnUtc;

    /**
     * El campo message se usa para almacenar informacion varia sobre la
     * transaccion. como el codigo otp, correo electronico diligenciado en el
     * proceso, el nombre de quien firma, etc....
     */
    private String message;

    /**
     * El campo path guarda la ruta o PATH en donde esta almacenada la
     * evidencia(audio) en formato.wav donde se escucha la vos de la persona
     * quien realiza la firma.
     */
    private String evidence;

    /**
     * El campo dateEvid se usa para almacenar la fecha de la evidencia.
     */
    private String dateEvid;

    /**
     * En el documento tecnico no aparece informacion correspondiente a el
     * proposito de este campo.
     */
    private String opcional;

    /**
     * Se define el constructor por default sin escribir codigo alguno.
     */
    public Detail() {

    }

    /**
     * @return el numero de celular que se usa para la llamada durante el
     *         proceso de firma electronica.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone se usa para cambiar el valor del numero de celular que se
     *        usa para el proceso de firma electronica.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return el estado de la transaccion.
     */
    public String getState() {
        return state;
    }

    /**
     * @param state se usa para cambiar el estado de la transaccion.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return la fecha y hora en que se creo la transaccion.
     */
    public String getCreOnUtc() {
        return creOnUtc;
    }

    /**
     * @param creOnUtc se usa para cambiar la fecha de creacion de la
     *        transaccion.
     */
    public void setCreOnUtc(String creOnUtc) {
        this.creOnUtc = creOnUtc;
    }

    /**
     * @return el mensaje en formato xml con la informacion sobre la
     *         transaccion.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message se usa para actualizar el mensaje.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return El path donde se encuenta la evidencia(audio) en formato wav.
     */
    public String getEvidence() {
        return evidence;
    }

    /**
     * @param evidence se usa para cambiar el path de la evidencia(audio).
     */
    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    /**
     * @return la fecha de la evidencia.
     */
    public String getDateEvid() {
        return dateEvid;
    }

    /**
     * @param dateEvid se usa para cambiar la fecha de evidencia.
     */
    public void setDateEvid(String dateEvid) {
        this.dateEvid = dateEvid;
    }

    /**
     * @return un valor opcional que un no se define exactamente que contiene.
     */
    public String getOpcional() {
        return opcional;
    }

    /**
     * @param opcional se usa para cambiar el valor del campo opcional.
     */
    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    /**
     * Se sobre escribe el metodo toString para otener la informacion relacionada
     * con la clase en un cadena.
     * 
     * @return String una cadena con los valores de los campos de la clase. 
     */
    @Override
    public String toString() {
        return "Detail{" + "phone=" + phone + ", state=" + state + ", creOnUtc=" + creOnUtc 
                + ", message=" + message + ", evidence=" + evidence + ", dateEvid=" 
                + dateEvid + ", opcional=" + opcional + '}';
    }
    
}
