package com.smarttmt.client.wsecurity.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Esta clase contiene metodos varios que se pueden usar en diferentes partes.
 *
 * @author Adalbert David Aroca
 * @version 1.0.0
 * @since 10-Marzo-2018
 */
public class Utility {

    private static final Logger LOGGER = LogManager.getLogger(Utility.class);

    /**
     * Metodo que toma un archivo y lo convierte en un arreglo de byte[]
     *
     * @param nameFile ruta y nombre del archivo a ser procesado.
     * @return un arreglo de byte que corresponde al archivo.
     */
    public static byte[] copyFime(String nameFile) {

        LOGGER.info("Ingresando al metodo copyFime");

        /**
         * Tamaño de array de byte.
         */
        int tamaArby = 0;
        /**
         * Array de bytes.
         */
        byte[] contFile = null;

        /**
         * Se usa para cargar el archivo que se va a convertir a un array de
         * byte.
         */
        File fileOrig = null;

        /**
         * Se usa para pasar el archivo a un arreglo de byte.
         */
        FileInputStream fileInst = null;

        try {
            LOGGER.debug("Se procede a instanciar los campos");            
            fileOrig = new File(nameFile);
            LOGGER.debug("Se toma el archivo {} ", nameFile);
            tamaArby = (int) fileOrig.length();
            LOGGER.debug("Se crea el Array de bytes de tamaño {} ",tamaArby);
            contFile = new byte[tamaArby];
            LOGGER.debug("Se oricede a crear yb FileInputStream con el archivo");
            fileInst = new FileInputStream(fileOrig);
            LOGGER.debug("Se lleva el archivo a Bytes");
            fileInst.read(contFile);
            LOGGER.debug("Proceso terminado");

        } catch (IOException ioExcept) {

            LOGGER.error("Error en metodo copyFime [ {} ]", ioExcept.getMessage());

        } finally {
            if (fileInst != null) {
                try {
                    fileInst.close();
                } catch (IOException ioExcept) {
                    // Error cerrando stream del fichero
                    LOGGER.error("Error en cerrando el la lectura y "
                            + "conversion del archivo aun arreglo de bytes  [ {} ]", ioExcept.getMessage());
                }
            }
        }
        LOGGER.info("Finalizo ejecucion del metodo copyFime");
        return contFile;
    }

}
