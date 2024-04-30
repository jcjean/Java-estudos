import java.util.Scanner;
//@author jeanc
/*
receber três inteiros e dizer qual deles é o maior e qual o menor.
Primeira solução.
*/

public class MaiorOuMenor1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=0, y=0, z=0, maior=0, menor=0;
        System.out.println("Digite o primeiro número: ");
        x = scan.nextInt();
        
        System.out.println("Digite o segundo número: ");
        y = scan.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        z = scan.nextInt();
        
        if(x==y && y==z){
            System.out.println("Todos os números são iguais!");
        }else if(x>y && x>z){
                maior = x;
                if(y>z){
                    menor = z;
                }else{
                    menor = y;
                }
                System.out.printf("Maior: %d\nMenor: %d\n", maior, menor);
            }else if(y>z && y>x){
                maior = y;
                if(x>z){
                    menor = z;
                }else{ 
                    menor = x;
                }
                System.out.printf("Maior: %d\nMenor: %d\n", maior, menor);
            }else if(z>x && z>y){
                maior = z;
                if(x>y){
                    menor = y;
                }else{
                    menor = x;
                }
                System.out.printf("Maior: %d\nMenor: %d\n", maior, menor);
            }
        scan.close();
    }
}
