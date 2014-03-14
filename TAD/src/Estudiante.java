import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 13/03/14
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class Estudiante {
    int matricula;
    int comision;
    public Estudiante(int matricula, int comision){
        this.matricula=matricula;
        this.comision=comision;
    }
    public void setMatricula(int matri){
        if (matri<0){
            throw new java.lang.Error();
        }else {
            this.matricula=matri;
        }
    }
    public void setComision(int comi){
        if (comi<0){
            throw new java.lang.Error();
        }else {
            this.comision=comi;
        }
    }
    public String getInfo(){
        return "Matricula: "+matricula+" Comision: "+comision;
    }
}
