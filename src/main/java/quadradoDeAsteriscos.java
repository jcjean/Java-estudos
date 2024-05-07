import java.util.Scanner;
/**
 *
 * @author jeanc
 * @author gondrai
 * MEU AMOORR
 */
public class quadradoDeAsteriscos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamLado, linha, coluna;
        
        System.out.println("Digite o tamanho do lado. (entre 1 e 20): ");
        tamLado = scan.nextInt();
        
        if(tamLado<1 || tamLado>20){
            System.out.print("Valor inválido!");
        }else{
            linha=1;
            while(linha<=tamLado){
                coluna=1;
                while(coluna<=tamLado){
                    if((linha != 1 && linha < tamLado) && (coluna == 1 || coluna == tamLado)){
                        System.out.print("*");
                        coluna++;
                    }
                    else if((linha != 1 && linha < tamLado) && (coluna != 1 && coluna < tamLado)){
                        System.out.print(" ");
                        coluna++;
                    }
                    else if(linha == 1 ||  linha == tamLado){
                        System.out.print("*");
                        coluna++;
                    }else{
                        System.out.print("8");
                        coluna++;
                    }
                }
                System.out.print("\n");
                linha++;
            }
        }
    }
}

