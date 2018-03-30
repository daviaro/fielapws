package com.smarttmt.client.wsecurit.sign;

import com.smarttmt.client.wsecurit.model.AuthResp;
import com.smarttmt.client.wsecurit.model.Authoriz;

/**
 * Esta clase implemente la interfaz Sign para el proceso de firma digital.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class Prueba {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SignWese signWese = new SignWese();
        Authoriz authoriz = new Authoriz();

        try {
            authoriz.setPhone("573014096953");
            authoriz.setOtp("9875");
            authoriz.setWelcome("Esto es una prueba de autorizacion para la firma digital de su declaracion.");
            authoriz.setLanguage("es_ES");
            authoriz.setBio("false");
            authoriz.setPin("false");
            authoriz.setMode("speech");
            authoriz.setOpcional("");
            authoriz.setFirmante("David Aroca");
            authoriz.setEmail("ingeniero.desarrollo001@smarttmt.com");
            AuthResp aut = signWese.authSign(authoriz, "https://api.wsecurity.biz/v2/api/wsecurityco/authorization", "dd8fd715eb0d492adf1e983ab24e5512");
            System.out.println("Prueba " + aut.toString());
        } catch (Exception exceptio) {
            System.out.println(exceptio.getMessage());
        }
    }

}
