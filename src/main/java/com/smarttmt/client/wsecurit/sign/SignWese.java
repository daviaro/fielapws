package com.smarttmt.client.wsecurit.sign;

import com.smarttmt.client.wsecurit.model.AuthResp;
import com.smarttmt.client.wsecurit.model.Authoriz;
import com.smarttmt.client.wsecurit.model.SignElec;
import com.smarttmt.client.wsecurit.model.SignElre;
import com.smarttmt.client.wsecurit.model.TranResp;
import java.io.Serializable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientResponse;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * Esta clase implemente la interfaz Sign para el proceso de firma digital.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class SignWese implements Sign, Serializable {

    private static final Logger LOGGER = LogManager.getLogger(SignWese.class);

    /**
     * Constructor se encarga de instanciar la clase y permitir el consumo del
     * recurso rest https.
     */
    public SignWese() {

        HttpsURLConnection.setDefaultHostnameVerifier(
                new javax.net.ssl.HostnameVerifier() {

                @Override
                public boolean verify(String hostName, SSLSession sslSess) {
                    return true;
                }
            });
    }

    @Override
    public AuthResp authSign(Authoriz authoriz, String resource, String apiKey) throws Exception {

        ClientConfig clieConfi = null;
        Client client = null;
        WebTarget webTarg = null;
        Invocation.Builder invoBuil  = null;
        Response response = null;
        AuthResp authResp = null;
        

        try {

            LOGGER.info("Ingresando authSign");
            //configuracion basica del cliente
            LOGGER.info("Configurando el cliente para trabajar con Jackson");
            clieConfi = new ClientConfig();
            clieConfi.register(JacksonFeature.class);
            client = ClientBuilder.newClient(clieConfi);

            //Creando el objeto que va a ser mapeado como JSON para el envio por metodo POST al 
            //Servicio REST
            if (authoriz == null) {
                LOGGER.debug("Instanciar el objeto authoriz");
                throw new Exception("Instanciar el objeto authoriz");
            }
            //JSON Ingresado para la autorizacion
            LOGGER.info("Ingresado objeto JSON");
            LOGGER.debug("Objeto JSON : {} ",authoriz.toString());
            

            //Preparando la llamada del recurso
            LOGGER.debug("el apikey es {} ", apiKey);
            LOGGER.debug("el recurso del servicio REST es {} ", resource);
            LOGGER.info("Se prepara la llamada del recurso");
            webTarg = client.target(resource).queryParam("Apikey", apiKey);
            invoBuil = webTarg.request(MediaType.APPLICATION_JSON);
            response = invoBuil.post(Entity.entity(authoriz, MediaType.APPLICATION_JSON));
            
          
            LOGGER.info("Se llama el recurso con los datos del archivo para subirlo");
           
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus() + " message " + response.toString());
            } else {
                LOGGER.info("se ejecuto la peticcion de manera correcta [{}]", response.toString());
            }

            //obteniendo resultado
            LOGGER.info("Obteniendo el resultado que devuelve el servicio");
            authResp = response.readEntity(AuthResp.class);
            LOGGER.debug("Respuesta {} ", authResp.toString());

        } catch (Exception exceptio) {
            LOGGER.error("Error:[Operacion Autorizacion {} ] ", exceptio.getMessage());
            throw new Exception("Error :[Operacion Autorizacion " + exceptio.getMessage() + "]");
        } finally {
            if (client != null) {
                LOGGER.debug("Cerrar el cliente");
                client.close();
            }
        }

        return authResp;
    }

    @Override
    public TranResp tranSign(String resource, String apiKey, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uploSign(String resource, String apikey, String pathFile) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SignElre docuSign(SignElec signElec, String resource, String apiKey) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
