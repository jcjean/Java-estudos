import java.util.Scanner;
/**
 *
 * @author jeanc
 */
public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, aux, f;
        System.out.println("Digite um número: ");
        n = scan.nextInt();
        
        aux=n;f=n;
        
        while(aux>1){
            f = f*(aux-1);
            aux--;
        }
        System.out.printf("Fatorial de %d é: %d\n",n,f);
    }
}
