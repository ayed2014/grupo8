import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 18/03/14
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[]args){
       try{ Analyzer analyzer=new Analyzer();
        analyzer.read(new File("C:\\Users\\tomasbatto\\Desktop\\TP3\\src\\H.txt"));
    }catch(Exception a){
           a.printStackTrace();
       }
    }
}
