package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class Quadrado {
    public static float quadrado(float num){
        return num*num;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float n, nQuadrado;
        System.out.println("Digite um número inteiro: ");
        n = scan.nextInt();
        nQuadrado = quadrado(n);
        
        System.out.printf("%.2f ao quadrado é: %.2f", n, nQuadrado);
    }
}
