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
        this.setCategoria(categoria);
        this.setCalificacion(calificacion);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria.equalsIgnoreCase("chino")) {
            this.categoria = categoria;
        } else if (categoria.equalsIgnoreCase("mexicano")) {
            this.categoria = categoria;
        } else if (categoria.equalsIgnoreCase("italiano")) {
            this.categoria = categoria;
        } else if (categoria.equalsIgnoreCase("comida rapida")) {
            this.categoria = categoria;
        } else {
            JOptionPane.showMessageDialog(null, "A ingresado un valor invalido");
        }
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion>=1 || calificacion<=5) {
            this.calificacion = calificacion;
        } else {
            JOptionPane.showMessageDialog(null, "La calificación es invalida");
        }
        
    }

    @Override
    public String toString() {
        return "Restaurante{" + "categoria=" + categoria + ", calificacion=" + calificacion + super.toString() + '}';
    }
    
}
