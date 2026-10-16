
package programa22_226111269;
public class CuentaBanco {
    //Atributos
    public String cliente;
    public int numeroCuenta;
    public String telefono;
    public float limite;
    private float saldo;
    
    //Constructor
    public CuentaBanco(){
        cliente="No definido";
        numeroCuenta =0;
        telefono ="No definido";
        limite =999999;
        saldo=0.00f;
        
    }
    //Metodos
    public float getSaldo(){
        return saldo;
    }
    public void depositar(float monto){
        if(monto>0){
            if (saldo+monto<=limite) {
              saldo+=monto;
            }   
            
        }   
    }
    public void retirar(float monto){
        if(monto<0){
            if (saldo-monto<=saldo) {
                saldo-=monto;
            }
        }
    }
}
