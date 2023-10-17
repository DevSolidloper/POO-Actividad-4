package inmuebles;


public class Inmueble_vivienda extends Inmueble{
    protected int n_habitaciones;
    protected int n_baños;
    public Inmueble_vivienda(int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños){
        super(identificador_inmobiliario,area,direccion);
        this.n_habitaciones = n_habitaciones;
        this.n_baños = n_baños;
        
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: "+n_habitaciones);
        System.out.println("Número de baños: "+n_baños);
        
    }
}
