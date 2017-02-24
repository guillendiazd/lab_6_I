package lab6_daviddiaz;

import javax.swing.JOptionPane;

public class Canchas extends Lugar{
    private String categoria;
    private String estado;

    public Canchas() {
        super();
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int nivel_seguridad, Carretera carre_entrada, Carretera carre_salida) {
        super(nombre, direccion, nivel_seguridad, carre_entrada, carre_salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
            this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
