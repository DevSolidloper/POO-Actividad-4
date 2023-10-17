public class Cuenta_corriente extends Cuenta{
    private float sobregiro;
    public Cuenta_corriente(float saldo, float tasa_anual){
        super(saldo, tasa_anual);
        sobregiro = 0;
    }
    @Override
    public void retirar(float cantidad){
        float resultado = saldo-cantidad;
        if(resultado < 0){
            sobregiro = sobregiro - resultado;
            saldo=0;
        }
        else{
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;
        if(sobregiro >0){
            if(residuo>0){
                sobregiro = 0;
                saldo = residuo;    
            }else{
                sobregiro = -residuo;
                saldo = 0;
            }
        }else{
            super.consignar(cantidad);
        }
    }
    public void extractoMensual(){
        super.extractoMensual();
    }
    public void imprimir(){
        System.out.println("Saldo = $"+saldo);
        System.out.println("Cargo mensual = $"+comision_mensual);
        System.out.println("Número de transacciones = $"+(n_consignaciones+retiros));
        System.out.println("Valor de sobregiro = $"+sobregiro);
        System.out.println();
    }
}


