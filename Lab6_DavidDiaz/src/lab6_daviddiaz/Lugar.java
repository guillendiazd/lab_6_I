package lab6_daviddiaz;

import java.util.ArrayList;

public class Lugar {
    private String nombre;
    private String direccion;
    private int nivel_seguridad;
    Carretera carre_entrada;
    Carretera carre_salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivel_seguridad, Carretera carre_entrada, Carretera carre_salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel_seguridad = nivel_seguridad;
        this.carre_entrada = carre_entrada;
        this.carre_salida = carre_salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    public Carretera getCarre_entrada() {
        return carre_entrada;
    }

    public void setCarre_entrada(Carretera carre_entrada) {
        this.carre_entrada = carre_entrada;
    }

    public Carretera getCarre_salida() {
        return carre_salida;
    }

    public void setCarre_salida(Carretera carre_salida) {
        this.carre_salida = carre_salida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
