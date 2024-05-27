package classeseobjetos;
import java.util.Scanner;
/**
 *
 * @author jeanc
 */
public class menu {
    public static void menu(){
        
        System.out.println("===CADASTRO DE CLIENTES===");
        System.out.println("1 - Incluir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Consultar");
        System.out.println("0 - Encerrar");
        System.out.println("Opção: ");
    }
    
    public static void inclui(){
        System.out.println("Incluindo...");
    }
    
    public static void altera(){
        System.out.println("Alterando...");
    }
    
    public static void exclui(){
        System.out.println("Excluindo...");
    }
    
    public static void consulta(){
        System.out.println("Consultando...");
    }
        
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op;
        
        do{
            menu();
            op = scan.nextInt();
            
            switch(op){
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                case 1:
                    inclui();
                    break;
                case 2:
                    altera();
                    break;
                case 3:
                    exclui();
                    break;
                case 4:
                    consulta();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op!=0);
    }
}
