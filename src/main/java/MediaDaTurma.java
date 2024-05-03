import java.util.Scanner;
/**
 *
 * @author jeanc
 */

public class MediaDaTurma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int qtde=0, count=1;
        float nota=0, media=0, somaNotas=0;
        
        System.out.println("Quantos alunos tem na turma?");
        qtde = scan.nextInt();
        
        while(count<=qtde){
            System.out.printf("Qual a nota do %d° aluno?\n", count);
            nota = scan.nextFloat();
            somaNotas += nota;
            count++;
        }
        
        if(qtde<=0){
            System.out.println("Turma vazia!");
        }else{
            media = somaNotas/qtde;
            System.out.printf("Média da turma: %.2f\n", media);
        }
    }
}
