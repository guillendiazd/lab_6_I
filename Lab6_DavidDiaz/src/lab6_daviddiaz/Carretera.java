package lab6_daviddiaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Carretera{
    private String nombre;
    private int numero;
    private int distancia;
    Lugar lu_inicio;
    Lugar lu_final;
    ArrayList<Integer> valor_numero = new ArrayList();

    public Carretera() {
    }

    public Carretera(String nombre, int numero, int distancia, Lugar lu_inicio, Lugar lu_final) {
        this.nombre = nombre;
        this.setNumero(numero);
        this.distancia = distancia;
        this.lu_inicio = lu_inicio;
        this.lu_final = lu_final;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        for (Integer t : valor_numero) {
            if (numero!=t) {
                this.numero = numero;
            } else {
                JOptionPane.showMessageDialog(null, "Valor ya existe");
            }
        }
        valor_numero.add(numero);
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugar getLu_inicio() {
        return lu_inicio;
    }

    public void setLu_inicio(Lugar lu_inicio) {
        this.lu_inicio = lu_inicio;
    }

    public Lugar getLu_final() {
        return lu_final;
    }

    public void setLu_final(Lugar lu_final) {
        this.lu_final = lu_final;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
