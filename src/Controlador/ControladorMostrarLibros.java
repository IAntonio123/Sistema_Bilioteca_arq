/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Venta;
import Procesos.ProcesoFormMostrarLibros;
import Vista.FormMostrarLibros;

/**
 *
 * @author Antonio
 */
public class ControladorMostrarLibros {
    FormMostrarLibros vista;
    Venta vent;
    public ControladorMostrarLibros(FormMostrarLibros fLisLib){
        vista=fLisLib;
        ProcesoFormMostrarLibros.Presentacion(fLisLib);
    }
}
