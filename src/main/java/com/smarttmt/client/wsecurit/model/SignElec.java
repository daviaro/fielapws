package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se implementa para enviar los datos al API para
 * proceso de la firma electronica.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class SignElec implements Serializable {

    /**
     * Listado de plantillas en formato html o pdf que se van a firmar.
     */
    private List<Plantill> plantils;

    /**
     * Este campo contiene un listado de los seriales únicos de las
     * transacciones de autorización, las cuales se utilizaran como firma
     * electrónica.
     */
    private List<String> documentos;
    
    /**
     *  Este campo no tiene definido que infomracion va a contener.
     */
    private String opcional;
    
    /**
     * No definido que se va a realizar con este campo.
     */
    private String codeCert;
    
    /**
     * No definido que se va a realizar con este campo.
     */
    private String isNotCer;
    
    /**
     * No definido que s va realizar con este campo.
     */
    private String isNotSta;

    public SignElec() {
        this.plantils = new ArrayList<>();
        this.documentos = new ArrayList<>();
    }

    /**
     * Metodo que retonar in listado de plantillas en formato pdf o html para
     * su fimar.
     * @return lista de plantillas en formato html o pdf para su firma.
     */
    public List<Plantill> getPlantils() {
        return plantils;
    }

    /**
     * Metodo para cambiar el valor del listado de plantillas para firmar.
     * @param plantils the plantils to set
     */
    public void setPlantils(List<Plantill> plantils) {
        this.plantils = plantils;
    }

    /**
     * Metodo para obtener los seriales unicos de autorizacion que se usaran como 
     * firma electronica.
     * @return listadp de seriables unicos.
     */
    public List<String> getDocumentos() {
        return documentos;
    }

    /**
     * Metodo para cambiar el listado de seriales unicos de autorizacion que se
     * usan para firma electronica.
     * @param documentos se usa para cambiar el valor de listado de seriales
     *        unicos.
     */
    public void setDocumentos(List<String> documentos) {
        this.documentos = documentos;
    }

    /**
     * Metodo para retonar el valor opcional el cual no cuenta con documentacion
     * con el proposito del campo.
     * @return no se tiene documentacion al respecto por lo que no se sabe
     *         que informacion se llegase a manejar en este caso.
     */
    public String getOpcional() {
        return opcional;
    }

    /**
     * Metodo para cambiar valor del campo opcional.
     * @param opcional cambia el valor de campo opcional.
     */
    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    /**
     * Metodo para obtene el valor del campo codigo certificado. No se tiene 
     * definido el proposito de este campo en la documentacion.
     * @return el codido del certificado.
     */
    public String getCodeCert() {
        return codeCert;
    }

    /**
     * Metodo para camnbiar el valor del campo Codigo certificcado. 
     * No se tiene definido del todo el proposito de este metodo puesto 
     * que no hay documentacion por parte del proveedor al respecto.
     * 
     * @param codeCert se usa para cambiar el valor del campo codeCert.
     */
    public void setCodeCert(String codeCert) {
        this.codeCert = codeCert;
    }

    /**
     * Metodo que retonar si no es Certificado. No se tiene definido del todo
     * el proposito de este metodo puesto que no hay documentacion por 
     * parte del proveedor al respecto.
     * @return retorna si no esta certificado.
     */
    public String getIsNotCer() {
        return isNotCer;
    }

    /**
     * Metodo se usa para cambiar el estado del campo isNotCer.
     * @param isNotCer se usa para cambiar el estado del campo isNotCer.
     */
    public void setIsNotCer(String isNotCer) {
        this.isNotCer = isNotCer;
    }

    /**
     * Metodo no hay documentacion al respecto.
     * @return the isNotSta retorna el valor del campo isNotSta.
     */
    public String getIsNotSta() {
        return isNotSta;
    }

    /**
     * Metodo que cambia el estado del campo isNotSta. documentacion sobre estos
     * campos no hay clara en la documentacion del proveedor.
     * @param isNotSta se usa para cambiar el estado de la variable isNotSta.
     */
    public void setIsNotSta(String isNotSta) {
        this.isNotSta = isNotSta;
    }

    
    /**
     * Metodo que se usa para presentar los valores de todos los campos que contienen 
     * la clase.
     * @return retorna una cadena con los valores que tienen todos los campos de 
     *         la clase.
     */
    @Override
    public String toString() {
        return "SignElec{" + "plantils=" + plantils + ", documentos=" + documentos 
                + ", opcional=" + opcional + ", codeCert=" + codeCert 
                + ", isNotCer=" + isNotCer + ", isNotSta=" + isNotSta + '}';
    }

    
    
    

}
