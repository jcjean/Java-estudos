package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
//metodo que recebe tres valores e informa o maior utilizando Math.max()
public class maiorValor {
    public static int maior(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }
    
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira tres valores: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        System.out.print("Maior número: " + maior(num1, num2, num3));
    }
}
