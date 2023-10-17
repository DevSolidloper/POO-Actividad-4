package inmuebles;


public class Inmueble {
    protected int identificador_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio_venta;
    Inmueble(int identificador_inmobiliario, int area, String direccion){
        this.identificador_inmobiliario = identificador_inmobiliario;
        this.direccion = direccion;
        this.area = area;
    }
    double calcular_precio(double valor_area){
        precio_venta = area*valor_area;
        return precio_venta;
    }
    void imprimir(){
        System.out.println("Identificador inmobiliario: "+identificador_inmobiliario);
        System.out.println("Área: "+area);
        System.out.println("Dirección: "+direccion);
        System.out.println("Precio de venta: $"+precio_venta);
    }
}
