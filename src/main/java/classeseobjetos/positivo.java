package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */

//recebe um valor e informa se é positivo ou negativo através de um retorno com boolean. (considerando 0 positivo)
public class positivo {
    public static boolean isPositive(float num){
        return num>=0;
    }
    
    public static void main(String[] args){
        float num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = scan.nextFloat();
        
        if(isPositive(num)){
            System.out.println("É positivo!");
        }else{
            System.out.println("É negativo!");
        }
    }
}
