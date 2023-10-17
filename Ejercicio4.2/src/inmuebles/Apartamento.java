package inmuebles;


public class Apartamento extends Inmueble_vivienda{

    public Apartamento(int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
    }
    void imprimir(){
        super.imprimir();
    }
    
}
