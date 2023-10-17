public class Cuenta {
    protected float saldo;//cantidad de dinero en la cuenta
    protected int n_consignaciones = 0;
    protected int retiros = 0;
    protected float tasa_anual;
    protected float comision_mensual = 0f;
    public Cuenta(float saldo, float tasa_anual){
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;      
    }
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        n_consignaciones = n_consignaciones + 1;     
    }
    public void retirar(float cantidad){
        float Nuevo_saldo = saldo - cantidad;
        if(Nuevo_saldo>= 0){
            saldo-= cantidad;
            retiros = retiros + 1;
        }
        else{
            System.out.println("La cantidad a retirar eccede el saldo actual.");
        }
        
    }    
    public void interes_mensual(){
        float tasa_mensual = (tasa_anual/12);
        float interes_mensual = saldo*tasa_mensual;
        saldo += interes_mensual;
    }
    public void extractoMensual() {
        saldo -= comision_mensual;
        interes_mensual();
    }
    
}

