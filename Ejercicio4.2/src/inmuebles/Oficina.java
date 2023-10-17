package inmuebles;


public class Oficina extends Local{
    protected static double valor_area=3500000;
    protected boolean es_gobierno;

    public Oficina(boolean es_gobierno, tipo tipo_local, int identificador_inmobiliario, int area, String direccion) {
        super(tipo_local, identificador_inmobiliario, area, direccion);
        this.es_gobierno = es_gobierno;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Es oficina gubernamental: "+es_gobierno);
        System.out.println();
    }
    
}
