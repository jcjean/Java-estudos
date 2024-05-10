import java.util.Scanner;
/**
 *
 * @author jeanc
 */

//programa que recebe um inteiro 'n' e calcula o produto dos números pares e o produtos dos números ímpares, de 1 até n.
public class produtoDosFatores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, par=1, impar=1;
        System.out.println("Digite um número: ");
        n = scan.nextInt();
        
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                par *= i;
            }else{
                impar *= i;
            }
        }
        System.out.printf("Produto dos pares: %d\n", par);
        System.out.printf("Produto dos ímpares: %d", impar);
    }
}