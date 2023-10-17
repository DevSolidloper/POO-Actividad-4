import java.util.Scanner;
public class Prueba_cuenta {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialAhorros = entrada.nextFloat();
        System.out.println("Ingrese tasa de interés= ");
        float tasaAhorros = entrada.nextFloat();
        Cuenta_ahorros cuenta1 = new Cuenta_ahorros(saldoInicialAhorros,tasaAhorros);
        System.out.println("Ingresar cantidad a consignar: $");
        float cantidadDepositar = entrada.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetirar = entrada.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
               
    }
}
