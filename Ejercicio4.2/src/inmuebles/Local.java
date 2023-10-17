
package inmuebles;


public class Local extends Inmueble{
    enum tipo {INTERO,CALLE}
    protected tipo tipo_local;

    public Local(tipo tipo_local, int identificador_inmobiliario, int area, String direccion) {
        super(identificador_inmobiliario, area, direccion);
        this.tipo_local = tipo_local;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: "+tipo_local);
    }
   
}
