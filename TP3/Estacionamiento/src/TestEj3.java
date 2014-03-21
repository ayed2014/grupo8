/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 19/03/14
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class TestEj3 {
    public static void main(String[]args){
        Estacionamiento estacionamiento=new Estacionamiento(50);
        estacionamiento.addCar(new Auto("ABC123"));
        estacionamiento.addCar(new Auto("BDQ584"));
        estacionamiento.addCar(new Auto("HYF204"));
        estacionamiento.addCar(new Auto("TYU753"));
        Auto autoEncontrado=estacionamiento.searchCar(new Auto("BDQ584"));
        if (autoEncontrado!=null){
            System.out.println("The car with the license plate "+autoEncontrado.getLicensePlate()+" was found");
            estacionamiento.deleteCar();
        }
        else {
            System.out.println("The car wasn't at the parking");
        }
        estacionamiento.showEarnings();
    }
}
