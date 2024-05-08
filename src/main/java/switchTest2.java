import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class switchTest2 {
    public static void main(String[] args){
        float valorI, valorF, juros = 0;
        int meses;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor inicial da dívida: ");
        valorI = scan.nextFloat();
        
        System.out.println("Quantos meses serão atrasados [1-5]?: ");
        meses = scan.nextInt();
        
        switch(meses){
            case 5:
                juros++;
            case 4:
                juros++;
            case 3:
                juros++;
            case 2:
                juros++;
            case 1:
                juros++;
                break;
            default:
                System.out.println("Você não digitou um valor válido de meses");
        }
        System.out.println("Juros: "+juros+"%");
        valorF = ((1+(juros/100)) * valorI);
        System.out.printf("Valor final da dívida: R$%.2f", valorF);
    }
}
