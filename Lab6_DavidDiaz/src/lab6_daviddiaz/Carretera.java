package lab6_daviddiaz;
public class Carretera{
    private String nombre;
    private int numero;
    private int distancia;
    Lugar lu_inicio;
    Lugar lu_final;

    public Carretera() {
    }

    public Carretera(String nombre, int numero, int distancia, Lugar lu_inicio, Lugar lu_final) {
        this.nombre = nombre;
        this.numero = numero;
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
        this.numero = numero;
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
        return "Carretera{" + "nombre=" + nombre + ", numero=" + numero + ", distancia=" + distancia + ", lu_inicio=" + lu_inicio + ", lu_final=" + lu_final + '}';
    }
    
}
