package inmuebles;


public class Apartamento_familiar extends Apartamento{
    protected static double valor_area = 2000000;
    protected int valor_administracion;

    public Apartamento_familiar(int valor_administracion, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
        this.valor_administracion = valor_administracion;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion: $"+valor_administracion);
        System.out.println();
    }
}
