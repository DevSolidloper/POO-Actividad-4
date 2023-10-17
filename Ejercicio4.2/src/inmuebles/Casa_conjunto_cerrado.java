package inmuebles;

public class Casa_conjunto_cerrado extends Casa_urbana{
    protected static double valor_area = 2500000;
    protected int valor_administracion;
    protected boolean piscina;
    protected boolean campos_deportivos;

    public Casa_conjunto_cerrado(int valor_administracion, boolean piscina, boolean campos_deportivos, int n_pisos, int identificador_inmobiliario, int area, String direccion, int n_habitaciones, int n_baños) {
        super(n_pisos, identificador_inmobiliario, area, direccion, n_habitaciones, n_baños);
        this.valor_administracion = valor_administracion;
        this.piscina = piscina;
        this.campos_deportivos = campos_deportivos;
    }
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion: "+valor_administracion);
        System.out.println("Tiene?: "+piscina);
        System.out.println("Tiene campos deportivos?: "+campos_deportivos);
        System.out.println();
    }
}
