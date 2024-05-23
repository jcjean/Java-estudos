package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class PrimeiraClasse {

    public static void main(String[] args){
        Aluno aluno2 = new Aluno();
        String nome;
        double notaMat, notaFis, media;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome do aluno: ");
        nome = scan.nextLine();
        
        System.out.println("Nota em matemática: ");
        notaMat = scan.nextDouble();
        
        System.out.println("Nota em física: ");
        notaFis = scan.nextDouble();
        
        Aluno aluno1 = new Aluno(nome, notaMat, notaFis);
        System.out.printf("O aluno %s tirou %2.2f em Matemática, %2.2f em Física e obteve a média: %2.2f.\n", aluno1.nome, aluno1.notaMat, aluno1.notaFis, aluno1.media);
        
    }
}
