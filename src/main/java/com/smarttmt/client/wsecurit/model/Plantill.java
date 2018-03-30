/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smarttmt.client.wsecurit.model;

import java.io.Serializable;

/**
 * Se manejan las caracteristicas del documento html o pdf que se va a firmar a
 * traves del API.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class Plantill implements Serializable {

    /**
     * El campo name contiene el nombre del documento que se desesa firmar.
     * Este parametro es de nivel informativo.
     */
    private String name;
    
    /**
     * Este Parámetro contiene el html con la información la 
     * cual se utilizara para generar el documento integro.
     * Nota: en caso de usar este parámetro no se debe de utilizar el parámetro 
     * “codefile “.
     */
    private String html;
    
    /**
     * Este Parámetro contiene nombre del PDF previamente 
     * cargado con el cual se construirá el documento integro.
     * Nota 1: el nombre de este PDF se debe de construir con un serial único e
     * irrepetible.
     * Nota 2: en caso de usar este parámetro no se debe de utilizar el parámetro
     * “html “.
     */
    
    private String codeFile;

    /**
     * 
     * @return el nombre del documento que desea firmar.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name se usa para cambiar el nombre del documento que se desea firmar.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return el html con la informacion que se utilizara para generar el 
     *         documento firmado de manera integra.
     */
    public String getHtml() {
        return html;
    }

    /**
     * @param html cambiar el documento html que se va a firmar. No llenar 
     *        si se va a utilizar formato PDF.  
     */
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * @return retorna el nombre del documento previamente cargado.
     */
    public String getCodeFile() {
        return codeFile;
    }

    /**
     * @param codeFile se usa para cambiar el valor del nombre del documento.
     */
    public void setCodeFile(String codeFile) {
        this.codeFile = codeFile;
    }

    /**
     * Metodo para presentar todo de los campos de la clase.
     * @return una cadena con los valores de todos los campos.
     */
    @Override
    public String toString() {
        return "Plantill{" + "name=" + name + ", html=" + html + ", codeFile=" + codeFile + '}';
    }
    
    
    

}
