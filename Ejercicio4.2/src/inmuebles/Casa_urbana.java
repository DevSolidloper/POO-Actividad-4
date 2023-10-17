package inmuebles;


public class Casa_urbana extends Casa{
    public Casa_urbana(int n_pisos, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(n_pisos, identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
    }
    void imprimir(){
        super.imprimir();
    } 
}
