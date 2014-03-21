/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 19/03/14
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
public class Estacionamiento {
    private int capacidadMaxima;
    private PilaE pilaE;
    private PilaE vereda;
    private int cantidadDeAutos=0;
    private int plata=0;
    public Estacionamiento(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        pilaE=new PilaE();
        vereda=new PilaE();
    }
    public void addCar(Auto auto){
        if (!isFull()){
            pilaE.apilar(auto);
            cantidadDeAutos++;
            plata=plata+5;
        }
        else{
            System.out.println("The parking is full");
        }
    }
    public Auto searchCar(Auto auto){
        String patente=auto.getLicensePlate();
        while (!pilaE.isEmpty()){
            Auto auto1=(Auto)pilaE.verTope();
            String a="";
            for (int i=0;i<6;i++){
                if (patente.charAt(i)==auto1.getLicensePlate().charAt(i)){
                    a=a+patente.charAt(i);
                }
                else {
                    break;
                }
            }
            if (a.equals(auto1.getLicensePlate())){
                return auto1;
            }
            vereda.apilar(auto1);
            pilaE.desapilar();
        }
        return null;
    }
    public void deleteCar(){
        pilaE.desapilar();
        cantidadDeAutos--;
        reEstacionar();
    }
    private void reEstacionar(){
        while (!vereda.isEmpty()){
            addCar((Auto)vereda.verTope());
            plata=plata-5;
            vereda.desapilar();
        }
    }
    private boolean isFull(){
        if (capacidadMaxima==cantidadDeAutos){
            return true;
        }
        return false;
    }
    public void showEarnings(){
        System.out.println("The earnings of the day were "+plata);
    }
}
