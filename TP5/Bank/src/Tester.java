/**
 * Created by tomasbatto on 10/04/2014.
 */
public class Tester {
    public static void main(String[]args){
        Bank b=new Bank();
        Bank b1=new Bank();
        b.simulate1();
        System.out.println("Datos simulacion FILA UNICA: ");
        System.out.println("Tiempo medio de espera por cliente: "+b.getWaitingTime()+" segundos");
        System.out.println("Numero de Clientes: "+b.getClients());
        b1.simulate2();
        System.out.println("Datos simulacion FILAS MULTIPLES: ");
        System.out.println("Tiempo medio de espera por cliente: "+b1.getWaitingTime()+" segundos");
        System.out.println("Numero de Clientes: "+b1.getClients());
    }
}
