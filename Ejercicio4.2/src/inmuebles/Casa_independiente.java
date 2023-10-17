package inmuebles;


public class Casa_independiente extends Casa_urbana{
    protected static double valor_area = 3000000;

    public Casa_independiente(int n_pisos, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(n_pisos, identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
    }
    void imprimir(){
        super.imprimir();
        System.out.println();
    }    
}
