import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int multiplicador, multiplicando=0, result;
        System.out.println("Qual tabuada deseja aprender hoje?");
        multiplicador = scan.nextInt();
        
        if(multiplicador>=0){
            while(multiplicando<=10){
                result = multiplicador*multiplicando;
                System.out.printf("%d x %d = %d\n", multiplicador, multiplicando, result);
                multiplicando++;
            }
        }else{
            System.out.println("Insira um valor igual a zero ou superior!");
        }
    }
}
