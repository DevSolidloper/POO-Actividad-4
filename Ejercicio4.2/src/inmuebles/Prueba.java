package inmuebles;


public class Prueba {
    public static void main(String args[]){
        Apartamento_familiar apt1 = new Apartamento_familiar(200000,103067,120,"avenida Santander 45-45",3,2);
        System.out.println("Datos apartamento");
        apt1.calcular_precio(apt1.valor_area);
        apt1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio apartaestudio1 = new Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        apartaestudio1.calcular_precio(apartaestudio1.valor_area);
        apartaestudio1.imprimir();
    }
}
