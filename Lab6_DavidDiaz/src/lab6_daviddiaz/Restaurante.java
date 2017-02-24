package lab6_daviddiaz;

import javax.swing.JOptionPane;

public class Restaurante extends Lugar{
    private String categoria;
    private int calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, int calificacion, String nombre, String direccion, int nivel_seguridad, Carretera carre_salida) {
        super(nombre, direccion, nivel_seguridad, carre_salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
            this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
