import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jeanc
 */
//printa numeros aleatorios entre 1000 e 1999 se  o resto da divisao por 11 for 5
public class TesteFor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<20; i++){
            Random numRandom = new Random();
            int num = numRandom.nextInt(1000, 2000);
            if(num%11 == 5){
                System.out.printf("%d\n", num);
            }
        }
    }
}
