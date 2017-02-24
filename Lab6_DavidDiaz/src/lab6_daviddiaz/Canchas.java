package lab6_daviddiaz;

import javax.swing.JOptionPane;

public class Canchas extends Lugar{
    private String categoria;
    private String estado;

    public Canchas() {
        super();
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int nivel_seguridad, Carretera carre_salida) {
        super(nombre, direccion, nivel_seguridad, carre_salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria.equalsIgnoreCase("football")) {
            this.categoria = categoria;
        } else if (categoria.equalsIgnoreCase("basquet")) {
            this.categoria = categoria;
        } else if (categoria.equalsIgnoreCase("tenis")) {
            this.categoria = categoria;
        } else {
            JOptionPane.showConfirmDialog(null, "A ingresado un valor invalido");
        }
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Canchas{" + "categoria=" + categoria + ", estado=" + estado + super.toString() + '}';
    }
    
}
