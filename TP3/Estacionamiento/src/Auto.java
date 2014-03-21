/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 19/03/14
 * Time: 16:48
 * To change this template use File | Settings | File Templates.
 */
public class Auto {
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    public Auto(String marca,String modelo,String patente,String color){
        this.marca=marca;
        this.modelo=modelo;
        if (patente.length()>6){
            System.out.println("La patente es incorrecta");
        } else {
            this.patente=patente;
        }
        this.color=color;
    }
    public Auto(String patente){
        if (patente.length()>6){
            System.out.println("La patente es incorrecta");
        } else {
            this.patente=patente;
        }
    }
    public String getLicensePlate(){
        return patente;
    }
    public void setLicensePlate(String abc, int def){
        if (abc.length()>2||abc.length()<0){
            System.out.println("License Plate changing failed");
        }
        if (def>999||def<0){
            System.out.println("License Plate changing failed");
        }
        else{
            patente=abc+def;
        }
    }
    public void setColor(String color){
        this.color=color;
    }
}
