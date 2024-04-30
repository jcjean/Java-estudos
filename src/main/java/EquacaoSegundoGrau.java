import java.util.Scanner;
//@author jeanc

public class EquacaoSegundoGrau {
    public static void main(String[] args){
        //programa teste que resolve uma equação de segundo grau.
        float a, b, c, delta, sqrtDelta, raiz1, raiz2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Equação do 2° grau: ax^2 + bx + cx = 0\n");
        System.out.print("Digite o valor de a: ");
        a = scan.nextFloat();
        System.out.print("Digite o valor de b: ");
        b = scan.nextFloat();
        System.out.print("Digite o valor de c: ");
        c = scan.nextFloat();
        
        if(a!=0){
            delta = (float)Math.pow(b, 2)-(4*a*c);
            sqrtDelta = (float)Math.sqrt(delta);
            
            if(delta>=0){
                raiz1 = ((-1)*b + sqrtDelta)/(2*a);
                raiz2 = ((-1)*b - sqrtDelta)/(2*a);
                System.out.printf("Raizes: %.2f e %.2f", raiz1, raiz2);
            }else{
                delta = -delta;
                sqrtDelta = (float)Math.sqrt(delta);
                System.out.print("\nNão possue raízes reais.\n");
                System.out.printf("Raiz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtDelta)/(2*a));
                System.out.printf("Raiz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtDelta)/(2*a));
            }
        }else{
            System.out.print("\nValor de 'a' igual a 0. Programa encerrado!\n");
        }
    }
}
