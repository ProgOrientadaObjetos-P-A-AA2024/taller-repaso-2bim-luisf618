/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;

/**
 *
 * @author utpl
 */
public class Consecionaria {

    private ArrayList<Auto> lista = new ArrayList<>();
    private String nombre;
    private double ventasTotales;
    private double caro;
    private double barato;

    public Consecionaria(String n, ArrayList<Auto> l) {
        nombre = n;
        lista = l;
    }

    public ArrayList<Auto> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Auto> x) {
        lista = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public void establecerVentasTotales() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerPrecioFinal();
        }
        ventasTotales = suma;
    }

    public double obtenerCaro() {
        return caro;
    }

    public void establecerCaro() {
        double comp = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).obtenerPrecioFinal() > comp) {
                comp = lista.get(i).obtenerPrecioFinal();
            }
        }
        caro = comp;
    }

    public double obtenerBarato() {
        return barato;
    }

    public void establecerBarato() {
        double comp = 1000000;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).obtenerPrecioFinal() < comp) {
                comp = lista.get(i).obtenerPrecioFinal();
            }
        }
        barato = comp;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", nombre);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sVentas totales: %.2f\nCosto del vehiculo mas"
                + " caro: %.2f\nCosto del vehiculo mas barato: %.2f\n",
                cadena, ventasTotales, caro, barato);
        return cadena;
    }

}
