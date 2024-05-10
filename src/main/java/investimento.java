import java.util.Scanner;
/**
 *
 * @author jeanc
 */

/*
Sistema bancário que pede o valor do depósito inicial, o valor do investimento mensal e o número de meses que o dinheiro vai ficar rendendo na poupança.
Após isso, calcula o valorFim obtido, com juros da poupança de 0,5%.
*/
public class investimento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double valorIni, valorInvest, lucro, saldo, juros = 0.005;
        int meses;
        
        System.out.println("De quanto será o seu depósito inicial?: ");
        valorIni = scan.nextFloat();
        
        System.out.println("Quanto será o valor do investimento mensal?: ");
        valorInvest = scan.nextFloat();
        
        System.out.println("Por quantos meses deseja deixar rendendo [1-12]?: ");
        meses = scan.nextInt();
        
        saldo = valorIni;
        for(int i=0; i<meses; i++){
            saldo += valorInvest;
            saldo *= (1+juros);
        }
        
        lucro = saldo - valorIni - (valorInvest*meses);
        System.out.printf("Você obteve um lucro de R$%.2f", lucro);
    }
}
