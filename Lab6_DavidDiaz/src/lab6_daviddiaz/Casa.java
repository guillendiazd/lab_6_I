package lab6_daviddiaz;
public class Casa extends Lugar{

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, int nivel_seguridad, Carretera carre_entrada, Carretera carre_salida) {
        super(nombre, direccion, nivel_seguridad, carre_entrada, carre_salida);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
