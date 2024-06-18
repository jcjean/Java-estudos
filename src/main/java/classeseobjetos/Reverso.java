package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class Reverso {
    public static void main(String[] args){
        String num, reverso = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número");
        num = scan.next();
        
        for(int i=(num.length()-1); i>=0; i--){
            reverso += num.charAt(i);
        }
        System.out.println(reverso);
    }
}
