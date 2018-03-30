package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Este POJO se utiliza para generar el JSON que se manda por metodo POST al
 * Servicio REST dispuesto por WSecurity.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class Authoriz implements Serializable {

    /**
     * parametro contiene el valor con el indicativo del pais + el numero de
     * celular al cual se realizar la llamada. Nota:El valor debe ser un numero
     * telefonico valido y activo.
     */
    private String phone;

    /**
     * Este parametro contiene el codigo de validacion de transaccion. Es
     * opcional 4 digitos.
     */
    private String otp;

    /**
     * Este parametro contiene el mensaje que se recitara en la llamada celular.
     */
    private String welcome;

    /**
     * Idioma que va a usar el sistema al momento de realizar la llamada
     * celular.
     */
    private String language;

    /**
     * Indica si se va a usar biometria. "false" sino se usa. "true" si usa.
     */
    private String bio;

    /**
     * Inidica si se va a relizar validacion de pin. Recibe "false" en caso de
     * no aceptar o "true" si va a aceptar validacion.
     */
    private String pin;

    /**
     * Inidica el modo en que se hara la validacion del codigo otp.
     * "speech"(validacion hablada por celular) "dtmf" (Usara validacion
     * digitada por celular).
     */
    private String mode;

    /**
     * No hay documentacion para este campo.
     */
    private String opcional;
    /**
     * Nombre de la persona que firma.
     */
    private String firmante;

    /**
     * Correo de la persona que firma.
     */
    private String email;

    /**
     * Metodo para obtener el numero de telefono celular. Tipo String.
     * @return Retorna el numero de telefono celular. 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Cambia el numero de telefono.
     * @param phone se usa para cambiar el valor del numero del telefono celular.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Retorna 
     * @return el codigo de validacion de la transaccion.
     */
    public String getOtp() {
        return otp;
    }

    /**
     * @param otp se usa para vambiar el valor del codigo de validacion de la
     *        transaccion.
     */
    public void setOtp(String otp) {
        this.otp = otp;
    }

    /**
     * @return se retorna el mensaje que al momento de la llamada se va a
     *         presentar.
     */
    public String getWelcome() {
        return welcome;
    }

    /**
     * @param welcome se usa para cambiar el mensaje de presentacion en la
     *        llamada.
     */
    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    /**
     * @return el lenguaje con que se realiza la llamada.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language se usa para cambiar el lenguaje de la llamada.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return retona si va a usar biometria o no.
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio se usa para cambiar el valor del campo para indicar si
     *        se usara biometria o no. TRUE o FALSE.
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return permite obtener el valor de la variable pin la cual indica si
     *         se realizara validacion por pin.
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin se usa para cambiar la validacion por pin. TRUE si se acepta
     *        FALSE si no se acepta.
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return el modo en que se validara el codigo otp. “speech” (usara validación
     *         hablada en el celular) o “dtmf” (usara validación digitada en el celular).
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode se usa para cambiar el modo en que el sistema validara el
     *        codigo otp. “speech” (usara validación hablada en el celular)
     *        o “dtmf” (usara validación digitada en el celular).
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return no se tiene documentacion al respecto por lo que no se sabe
     *         que informacion se llegase a manejar en este caso.
     */
    public String getOpcional() {
        return opcional;
    }

    /**
     * @param opcional cambia el valor de campo opcional.
     */
    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    /**
     * @return el nombre de quien firma.
     */
    public String getFirmante() {
        return firmante;
    }

    /**
     * @param firmante cambia el el nombre de quien firma electronicamente.
     */
    public void setFirmante(String firmante) {
        this.firmante = firmante;
    }

    /**
     * @return el correo de la persona quien firma.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email cambia el correo de la persona quien firma.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Se reescribe el metodo toString para obtener en este metodo toda la informacion
     * contenida en el objeto o clase Authoriz.
     * @return retonar una cadena con la informacion de cada campo.
     */
    @Override
    public String toString() {
        return "Authoriz{" + "phone=" + getPhone() + ", otp=" + getOtp() + ", welcome=" + getWelcome()
                + ", language=" + getLanguage() + ", bio=" + getBio() + ", pin=" + getPin() + ", mode=" + getMode()
                + ", opcional=" + getOpcional() + ", firmante=" + getFirmante()
                + ", email=" + getEmail() + '}';
    }

}
