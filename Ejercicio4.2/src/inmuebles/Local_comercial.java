package inmuebles;


public class Local_comercial extends Local{
    protected static double valor_area = 3000000;
    protected String centro_comercial;

    public Local_comercial(String centro_comercial, tipo tipo_local, int identificador_inmobiliario, int area, String direccion) {
        super(tipo_local, identificador_inmobiliario, area, direccion);
        this.centro_comercial = centro_comercial;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial: "+centro_comercial);
        System.out.println();
    }
}
