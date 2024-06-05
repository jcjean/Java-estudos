package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
//aplicativo que calcula as raízes de uma equação do 2o grau: ax² + bx + c=0
public class eqSegundoGrau {
    public static boolean isZero(float num){
        return num==0;
    }
    
    public static boolean isPositive(float num){
        return num>=0;
    }
    
    public static double delta(double a, double b, double c){
        double delta = (Math.pow(b, 2) - 4*a*c);
        return delta;
    }
    
    public static void main(String[] args){
        float a, b, c, delta, raiz1, raiz2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de 'a': ");
        a = scan.nextFloat();
        
        System.out.println("Digite o valor de 'b': ");
        b = scan.nextFloat();
        
        System.out.println("Digite o valor de 'c': ");
        c = scan.nextFloat();
        
        delta = (float) delta(a, b, c);
        if(isZero(a)){
            System.out.println("O valor de 'a' á igual a 0. Programa encerrado!\n");
        }else if(isPositive((float) delta(a, b, c))){
            //raiz real
            raiz1 = (float) (((-1)*b + Math.sqrt(delta))/(2*a));
            raiz2 = (float) (((-1)*b - Math.sqrt(delta))/(2*a));
            System.out.printf("Raizes: %.2f e %.2f", raiz1, raiz2);
        }else{
            //raiz complexa
            delta = -delta;
            System.out.println("Não possue raízes reais.\n");
            System.out.printf("Raiz 1: %.2f + i.%.2f\n", (-b)/(2*a), Math.sqrt(delta)/(2*a));
            System.out.printf("Raiz 2: %.2f - i.%.2f\n", (-b)/(2*a), Math.sqrt(delta)/(2*a));
        }
        
    }
}
