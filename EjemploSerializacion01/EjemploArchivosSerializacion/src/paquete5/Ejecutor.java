/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete5.*;
import paquete1.Calificacion;
import paquete1.Profesor;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospitales78.data";

        Hospital c1 = new Hospital("Isidro Ayora", 200, 98000.50);
        Hospital c2 = new Hospital("UTPL", 150, 95000);
        Hospital c3 = new Hospital("San Gerardo", 100, 87000);


        Hospital[] lista = {c1, c2, c3};

        EscrituraArchivoSecuencial archivo = new
         EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
