package inmuebles;


public class Casa_rural extends Casa{
    protected static double valor_area =  1500000;
    protected int distania_cabera;
    protected int altitud;

    public Casa_rural(int distania_cabera, int altitud, int n_pisos, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(n_pisos, identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
        this.distania_cabera = distania_cabera;
        this.altitud = altitud;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia la cabecera municipal: "+n_habitaciones+"km.");
        System.out.println("Altitud sobre el nivel del mar: "+altitud+"metros.");
        System.out.println();
    }
}
