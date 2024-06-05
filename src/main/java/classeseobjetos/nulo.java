package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
//recebe um valor e diz se é nulo ou não
public class nulo {
    public static boolean isZero(float num){
        return num==0;
    }
    
    public static void main(String[] args){
        float num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = scan.nextFloat();
        
        if(isZero(num)){
             System.out.println("É nulo!");
        }else{
             System.out.println("Não é nulo!");
        }
    }
}
