package com.smarttmt.client.wsecurit.sign;

import com.smarttmt.client.wsecurit.model.AuthResp;
import com.smarttmt.client.wsecurit.model.Authoriz;
import com.smarttmt.client.wsecurit.model.SignElec;
import com.smarttmt.client.wsecurit.model.SignElre;
import com.smarttmt.client.wsecurit.model.TranResp;

/**
 * Interface con los metodos necesarios para el proceso de la firma electronica.
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public interface Sign {
    
    /**
     * La API se encarga de generar una llama a un celular y recitar un mensaje con un código de
     * confirmación el cual permitirá identificar si el usuario recibió completamente el mensaje
     * y está de acuerdo con él.
     * @param authoriz Objeto que tiene toda la informacion para el proceso de autorizacion.
     * @param resource Endpoint con la ruta de donde se debe consumir la operacion. 
     * @param apiKey codigo de seguridad entregado por wsecurity que permite hacer el consumo
     *        del API REST.
     * @return retorna un objeto con la respuesta de la autorizacion.
     * @throws Exception generica que permite enviar al metodo que invoque  este metodo
     *         informacion de cualquier error o problema que se genere.
     */
    public AuthResp authSign(Authoriz authoriz,String resource, String apiKey) throws Exception;
    
    /**
     * La API se encarga de retornar la información detallada de las transacciones realizadas en
     * el sistema por entidad.
     * @param resource Endpoint con la ruta de donde se debe consumir la operacion. 
     * @param apiKey codigo de seguridad entregado por wsecurity que permite hacer el consumo
     *        del API REST.
     * @param code Este parámetro contiene el identificador de la transacción realizada.
     * @return Retorna un objeto con respuesta de la transaccion.
     * @throws Exception generica que permite enviar al metodo que invoque  este metodo
     *         informacion de cualquier error o problema que se genere.
     */
    public TranResp tranSign(String resource, String apiKey, String code) throws Exception;
    
    /**
     * La API se encarga de cargar el archivo que se va firmar para el respectivo procemiento.
     * 
     * @param resource Endpoint con la ruta de donde se debe consumir la operacion. 
     * @param apikey codigo de seguridad entregado por wsecurity que permite hacer el consumo
     *        del API REST.
     * @param pathFile ruta local del archivo que se va a cargar.
     * @return una cadena con el id del archivo generado.
     * @throws Exception generica que permite enviar al metodo que invoque  este metodo
     *         informacion de cualquier error o problema que se genere.
     */
    public String uploSign( String resource, String apikey,String pathFile) throws Exception;
    
    /**
     * Metodo que se encarga de realizar la firma del documento.
     * @param signElec Objeto que recibe una lista de nombres de archivos y una lista
     *        con los codigos de autorizacion que corresponde a cada nombre de archivo.
     * @param resource Endpoint con la ruta de donde se debe consumir la operacion. 
     * @param apiKey codigo de seguridad entregado por wsecurity que permite hacer el consumo
     *        del API REST.
     * @return retorna un objeto con la respuesta de la firma del documento o los documentos.
     * @throws Exception generica que permite enviar al metodo que invoque  este metodo
     *         informacion de cualquier error o problema que se genere. 
     */
    public SignElre docuSign(SignElec signElec,String resource, String apiKey) throws Exception;
    
    
}
