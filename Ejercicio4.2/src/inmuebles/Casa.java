package inmuebles;


public class Casa extends Inmueble_vivienda{
    protected int n_pisos;

    public Casa(int n_pisos, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
        this.n_pisos = n_pisos;
    }

    
    void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos: "+n_pisos);
    }
    
    
}
