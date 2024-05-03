import java.util.Scanner;
//@author jeanc
/*
Programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
Ao final, todos os patinhos voltam.
*/
public class OsPatinhos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, aux;
        
        System.out.println("Digite o número de patinhos: ");
        n = scan.nextInt();
        aux = n;
        
        while(n>0){
            System.out.printf("%d patinhos foram passear\nAlém das montanhas para brincar\nA mamãe gritou: Quá, quá, quá, quá\nMas só %d patinhos voltaram de lá.\n\n", n, --n);
        }
        System.out.printf("A mamãe patinha foi procurar\nAlém das montanhas\nNa beira do mar\nA mamãe gritou: Quá, quá, quá, quá\nE os %d patinhos voltaram de lá.\n", aux);
    }
}
