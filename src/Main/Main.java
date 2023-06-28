
package Main;

import Controlador.*;
import Modelo.Usuario;
import Vista.*;

public class Main {
    public static FormLogin fl;
    public static ControladorLogin controlfl;
    
    public static FormInicio fi;
    public static ControladorMenu controlfi;
    
    public static FormAutor faut;
    public static ControladorAutor controlfaut;
    
    public static FormCliente fcli;
    public static ControladorCliente controlfcli;
    
    public static FormLibro flib;
    public static ControladorLibro controlflib;
    
    public static FormVenta fvent;
    public static ControladorVenta controlVent;
    
    public static FormPrestamo fprest;
    public static ControladorPrestamo controlPrest;
    
    public static FormMostrarLibros fLisLib;
    public static ControladorMostrarLibros controlfLisLib;
    
    public static FormMostrarVentas fLisVent;
    public static ControladorMostrarVenta controlfListVent;
    
    public static FormMostrarPrestamos fLisPrest;
    public static ControladorMostrarPrestamo controlLisPrest;
    
    public static Usuario userSesion;
    public static void main(String[] args) {
        Usuario user=new Usuario();
        userSesion=user;
        
        fi=new FormInicio();
        controlfi=new ControladorMenu(fi, user);
        
        fl=new FormLogin();
        controlfl=new ControladorLogin(fl, fi, user);
        
    }
    
}
