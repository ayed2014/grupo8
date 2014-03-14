/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 13/03/14
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[]args){
        System.out.println("TAD: Numeros Complejos");
        String a=NumeroComplejo.keyboardReading();
        String b=NumeroComplejo.keyboardReading();
        String[] strings=a.split("/");
        String[] str=b.split("/");
        double a1=Double.parseDouble(strings[0]);
        double b1=Double.parseDouble(strings[1]);
        double a2=Double.parseDouble(str[0]);
        double b2=Double.parseDouble(str[1]);
        NumeroComplejo numeroComplejo=new NumeroComplejo(a1,b1);
        NumeroComplejo numeroComplejo1=new NumeroComplejo(a2,b2);
        System.out.println("suma:");
        NumeroComplejo.print(NumeroComplejo.sum(numeroComplejo, numeroComplejo1));
        System.out.println("resta:");
        NumeroComplejo.print(NumeroComplejo.substract(numeroComplejo, numeroComplejo1));
        System.out.println("multiplicacion");
        NumeroComplejo.print(NumeroComplejo.product(numeroComplejo, numeroComplejo1));
        System.out.println("division:");
        NumeroComplejo.print(NumeroComplejo.division(numeroComplejo, numeroComplejo1));
        System.out.println("Modulo del numero complejo 1:");
        System.out.println(NumeroComplejo.modulo(numeroComplejo));
        System.out.println("Modulo del numero complejo 2:");
        System.out.println(NumeroComplejo.modulo(numeroComplejo1));

        System.out.println();
        System.out.println("TAD: Estudiante");
        Estudiante estudiante=new Estudiante(1,2);
        System.out.println("numeros antes del set:");
        System.out.println(estudiante.getInfo());
        estudiante.setComision(4);
        estudiante.setMatricula(8);
        System.out.println("numeros despues del set:");
        System.out.println(estudiante.getInfo());
    }
}
