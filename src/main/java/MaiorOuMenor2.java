import java.util.Scanner;
//@author jeanc

/*
receber três inteiros e dizer qual deles é o maior e qual o menor.
segunda solução.
*/
public class MaiorOuMenor2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, z, maior, menor;
        
        System.out.println("Insira três numeros inteiros: ");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        
        maior = x;
        menor = x;
        if(y>maior){
            maior = y;
        }
        if(z>maior){
            maior = z;
        }
        if(y<menor){
            menor = y;
        }
        if(z<menor){
            menor = z;
        }
        
        System.out.printf("\nMaior: %d\nMenor: %d\n", maior, menor);
        scan.close();
    }
}
