/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Procesos.ProcesosFormLibro;
import Vista.FormLibro;

/**
 *
 * @author Antonio
 */
public class ControladorLibro {
    FormLibro vista;
    Libro cli;
    public ControladorLibro(FormLibro flib){
        vista=flib;
        ProcesosFormLibro.Presentacion(flib);
    }
    
}
