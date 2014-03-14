import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 13/03/14
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */
public class NumeroComplejo {
    double numeroReal;
    double numeroImaginario;

    public NumeroComplejo(double numeroReal, double numeroImaginario){
        this.numeroReal=numeroReal;
        this.numeroImaginario=numeroImaginario;
    }
    public static String keyboardReading(){
        double a1=Scanner.getDouble("La parte real del numero es:");
        double b1=Scanner.getDouble("La parte imaginaria del numero es:");
        return a1+"/"+b1;
    }

    public static void print(NumeroComplejo numeroComplejo){
        if (numeroComplejo.getNumeroImaginario()>0){
        System.out.println(numeroComplejo.getNumeroReal()+"+"+numeroComplejo.getNumeroImaginario()+"i");
        }
        else {
            System.out.println(numeroComplejo.getNumeroReal()+""+numeroComplejo.getNumeroImaginario()+"i");
        }
    }
    public static NumeroComplejo sum(NumeroComplejo numeroComplejo, NumeroComplejo numeroComplejo1){
        double real=numeroComplejo.getNumeroReal()+numeroComplejo1.getNumeroReal();
        double imaginario=numeroComplejo.getNumeroImaginario()+numeroComplejo1.getNumeroImaginario();
        return new NumeroComplejo(real,imaginario);
    }
    public static NumeroComplejo substract(NumeroComplejo numeroComplejo, NumeroComplejo numeroComplejo1){
        double real=numeroComplejo.getNumeroReal()-numeroComplejo1.getNumeroReal();
        double imaginario=numeroComplejo.getNumeroImaginario()-numeroComplejo1.getNumeroImaginario();
        return new NumeroComplejo(real,imaginario);
    }
    public static NumeroComplejo product(NumeroComplejo numeroComplejo, NumeroComplejo numeroComplejo1){
        double real=numeroComplejo.getNumeroReal()*numeroComplejo1.getNumeroReal();
        double real1=(numeroComplejo.getNumeroImaginario()*numeroComplejo1.getNumeroImaginario())*(-1);
        double imaginario=numeroComplejo.getNumeroReal()*numeroComplejo1.getNumeroImaginario();
        double imaginario1=numeroComplejo1.getNumeroReal()*numeroComplejo.getNumeroImaginario();
        return new NumeroComplejo(real+real1,imaginario+imaginario1);
    }
    public static NumeroComplejo division(NumeroComplejo numeroComplejo, NumeroComplejo numeroComplejo1){
        if (numeroComplejo1.getNumeroImaginario()!=0&&numeroComplejo1.getNumeroReal()!=0){
            double a=numeroComplejo.getNumeroReal();
            double b=numeroComplejo.getNumeroImaginario();
            double c=numeroComplejo1.getNumeroReal();
            double d=numeroComplejo1.getNumeroImaginario();
            double r=(((a*c)+(b*d))/((c*c)+(d*d)));
            double i=((b*c)-(a*d))/((c*c)+(d*d));
        return new NumeroComplejo(r,i);
        }   throw new java.lang.Error();
    }
    public static double modulo(NumeroComplejo numeroComplejo){
        double a=numeroComplejo.getNumeroReal()*numeroComplejo.getNumeroReal();
        double b=numeroComplejo.getNumeroImaginario()*numeroComplejo.getNumeroImaginario();
        double c=Math.pow(a+b,0.5);
        return c;
    }
    public double getNumeroReal(){
        return numeroReal;
    }
    public double getNumeroImaginario(){
        return numeroImaginario;
    }

}
