
package programa22_226111269;
import java.util.Scanner;
public class Programa22_226111269 {
    static CuentaBanco n1=new CuentaBanco();
    static Scanner sn=new Scanner(System.in);
    public static void informacion(){
        System.out.println("Favor ingresar el nombre del cliente: ");
        n1.cliente=sn.nextLine();
        sn.nextLine();
        System.out.println("Ingrese el numero de cuenta: ");
        n1.numeroCuenta=sn.nextInt();
        sn.nextLine();
        System.out.println("Ingrese el numero de telefono: ");
        n1.telefono=sn.nextLine();
        System.out.println("Ingrese el limite de la cuenta: ");
        n1.limite=sn.nextFloat();   
    }
    public static void imprimir(){
        System.out.println("---------------------Informacion del Cliente---------------------");
        System.out.println("Nombre del cliente: "+n1.cliente);
        System.out.println("Numero de cuenta: "+n1.numeroCuenta);
        System.out.println("Numero de telefono: "+n1.telefono);
        System.out.println("Limite de la cuenta es: "+n1.limite);
        System.out.println("-----------------------------------------------------------------");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int opc1,opc2;
        System.out.println("Ingrese: "
                + "\n 1. Procesar una cuenta."
                + "\n 2. Salir");
        opc1 =sn.nextInt();
        while(opc1==1){
            System.out.println("Ingrese una opcion:"
                    + "\n 1. Depsitar."
                    + "\n 2. Retirar"
                    + "\n 3. Salir.");
            opc2=sn.nextInt(); 
            switch(opc2){
                case 1:
                    System.out.println("-Deposito-");
                    informacion();
                    System.out.println("Ingrese el monto a retirar: ");
                    n1.depositar(sn.nextFloat());
                    System.out.println("El saldo actual es: "+n1.getSaldo());
                    break;
                case 2:
                    System.out.println("-Retiro-");
                    System.out.println("Ingrese el monto a retirar: ");
                    n1.retirar(sn.nextFloat());
                    imprimir();
                    System.out.println("El saldo actual es: "+n1.getSaldo());
                    break;
                case 3:
                    opc1=2;
                    break;
            }
        }
        System.out.println("Gracias por usar el sistema...");  
    }
}
