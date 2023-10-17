package inmuebles;


public class Apartaestudio extends Apartamento{
    protected static double valor_area=1500000;

    public Apartaestudio(int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(identificador_inmobiliario, area, direccion, 1, 1);
    }
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
       