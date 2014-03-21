/**
 * Created by tomasbatto on 19/03/14.
 */
public class Calculator {

    public Calculator(){

    }

    public static int solve(String cuenta){
        Pila cuentaPostfija=hacerPostfija(cuenta);
        Pila resolver=new PilaE();
        for(int i=0;i<quitaEspacios(cuenta).length();i++){
            if(!cuentaPostfija.isEmpty()) {
                if(isNumber((String)cuentaPostfija.verTope())){
                    int a=Integer.parseInt((String)cuentaPostfija.verTope());
                    resolver.apilar(a);
                    cuentaPostfija.desapilar();
                }else{
                    String operator=(String)cuentaPostfija.verTope();
                    cuentaPostfija.desapilar();
                    int a=(Integer)resolver.verTope();
                   resolver.desapilar();
                   int b=(Integer)resolver.verTope();
                    resolver.desapilar();
                    int solve=0;
                    if(operator.equals("*")){
                        solve=a*b;
                    }else if(operator.equals("/")){
                        solve=b/a;
                    }else if(operator.equals("-")){
                        solve=b-a;
                    }else if(operator.equals("+")){
                        solve=a+b;
                    }
                    resolver.apilar(solve);
                }
        }
        }
        return (Integer)resolver.verTope();
    }

    public static Pila hacerPostfija(String cuenta){
        cuenta=quitaEspacios(cuenta);
        Pila temp=new PilaE();
        Pila out=new PilaE();
        Pila last=new PilaE();
        for(int i=0;i<cuenta.length();i++){
            char a=cuenta.charAt(i);
            String b=Character.toString(a);

            if(temp.isEmpty()){
                if(b.equals("*")||b.equals("/")||b.equals("+")||b.equals("-")){
                    temp.apilar(b);
                } else{
                    out.apilar(b);
                }
            }else{
                if(b.equals("*")||b.equals("/")){
                    while((((String)temp.verTope())).equals("*")||(((String)temp.verTope())).equals("/")){
                        out.apilar(temp.verTope());
                        temp.desapilar();
                    }
                    temp.apilar(b);
                }else if(b.equals("+")||b.equals("-")){
                    while(!temp.isEmpty()){
                        out.apilar(temp.verTope());
                        temp.desapilar();
                    }
                    temp.apilar(b);
                }else if(b.equals("=")){
                    while(!temp.isEmpty()){
                        out.apilar(temp.verTope());
                        temp.desapilar();
                    }
                    while (!out.isEmpty()){
                        last.apilar(out.verTope());
                        out.desapilar();
                    }
                    return last;
                }else{

                    out.apilar(b);
                }
            }
        }
        while (!out.isEmpty()){
            last.apilar(out.verTope());
            out.desapilar();
        }
        return last;
    }

    public static String quitaEspacios(String expresion){
        String unspacedString = "";
        for(int i = 0; i < expresion.length(); i++){
            if(expresion.charAt(i) != ' ')
                unspacedString += expresion.charAt(i);
        }

        return unspacedString;
    }

    private static boolean isNumber(String b){
        if(b.equals("*")||b.equals("/")||b.equals("+")||b.equals("-")){
            return false;
        }else{
            return true;
        }
    }

}
