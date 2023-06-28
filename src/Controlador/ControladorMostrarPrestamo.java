/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Prestamo;
import Procesos.ProcesoFormMostrarPrestamo;
import Vista.FormMostrarPrestamos;

/**
 *
 * @author Antonio
 */
public class ControladorMostrarPrestamo {
    FormMostrarPrestamos vista;
    Prestamo vent;
    public ControladorMostrarPrestamo(FormMostrarPrestamos fLisPres){
        vista=fLisPres;
        ProcesoFormMostrarPrestamo.Presentacion(fLisPres);
    }
}
