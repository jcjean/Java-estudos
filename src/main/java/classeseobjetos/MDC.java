package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
//programa que recebe dois inteiros e retorna o MDC
public class MDC {
    public static int calculaMDC(int a, int b){
        while(b!=0){
            int aux;
            aux = b;
            b = a%b;
            a = aux;
        }
        return a;
    }
    public static void main(String[] args){
        int a, b, result;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();
        
        result = calculaMDC(a, b);
        
        System.out.printf("O MDC de (%d, %d) = %d\n", a, b, result);
    }
}
