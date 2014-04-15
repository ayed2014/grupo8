/**
 * Created with IntelliJ IDEA.
 * User: joaquin
 * Date: 10/04/14
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class PalindromeTester {
    public static void main(String[]args){
        System.out.println("Palindromo dinamico de una frase:");
        PalindromeD palindrome=new PalindromeD("menem neuquen menem neuquen menem");
        System.out.println(palindrome.compare());
        System.out.println("Palindromo dinamico de una palabra:");
        PalindromeD palindromeD=new PalindromeD("neuquen");
        System.out.println(palindromeD.compare());
        System.out.println("Palindromo estatico de una frase:");
        PalindromeE palindromeE=new PalindromeE("patap banab patap");
        System.out.println(palindromeE.compare());
        System.out.println("Palindromo estatico de una palabra:");
        PalindromeE pali=new PalindromeE("naran");
        System.out.println(pali.compare());
    }
}
