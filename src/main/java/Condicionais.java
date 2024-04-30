import java.util.Scanner;
//@author jeanc

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
        
        float media = (nota1+nota2+nota3)/3;
        
        if(media>=7){
            System.out.printf("Média: %.2f | Situação: Aprovado!", media);
        }else if(media>=5 && media<7){
            System.out.printf("Média: %.2f | Situação: Recuperação!", media);
        }else{
            System.out.printf("Média: %.2f | Situação: Reprovado!", media);
        }
    }
}
