import java.util.Scanner;
/**
 *
 * @author jeanc
 */

//solicita 10 números ao usuário, através de um laço while, e mostra qual é o maior.
public class MaiorNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, count=0, maior=0;
        
        while(count<10){
            System.out.print("Insira um numero: ");
            num = scan.nextInt();
            if(num>maior){
                maior = num;
            }
            count++;
        }
        System.out.printf("O maior número digitado foi: %d", maior);
    }
}
