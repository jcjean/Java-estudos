package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
public class conversorDeTemperatura {
    public static void menu(){
        
        System.out.println("====CONVERTER PARA====");
        System.out.println("C - Celsius");
        System.out.println("F - Farenheit");
        System.out.print("Opção: ");
    }
    public static float celsius(float f){
        float c;
        c = (5*(f-32))/9;
        return c;
    }
    public static float farenheit(float c){
        float f;
        f = (9*c/5)+32;
        return f;
    }
    public static void main(String[] args){
        float temp;
        char op;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a temperatura: ");
        temp = scan.nextFloat();
        
        menu();
        op = scan.next().charAt(0);
        
        if((op == 'c') || (op == 'C')){
            System.out.printf("Temperatura convertida: %.2fºC",celsius(temp));
        }else if((op == 'f') || (op == 'F')){
            System.out.printf("Temperatura convertida: %.2fºF",farenheit(temp));
        }else{
            System.out.println("Opção inválida!");
        }
    }
}
