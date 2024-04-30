import java.util.Scanner;
//@author jeanc
//Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, comprimento e área desta.
public class RaioCircunferencia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double raio, diametro, comprimento, area;
        double pi = 3.14;
        
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextFloat();
        
        diametro = 2*raio;
        comprimento = 2*pi*raio;
        area = pi * Math.pow(raio, 2);
        
        System.out.printf("\nDiametro: %.2f\n", diametro);
        System.out.printf("Comprimento: %.2f\n", comprimento);
        System.out.printf("Área: %.2f\n", area);
    }
}
