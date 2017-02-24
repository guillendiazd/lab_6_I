package lab6_daviddiaz;

import java.util.ArrayList;

public class Lugar {
    private String nombre;
    private String direccion;
    private int nivel_seguridad;
    ArrayList<Carretera> carreteras_entrada = new ArrayList();
    Carretera carre_salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivel_seguridad, Carretera carre_salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel_seguridad = nivel_seguridad;
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

    public ArrayList<Carretera> getCarreteras_entrada() {
        return carreteras_entrada;
    }

    public void setCarreteras_entrada(ArrayList<Carretera> carreteras_entrada) {
        this.carreteras_entrada = carreteras_entrada;
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
