import java.util.Scanner;
/**
 *
 * @author jeanc
 */

public class Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num1, num2, result;
        System.out.println("Escolhe o tipo de operação[+ - / *]");
        char op = scan.nextLine().charAt(0);
        
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();
        System.out.println("Digite o primeiro número: ");
        num2 = scan.nextFloat();
        
        switch(op){
            case '+':
                result = num1+num2;
                System.out.printf("Resultado: %.2f",result);
                break;
            case '-':
                result = num1-num2;
                System.out.printf("Resultado: %.2f",result);
                break;
            case '*':
                result = num1*num2;
                System.out.printf("Resultado: %.2f",result);
                break;
            case '/':
                result = num1/num2;
                System.out.printf("Resultado: %.2f",result);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
