import java.util.Random;
import java.util.Scanner;
//@author jeanc

public class NumerosAleatorios {
    public static void main(String[] args){
        int numAleatorio, x;
        Scanner scan = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        numAleatorio = randomGenerator.nextInt(10)+1;
        
        System.out.println("Qual a sua aposta??\nDigite um número de 0 a 10: ");
        x = scan.nextInt();
        
        if(x==numAleatorio){
            System.out.printf("Número sorteado: %d\nParabéns, você ganhou na megasena!!", numAleatorio);
        }else{
            System.out.printf("Número sorteado: %d\nNão foi dessa vez.", numAleatorio);
        }
    }
}
