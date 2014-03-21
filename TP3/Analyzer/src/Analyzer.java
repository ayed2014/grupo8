import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 18/03/14
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
public class Analyzer {
    PilaE pilaE=new PilaE();
    int t=0;

    public boolean read(File file) throws MisMatchException{
        try {
            File myFile=file;
            FileReader fileReader=new FileReader(myFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;
            while ((line=reader.readLine())!=null){
                for(int i =0;i<line.length();i++){
                 char c=line.charAt(i);
                 String d=Character.toString(c);
                    if (d.equals("{")||d.equals("(")||d.equals("[")){
                            pilaE.apilar(d);
                            System.out.println("a");
                    }else if(d.equals("}")){
                        String f=(String)pilaE.verTope();
                        if(f.equals("{")){
                            pilaE.desapilar();
                        }else{
                            throw  new MisMatchException();
                        }
                    }else if(d.equals(")")){
                        String f=(String)pilaE.verTope();
                        if(f.equals("(")){
                            pilaE.desapilar();
                        }else{
                            throw  new MisMatchException();
                        }
                    }else if(d.equals("]")){
                        String f=(String)pilaE.verTope();
                        if(f.equals("[")){
                            pilaE.desapilar();
                        }else{
                            throw  new MisMatchException();
                        }

                    }
                }
            }
            if (!pilaE.isEmpty()){
                throw new MisMatchException();
            }


            reader.close();
            return true;
        }   catch (IOException ex){
            ex.printStackTrace();
        }
        return true;
    }

}
