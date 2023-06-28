/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Venta;
import Procesos.ProcesoFormMostrarVenta;
import Vista.FormMostrarVentas;

/**
 *
 * @author Antonio
 */
public class ControladorMostrarVenta {
    FormMostrarVentas vista;
    Venta vent;
    public ControladorMostrarVenta(FormMostrarVentas fLisVen){
        vista=fLisVen;
        ProcesoFormMostrarVenta.Presentacion(fLisVen);
    }
}
