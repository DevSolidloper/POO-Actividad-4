public class Cuenta_ahorros extends Cuenta {
    private boolean cuenta_activa;

    public Cuenta_ahorros(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        cuenta_activa = saldo >= 10000;
    }

    
    @Override
    public void retirar(float cantidad) {
        if (cuenta_activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros no está activa. No se pueden realizar retiros.");
        }
    }
    
    @Override
    public void consignar(float cantidad) {
        if (cuenta_activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros no está activa. No se pueden realizar consignaciones.");
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();

        if (retiros > 4) {
            comision_mensual += (retiros - 4) * 1000;
        }

        if (saldo < 10000) {
            cuenta_activa = false;
        }

    }

    public void imprimir() {
        System.out.println("Saldo $= " + saldo);
        System.out.println("Comisión mensual= $" + comision_mensual);
        System.out.println("Número de transacciones = " + (retiros + n_consignaciones));
        System.out.println();
    }
}
