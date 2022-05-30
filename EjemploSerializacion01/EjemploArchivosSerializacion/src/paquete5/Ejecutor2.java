/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete5.*;


public class Ejecutor2 {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/hospitales78.data";
        String nombre = "Isidro Ayora";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(nombre);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
