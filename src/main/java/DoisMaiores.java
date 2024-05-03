import java.util.Scanner;
/**
 *
 * @author jeanc
 */
//solicita 10 números ao usuário, através de um laço while, e mostra os dois maiores.
public class DoisMaiores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, count=0, maior1=0, maior2=0;
        
        while(count<10){
            System.out.print("Insira um numero: ");
            num = scan.nextInt();
            
            if(num>maior1){
                maior2 = maior1;
                maior1 = num;
            }else if(num>maior2 && num!=maior1){
                maior2=num;
            }
            count++;
        }
        System.out.printf("Os maiores números digitados foram: %d e %d", maior1, maior2);
    }
}
