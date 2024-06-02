package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
/*
Com o uso das reticencias, podemos passar um ou mais argumentos para um mesmo método
que ele vai saber como tratar esses dados.

Aplicativo que recebe 5 valores do usuário e calcula a média dos 5, dos primeiros 4, 3 e 2 valores inseridos.
Usando apenas um método que receba uma lista de argumentos de tamanho qualquer.
*/

public class medias {
    public static float media(float ...valores){
        float media = 0;
        
        for(float valor: valores){
            media += valor;
        }
        return media/valores.length;
    }
    
    public static void main(String[] args){
        float num1, num2, num3, num4, num5;
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Digite o primeiro valor: ");
        num1 = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        num2 = scan.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        num3 = scan.nextFloat();
        System.out.println("Digite o quarto valor: ");
        num4 = scan.nextFloat();
        System.out.println("Digite o quinto valor: ");
        num5 = scan.nextFloat();
        
        System.out.printf("A média dos 5 valores é: %.2f\n", media(num1, num2, num3, num4, num5));
        System.out.printf("A média dos 4 primeiros valores é: %.2f\n", media(num1, num2, num3, num4));
        System.out.printf("A média dos 3 primeiros valores é: %.2f\n", media(num1, num2, num3));
        System.out.printf("A média dos 2 primeiros valores é: %.2f\n", media(num1, num2));
        
    }
}
