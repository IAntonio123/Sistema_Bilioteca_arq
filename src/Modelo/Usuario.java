
package Modelo;

public class Usuario {
    private String usuario;
    private String nombres;
    private String apellidos;
    private String clave;
    private String role;

    public Usuario(String usuario, String clave, String role) {
        this.usuario = usuario;
        this.clave = clave;
        this.role = role;
    }
    public Usuario(String usuario,String nombres,String apellidos, String clave, String role) {
        this.usuario = usuario;
        this.clave = clave;
        this.role = role;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public Usuario() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}