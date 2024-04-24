import java.util.Scanner;
//@author jeanc
public class OperacaoMat{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num1, num2;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextFloat();
        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextFloat();
        
        float soma = (num1 + num2);
        float subtracao = (num1 - num2);
        float div = (num1/num2);
        float mult = (num1*num2);
        
        System.out.printf("\n%.1f + %.1f = %.2f\n", num1, num2, soma);
        System.out.printf("%.1f - %.1f = %.2f\n", num1, num2, subtracao);
        System.out.printf("%.1f x %.1f = %.2f\n", num1, num2, mult);
        System.out.printf("%.1f : %.1f = %.2f\n", num1, num2, div);
    }
}
