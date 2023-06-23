
package Main;

import Controlador.ControladorLogin;
import Controlador.ControladorMenu;
import Modelo.Usuario;
import Vista.FormInicio;
import Vista.FormLogin;

public class Main {
    public static FormLogin fl;
    public static ControladorLogin controlfl;
    
    public static FormInicio fi;
    public static ControladorMenu controlfi;
    
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
