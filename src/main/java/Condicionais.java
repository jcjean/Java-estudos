import java.util.Scanner;
/**
 *
 * @author jeanc
 */
public class Condicionais {
    public static void main(String[] args){
        //programa teste para saber se o aluno foi aprovado ou não (por media e falta).
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a sua primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Insira a sua segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.print("Insira a sua terceira nota: ");
        float nota3 = scan.nextFloat();
        System.out.print("Quantidade de faltas: ");
        int faltas = scan.nextInt();
        
        float media = (nota1+nota2+nota3)/3;
        
        if(media>=5 && faltas<=10){
            System.out.printf("Média: %.2f | Faltas: %d | Situação: Aprovado!", media, faltas);
        }else{
            System.out.printf("Média: %.2f | Faltas: %d | Situação: Reprovado!", media, faltas);
        }
    }
}
