package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
//metodo que recebe tres valores e informa o menor utilizando Math.min()
public class menorValor {
    public static int menor(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }
    
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira tres valores: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        System.out.print("Menor número: " + menor(num1, num2, num3));
    }
}

