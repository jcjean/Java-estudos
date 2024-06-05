package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
public class Delta {
    public static double delta(double a, double b, double c){
        double delta = (Math.pow(b, 2) - 4*a*c);
        return delta;
    }
    
    public static void main(String[] args){
        float a, b, c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de 'a': ");
        a = scan.nextFloat();
        
        System.out.println("Digite o valor de 'b': ");
        b = scan.nextFloat();
        
        System.out.println("Digite o valor de 'c': ");
        c = scan.nextFloat();
        
        System.out.println("O valor de delta é: "+delta(a, b, c));
    }
}
