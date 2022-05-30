/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String n, int nc, double p) {
        nombre = n;
        numeroCamas = nc;
        presupuesto = p;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCamas(int c) {
        numeroCamas = c;
    }

    public void establecerPresupuesto(double c) {
        presupuesto = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
